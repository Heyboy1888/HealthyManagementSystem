package xkt.personal.mgmt.utils;


import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.util.CellRangeAddress;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import xkt.personal.mgmt.utils.css.CssApplier;
import xkt.personal.mgmt.utils.css.support.AlignApplier;
import xkt.personal.mgmt.utils.css.support.BackgroundApplier;
import xkt.personal.mgmt.utils.css.support.BorderApplier;
import xkt.personal.mgmt.utils.css.support.HeightApplier;
import xkt.personal.mgmt.utils.css.support.TextApplier;
import xkt.personal.mgmt.utils.css.support.WidthApplier;


public class TableToXls {
	private static final Logger log = 
			LoggerFactory.getLogger(TableToXls.class);
	private static final List<CssApplier> STYLE_APPLIERS = 
		new LinkedList<CssApplier>();
	// static init
	static {
		STYLE_APPLIERS.add(new AlignApplier());
		STYLE_APPLIERS.add(new BackgroundApplier());
		STYLE_APPLIERS.add(new WidthApplier());
		STYLE_APPLIERS.add(new HeightApplier());
		STYLE_APPLIERS.add(new BorderApplier());
		STYLE_APPLIERS.add(new TextApplier());
	}
	private HSSFWorkbook workBook = new HSSFWorkbook();
	private HSSFSheet sheet;
	private Map<String, Object> cellsOccupied = new HashMap<String, Object>();
	private Map<String,Object> heights = new HashMap<String, Object>();
	private Map<String, HSSFCellStyle> cellStyles = new HashMap<String, HSSFCellStyle>();
	private HSSFCellStyle defaultCellStyle;
	private int maxRow = 0;
	// init
	{
		sheet = workBook.createSheet();
		defaultCellStyle = workBook.createCellStyle();
		defaultCellStyle.setWrapText(true);
		defaultCellStyle.setAlignment(CellStyle.ALIGN_CENTER);
		defaultCellStyle.setVerticalAlignment(CellStyle.VERTICAL_CENTER);
		
		HSSFFont font = workBook.createFont();
		font.setFontName("宋体");
		defaultCellStyle.setFont(font);
		// border
		short black = new HSSFColor.BLACK().getIndex();
		short thin = CellStyle.BORDER_THIN;
		// top
		defaultCellStyle.setBorderTop(thin);
		defaultCellStyle.setTopBorderColor(black);
		// right
		defaultCellStyle.setBorderRight(thin);
		defaultCellStyle.setRightBorderColor(black);
		// bottom
		defaultCellStyle.setBorderBottom(thin);
		defaultCellStyle.setBottomBorderColor(black);
		// left
		defaultCellStyle.setBorderLeft(thin);
		defaultCellStyle.setLeftBorderColor(black);
		
		 
	}

	/**
	 * process html to xls
	 * @param html html char sequence 
	 * @return xls bytes
	 */
	public static byte[] process(CharSequence html) {
		ByteArrayOutputStream baos = null;
		try {
			baos = new ByteArrayOutputStream();
			process(html, baos);
			return baos.toByteArray();
		}
		finally {
			if (baos != null) {
				try {
					baos.close();
				}
				catch (IOException e) {
					log.warn("Close Byte Array Inpout Stream Error Caused.", e);
				}
			}
		}
	}

	/**
	 * process html to output stream
	 * @param html html char sequence 
	 * @param output output stream
	 */
	public static void process(CharSequence html, OutputStream output) {
		new TableToXls().doProcess(
			html instanceof String ? (String) html : html.toString(), output);
	}

	// --
	// private methods

