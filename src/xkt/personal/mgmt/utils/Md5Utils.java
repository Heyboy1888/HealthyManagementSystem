package xkt.personal.mgmt.utils;

/**
 * md5工具类
 * @author yusheng
 * @since 2018-2-27
 */
public class Md5Utils {
	/**
	 * 签名
	 * @param orgin 待签名的原文
	 * @return
	 */
	public static String signature(String orgin) {
		return DigestUtils.md5ToHex(orgin);
	}
	
	/**
	 * 签名
	 * @param orgin 待签名的原文
	 * @param key 通信双方约定的秘钥
	 * @return
	 */
	public static String signature(String orgin, String key) {
		return DigestUtils.md5ToHex(orgin, key);
	}
	
	public static void main(String[] args) {
		System.out.println(signature("123456"));
	}
}
