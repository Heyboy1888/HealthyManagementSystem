package xkt.personal.mgmt.utils;

import org.apache.commons.lang.StringUtils;

/**
 * 身份证脱敏工具
 * 
 * @author Hanson
 *
 */
public class CardCodeUtil {

	public static String desensitizedIdNumber(String str) {
		if (!StringUtils.isEmpty(str)) {
			if (str.length() == 15) {
				str = str.replaceAll("(\\w{6})\\w*(\\w{3})",
						"$1******$2");
			}
			if (str.length() == 18) {
				str = str.replaceAll("(\\w{6})\\w*(\\w{4})",
						"$1********$2");
			}
		}
		return str;
	}

}