	private void processTable(Element table) {
		int rowIndex = 0;
		if (maxRow > 0) {
			// blank row
			maxRow += 1;
			rowIndex = maxRow;
		}
		log.info("Interate Table Rows.");
		
		for (Element row : table.select("tr")) {
			boolean ifExistRowSpan = false;//当前行是否存在RowSnap
			log.info("Parse Table Row [{}]. Row Index [{}].", row, rowIndex);
			int colIndex = 0;
			int curMaxLen = 0;//当前行字符最长的的记录
			int curMaxRowSpan = 0;//当前行跨最大的RowSpan
			log.info("Interate Cols.");
			//取当前行最长字符，默认4个中文字符为一行
			for (Element td : row.select("td, th")) {
				String strRowSpan = td.attr("rowspan");
				if (StringUtils.isNotBlank(strRowSpan) && 
						StringUtils.isNumeric(strRowSpan)) {
					log.info("Found Row Span [{}].", strRowSpan);
					int rowSpan = Integer.parseInt(strRowSpan);
					if( rowSpan > curMaxRowSpan){
						curMaxRowSpan = rowSpan;
					}
					ifExistRowSpan = true;
				}else{
					curMaxRowSpan = 1;
				}
				if (!StringUtils.isBlank(td.text())
						&& td.text().length() > curMaxLen) {
					curMaxLen = td.text().length();
				}
			}
			//heights.put(String.valueOf(rowIndex), curMaxLen);
			for (int i = 1; i < curMaxRowSpan; i++) {
				if( !heights.containsKey(String.valueOf(rowIndex + i))){
					heights.put(String.valueOf(rowIndex + i), curMaxLen);
				}
			}
			boolean ifFirstRowSnap = false;//存在rowSpan时首次设置高度
			boolean ifFirst = false;//不存在rowSpan
			for (Element td : row.select("td, th")) {
				// skip occupied cell
				while (cellsOccupied.get(rowIndex + "_" + colIndex) != null) {
					log.info("Cell [{}][{}] Has Been Occupied, Skip.", rowIndex, colIndex);
					++colIndex;
				}
				log.info("Parse Col [{}], Col Index [{}].", td, colIndex);
				int rowSpan = 0;
				String strRowSpan = td.attr("rowspan");
				if (StringUtils.isNotBlank(strRowSpan) && 
						StringUtils.isNumeric(strRowSpan)) {
					log.info("Found Row Span [{}].", strRowSpan);
					rowSpan = Integer.parseInt(strRowSpan);
				}
				int colSpan = 0;
				String strColSpan = td.attr("colspan");
				if (StringUtils.isNotBlank(strColSpan) && 
						StringUtils.isNumeric(strColSpan)) {
					log.info("Found Col Span [{}].", strColSpan);
					colSpan = Integer.parseInt(strColSpan);
				}
				// col span & row span
				if (colSpan > 1 && rowSpan > 1) {
					spanRowAndCol(td, rowIndex, colIndex, rowSpan, colSpan);
					colIndex += colSpan;
				}
				// col span only
				else if (colSpan > 1) {
					spanCol(td, rowIndex, colIndex, colSpan);
					colIndex += colSpan;
				}
				// row span only
				else if (rowSpan > 1) {
					if( !ifFirstRowSnap){
						ifFirstRowSnap =true;
						spanRow(td, rowIndex, colIndex, rowSpan,true,curMaxLen);
					}else{
						spanRow(td, rowIndex, colIndex, rowSpan,false,curMaxLen);
					}
					++colIndex;
				}
				// no span
				else {
					
					if(NumberUtils.isNumber(td.text())){
						createCell(td, getOrCreateRow(rowIndex), colIndex).setCellValue((int)Double.parseDouble(td.text()));
			    		CellStyle cellStyle=getOrCreateRow(rowIndex).getCell(colIndex).getCellStyle();
			    		cellStyle.setDataFormat(HSSFDataFormat.getBuiltinFormat("0"));
			    		getOrCreateRow(rowIndex).getCell(colIndex).setCellStyle(cellStyle);
			    	}else{
			    		createCell(td, getOrCreateRow(rowIndex), colIndex).setCellValue(td.text());
			    	}
					if( !ifExistRowSpan && !ifFirst){
						ifFirst = true;
						int maxLen = curMaxLen;
		    			if( maxLen > 4 * 1.0){
							double allRows = Math.ceil(maxLen / 4.0);//需要跨几行
							short height = (short) ((255 * allRows));
							getOrCreateRow(rowIndex).setHeight(height);
		    			}
					}
					++colIndex;
				}
			}
			++rowIndex;
		}
	}

