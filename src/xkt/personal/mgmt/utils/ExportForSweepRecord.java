package xkt.personal.mgmt.utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import xkt.personal.mgmt.web.vo.TCHealthCodeApplyVo;

public class ExportForSweepRecord {

	
public static  InputStream createExl(List<TCHealthCodeApplyVo> list) {
		
		InputStream inputStream =null;
        // 第一步，创建一个webbook，对应一个Excel文件  
         
        XSSFWorkbook workbook =   new  XSSFWorkbook();
        XSSFSheet xssfSheet = workbook.createSheet();
        //创建行
        XSSFRow xssfRow;
        //创建列，即单元格Cell
        XSSFCell xssfCell;
        //把List里面的数据写到excel中
       
        //输入表头
        xssfRow = xssfSheet.createRow(0);
        //创建每个单元格Cell，即列的数据
        String[] tatil={"记录序号","被扫人员姓名","被扫人员身份证","被扫人员手机号码","被扫码日期","社区扫码人姓名","社区扫码人手机号码","社区","小区"};
        for (int j=0;j<tatil.length;j++) {
            xssfCell = xssfRow.createCell(j); //创建单元格
            xssfCell.setCellValue(tatil[j]); //设置单元格内容
        }
        
        //输出内容
        for (int i=1;i<list.size()+1;i++) { 
        	xssfRow = xssfSheet.createRow(i);
        	TCHealthCodeApplyVo vo = list.get(i-1);
        	xssfCell = xssfRow.createCell(0); //创建单元格
            xssfCell.setCellValue(vo.getUuid()); //设置单元格内容
            xssfCell = xssfRow.createCell(1); //创建单元格
            xssfCell.setCellValue(vo.getUserName()); //设置单元格内容
            xssfCell = xssfRow.createCell(2); //创建单元格
            xssfCell.setCellValue(vo.getCertCode()); //设置单元格内容
            xssfCell = xssfRow.createCell(3); //创建单元格
            xssfCell.setCellValue(vo.getPhone()); //设置单元格内容
            xssfCell = xssfRow.createCell(4); //创建单元格
            xssfCell.setCellValue(vo.getCreateTime()); //设置单元格内容
            xssfCell = xssfRow.createCell(5); //创建单元格
            xssfCell.setCellValue(vo.getCheckPersonName()); //设置单元格内容
            xssfCell = xssfRow.createCell(6); //创建单元格
            xssfCell.setCellValue(vo.getCheckPerson()); //设置单元格内容
            xssfCell = xssfRow.createCell(7); //创建单元格
            xssfCell.setCellValue(vo.getCurrentCommunity()); //设置单元格内容
            xssfCell = xssfRow.createCell(8); //创建单元格
            xssfCell.setCellValue(vo.getHousingName()); //设置单元格内容
        }
//	                FileOutputStream fout = new FileOutputStream("C:/work/study/test.xlsx");  
//	                workbook.write(fout);  
        try{
            //临时缓冲区
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            //创建临时文件
            workbook.write(out);
            byte [] bookByteAry = out.toByteArray();
            inputStream = new ByteArrayInputStream(bookByteAry);
        }
        catch (Exception e){
            e.printStackTrace();
        }


        return inputStream;
	          
	          
	    }  
}
