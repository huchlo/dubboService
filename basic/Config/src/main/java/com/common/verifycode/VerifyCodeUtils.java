package com.common.verifycode;

/**
 * @ClassName: VerifyCodeUtils
 * @Description: 短信验证码生成工具类
 * @author  huangzhix
 * @date    2016-11-16 下午5:31:29
 * @version V1.0 
 *
 */
public class VerifyCodeUtils {

	/**
	 * 
	 * @Title: getNum4VerifyCode   
	 * @Description: 随机生成4位纯数字验证码
	 * @author  huangzhix
	 * @date    2016-11-16 下午5:34:18
	 * @return
	 */
	public static String getNum4VerifyCode() {
		int random = (int) ((Math.random() * 9 + 1) * 1000);
		return String.valueOf(random);
	}

	public static void main(String[] args) {
		System.out.printf(getNum4VerifyCode());
	}
}
