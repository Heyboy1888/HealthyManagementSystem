package xkt.personal.mgmt.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	
	
	public static String date2Str(Date date){
		SimpleDateFormat formart = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return formart.format(date);
	}
}