	private void doProcess(String html, OutputStream output) {
		for (Element table : Jsoup.parseBodyFragment(html).select("table")) {
	        processTable(table);
        }
		try {
			workBook.write(output);
		}
		catch (IOException e) {
			throw new IllegalStateException("Table To XLS, IO ERROR.", e);
		}
	}

	private void spanRow(Element td, int rowIndex, int colIndex, int rowSpan,
			boolean ifFirstRowSpan,int curMaxLen) {
    	log.info("Span Row , From Row [{}], Span [{}].", rowIndex, rowSpan);
    	mergeRegion(rowIndex, rowIndex + rowSpan - 1, colIndex, colIndex);
    	for (int i = 0; i < rowSpan; ++i) {
    		HSSFRow row = getOrCreateRow(rowIndex + i);
    		if( ifFirstRowSpan && !heights.containsKey(String.valueOf(rowIndex))){
    			int maxLen = curMaxLen;
    			if( maxLen > 4 * rowSpan){
					double allRows = Math.ceil(maxLen / 4.0);//需要跨几行
					short height = (short) ((255 * allRows)/(rowSpan * 1.0));
					row.setHeight(height);
    			}
    		}
    		createCell(td, row, colIndex);
    		cellsOccupied.put((rowIndex + i) + "_" + colIndex, true);
    	}
    	
    	if(NumberUtils.isNumber(td.text())){
    		getOrCreateRow(rowIndex).getCell(colIndex).setCellValue((int)Double.parseDouble(td.text()));
    		CellStyle cellStyle=getOrCreateRow(rowIndex).getCell(colIndex).getCellStyle();
    		cellStyle.setDataFormat(HSSFDataFormat.getBuiltinFormat("0"));
    		getOrCreateRow(rowIndex).getCell(colIndex).setCellStyle(cellStyle);
    	}else{
    		getOrCreateRow(rowIndex).getCell(colIndex).setCellValue(td.text());
    	}
    	
    	
    }

    private void spanCol(Element td, int rowIndex, int colIndex, int colSpan) {
    	log.info("Span Col, From Col [{}], Span [{}].", colIndex, colSpan);
    	mergeRegion(rowIndex, rowIndex, colIndex, colIndex + colSpan - 1);
    	HSSFRow row = getOrCreateRow(rowIndex);
    	for (int i = 0; i < colSpan; ++i) {
    		createCell(td, row, colIndex + i);
    	}
    	
    	if(NumberUtils.isNumber(td.text())){
    		row.getCell(colIndex).setCellValue((int)Double.parseDouble(td.text()));
    		CellStyle cellStyle=getOrCreateRow(rowIndex).getCell(colIndex).getCellStyle();
    		cellStyle.setDataFormat(HSSFDataFormat.getBuiltinFormat("0"));
    		getOrCreateRow(rowIndex).getCell(colIndex).setCellStyle(cellStyle);
    	}else{
    		row.getCell(colIndex).setCellValue(td.text());
    	}
    }

    private void spanRowAndCol(Element td, int rowIndex, int colIndex,
            int rowSpan, int colSpan) {
    	log.info("Span Row And Col, From Row [{}], Span [{}].", rowIndex, rowSpan);
    	log.info("From Col [{}], Span [{}].", colIndex, colSpan);
    	mergeRegion(rowIndex, rowIndex + rowSpan - 1, colIndex, colIndex + colSpan - 1);
    	for (int i = 0; i < rowSpan; ++i) {
    		HSSFRow row = getOrCreateRow(rowIndex + i);
    		for (int j = 0; j < colSpan; ++j) {
    			createCell(td, row, colIndex + j);
    			cellsOccupied.put((rowIndex + i) + "_" + (colIndex + j), true);
    		}
    	}
    	
    	if(NumberUtils.isNumber(td.text())){
    		getOrCreateRow(rowIndex).getCell(colIndex).setCellValue((int)Double.parseDouble(td.text()));
    		CellStyle cellStyle=getOrCreateRow(rowIndex).getCell(colIndex).getCellStyle();
    		cellStyle.setDataFormat(HSSFDataFormat.getBuiltinFormat("0"));
    		getOrCreateRow(rowIndex).getCell(colIndex).setCellStyle(cellStyle);
    	}else{
    		getOrCreateRow(rowIndex).getCell(colIndex).setCellValue(td.text());
    	}
    }

