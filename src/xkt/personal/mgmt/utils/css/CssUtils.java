package xkt.personal.mgmt.utils.css;

import java.awt.Color;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFPalette;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @version 0.0.1
 * @since 0.0.1
 * @author Shaun Chyxion <br>
 * chyxion@163.com <br>
 * Oct 24, 2014 4:29:26 PM
 */
@SuppressWarnings("all")
public class CssUtils {
	private static final Logger log = LoggerFactory.getLogger(CssUtils.class);
	// matches #rgb
	private static final String COLOR_PATTERN_VALUE_SHORT = 
			"^(#(?:[a-f]|\\d){3})$";
	// matches #rrggbb
	private static final String COLOR_PATTERN_VALUE_LONG = 
			"^(#(?:[a-f]|\\d{2}){3})$";
	// matches #rgb(r, g, b)
	private static final String COLOR_PATTERN_RGB = 
			"^(rgb\\s*\\(\\s*(.+)\\s*,\\s*(.+)\\s*,\\s*(.+)\\s*\\))$";
	// color name -> POI Color
	private static Map<String, HSSFColor> colors = HSSFColor.getIndexHash();
	// static init
	static {
		
		/*for (Map.Entry<Integer, HSSFColor> color : HSSFColor.getIndexHash().entrySet()) {
			colors.put(colorName(color.getValue().getClass()), color.getValue());
		}
		Hashtable<Integer,HSSFColor> table = HSSFColor.getIndexHash();
		
		// light gray
		HSSFColor color = colors.get(colorName(HSSFColor.GREY_25_PERCENT.class));
		colors.put("lightgray", color);
		colors.put("lightgrey", color);
		// silver
		colors.put("silver", colors.get(colorName(HSSFColor.GREY_40_PERCENT.class)));
		// darkgray
		color = colors.get(colorName(HSSFColor.GREY_50_PERCENT.class));
		colors.put("darkgray", color);
		colors.put("darkgrey", color);
		// gray
		color = colors.get(colorName(HSSFColor.GREY_80_PERCENT.class));
		colors.put("gray", color);
		colors.put("grey", color);*/
	}

	/**
	 * get color name
	 * @param color HSSFColor
	 * @return color name
	 */
    private static String colorName(Class<? extends HSSFColor> color) {
	    return color.getSimpleName().replace("_", "").toLowerCase();
    }
   
    /**
     * get int value of string
     * @param strValue string value
     * @return int value
     */
    public static int getInt(String strValue) {
    	int value = 0;
    	if (StringUtils.isNotBlank(strValue)) {
    		Matcher m = Pattern.compile("^(\\d+)(?:\\w+|%)?$").matcher(strValue);
    		if (m.find()) {
    			value = Integer.parseInt(m.group(1));
    		}
    	}
    	return value;
    }
   
    /**
     * check number string 
     * @param strValue string
     * @return true if string is number
     */
    public static boolean isNum(String strValue) {
    	return StringUtils.isNotBlank(strValue) && strValue.matches("^\\d+(\\w+|%)?$");
    }
   
    /**
     * process color
     * @param color color to process
     * @return color after process
     */
    public static String processColor(String color) {
    	log.info("Process Color [{}].", color);
    	/*String colorRtn = null;
    	if (StringUtils.isNotBlank(color)) {
    		HSSFColor poiColor = null;
    		// #rgb -> #rrggbb
    		if (color.matches(COLOR_PATTERN_VALUE_SHORT)) {
    			log.debug("Short Hex Color [{}] Found.", color);
    			StringBuffer sbColor = new StringBuffer();
    			Matcher m = Pattern.compile("([a-f]|\\d)").matcher(color);
    			while (m.find()) {
    				m.appendReplacement(sbColor, "$1$1");
    			}
    			colorRtn = sbColor.toString();
    			log.debug("Translate Short Hex Color [{}] To [{}].", color, colorRtn);
    		}
    		// #rrggbb
    		else if (color.matches(COLOR_PATTERN_VALUE_LONG)) {
    			colorRtn = color;
    			log.debug("Hex Color [{}] Found, Return.", color);
    		}
    		// rgb(r, g, b)
    		else if (color.matches(COLOR_PATTERN_RGB)) {
    			Matcher m = Pattern.compile(COLOR_PATTERN_RGB).matcher(color);
    			if (m.matches()) {
    				log.debug("RGB Color [{}] Found.", color);
    				colorRtn = convertColor(calcColorValue(m.group(2)),
    							calcColorValue(m.group(3)),
    							calcColorValue(m.group(4)));
    				log.debug("Translate RGB Color [{}] To Hex [{}].", color, colorRtn);
    			}
    		}
    		// color name, red, green, ...
    		else if ((poiColor = getColor(color)) != null) {
    			log.debug("Color Name [{}] Found.", color);
    			short[] t = poiColor.getTriplet();
    			colorRtn = convertColor(t[0], t[1], t[2]);
    			log.debug("Translate Color Name [{}] To Hex [{}].", color, colorRtn);
    		}
    	}*/
    	return color;
    }
    
    /**
     * parse color
     * @param workBook work book
     * @param color string color
     * @return HSSFColor 
     */
    public static HSSFColor parseColor(HSSFWorkbook workBook, String color) {
    	HSSFColor poiColor = null;
    	HSSFPalette palette = workBook.getCustomPalette();
    	palette.setColorAtIndex((short)63,(byte)252,(byte)228,(byte)214);
    	palette.setColorAtIndex((short)62,(byte)221,(byte)235,(byte)246);
    	palette.setColorAtIndex((short)61,(byte)226,(byte)239,(byte)218);
    	if (StringUtils.isNotBlank(color)) {
    		Color awtColor = Color.decode(color);
    		if (awtColor != null) {
    			int r = awtColor.getRed();
    			int g = awtColor.getGreen();
    			int b = awtColor.getBlue();
    			
    			poiColor = palette.findColor((byte) r, (byte) g, (byte) b);
    			if (poiColor == null) {
    				poiColor = palette.findSimilarColor(r, g, b);
    			}
    		}
    	}
    	return poiColor;
    }
    
    public static short parseMyColor(HSSFWorkbook workBook, String color) {
    	HSSFColor poiColor = null;
    	short i=10;
    	if (StringUtils.isNotBlank(color)) {
    		Color awtColor = Color.decode(color);
    		if (awtColor != null) {
    			int r = awtColor.getRed();
    			int g = awtColor.getGreen();
    			int b = awtColor.getBlue();
    			HSSFPalette palette = workBook.getCustomPalette();
    			palette.setColorAtIndex(HSSFColor.LIME.index, (byte)r, (byte)g, (byte)b);
    			
    		}
    	}
    	return HSSFColor.LIME.index;
    }

    // --
    // private methods

    private static HSSFColor getColor(String color) {
    	return colors.get(color.replace("_", ""));
    }

    private static String convertColor(int r, int g, int b) {
    	return String.format("#%02x%02x%02x", r, g, b);
    }

    private static int calcColorValue(String color) {
    	int rtn = 0;
    	// matches 64 or 64%
		Matcher m = Pattern.compile("^(\\d*\\.?\\d+)\\s*(%)?$").matcher(color);
		if (m.matches()) {
			// % not found
			if (m.group(2) == null) {
				rtn = Math.round(Float.parseFloat(m.group(1))) % 256;
			}
			else {
				rtn = Math.round(Float.parseFloat(m.group(1)) * 255 / 100) % 256;
			}
		}
		return rtn;
    }
}