    private HSSFCell createCell(Element td, HSSFRow row, int colIndex) {
    	HSSFCell cell = row.getCell(colIndex);
    	if (cell == null) {
    		log.debug("Create Cell [{}][{}].", row.getRowNum(), colIndex);
    		cell = row.createCell(colIndex);
    	}
    	return applyStyle(td, cell);
    }

    private HSSFCell applyStyle(Element td, HSSFCell cell) {
    	String style = td.attr(CssApplier.STYLE);
    	HSSFCellStyle cellStyle = null;
    	if (StringUtils.isNotBlank(style)) {
    		if (cellStyles.size() < 4000) {
				Map<String, String> mapStyle = parseStyle(style.trim());
				Map<String, String> mapStyleParsed = new HashMap<String, String>();
				for (CssApplier applier : STYLE_APPLIERS) {
					mapStyleParsed.putAll(applier.parse(mapStyle));
				}
				cellStyle = cellStyles.get(styleStr(mapStyleParsed));
				if (cellStyle == null) {
					log.debug("No Cell Style Found In Cache, Parse New Style.");
					cellStyle = workBook.createCellStyle();
					cellStyle.cloneStyleFrom(defaultCellStyle);
					// cache style
					cellStyles.put(styleStr(mapStyleParsed), cellStyle);
				}
				for (CssApplier applier : STYLE_APPLIERS) {
					applier.apply(cell, cellStyle, mapStyleParsed);
				}
    		}
    		else {
    			log.info("Custom Cell Style Exceeds 4000, Could Not Create New Style, Use Default Style.");
    			cellStyle = defaultCellStyle;
    		}
    	}
    	else {
    		log.debug("Use Default Cell Style.");
    		cellStyle = defaultCellStyle;
    	}
    	cell.setCellStyle(cellStyle);
	    return cell;
    }

    private String styleStr(Map<String, String> style) {
    	log.debug("Build Style String, Style [{}].", style);
    	StringBuilder sbStyle = new StringBuilder();
    	Object[] keys = style.keySet().toArray();
    	Arrays.sort(keys);
    	for (Object key : keys) {
    		sbStyle.append(key)
    		.append(':')
    		.append(style.get(key))
    		.append(';');
        }
    	log.debug("Style String Result [{}].", sbStyle);
    	return sbStyle.toString();
    }

    private Map<String, String> parseStyle(String style) {
    	log.debug("Parse Style String [{}] To Map.", style);
    	Map<String, String> mapStyle = new HashMap<String, String>();
    	for (String s : style.split("\\s*;\\s*")) {
    		if (StringUtils.isNotBlank(s)) {
    			String[] ss = s.split("\\s*\\:\\s*");
    			if (ss.length == 2 &&
    					StringUtils.isNotBlank(ss[0]) &&
    					StringUtils.isNotBlank(ss[1])) {
    				String attrName = ss[0].toLowerCase();
    				String attrValue = ss[1];
    				// do not change font name
    				if (!CssApplier.FONT.equals(attrName) && 
    					!CssApplier.FONT_FAMILY.equals(attrName)) {
    					attrValue = attrValue.toLowerCase();
    				}
    				mapStyle.put(attrName, attrValue);
    			}
    		}
    	}
    	log.debug("Style Map Result [{}].", mapStyle);
	    return mapStyle;
    }

    private HSSFRow getOrCreateRow(int rowIndex) {
    	HSSFRow row = sheet.getRow(rowIndex);
    	if (row == null) {
    		log.info("Create New Row [{}].", rowIndex);
    		row = sheet.createRow(rowIndex);
    		if (rowIndex > maxRow) {
    			maxRow = rowIndex;
    		}
    	}
	    return row;
    }

    private void mergeRegion(int firstRow, int lastRow, int firstCol, int lastCol) {
    	log.debug("Merge Region, From Row [{}], To [{}].", firstRow, lastRow);
    	log.debug("From Col [{}], To [{}].", firstCol, lastCol);
    	sheet.addMergedRegion(new CellRangeAddress(firstRow, lastRow, firstCol, lastCol));
    }
}
