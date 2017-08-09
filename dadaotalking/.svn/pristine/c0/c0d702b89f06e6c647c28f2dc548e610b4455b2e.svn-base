/**
 * 
 * 构建组：大道金服科技部
 * 作者:caihewei
 * 邮箱:caihewei@ddjf.com.cn
 * 日期:2017年7月31日下午6:55:37
 * 版权：大道金服
 * 
 */
package com.ddjf.util;

import java.math.BigInteger;
import java.security.MessageDigest;

/**
 * 
 * 构建组：大道金服科技部
 * 作者:caihewei
 * 日期:2017年7月31日下午6:55:37
 * 功能说明：
 * 
 */
public class PasswordUtil {

	/**
	 * 
	 * 构建组：大道金服科技部
	 * 作者:caihewei
	 * 日期:2017年8月1日上午11:20:37
	 * 参数说明：@param pwd
	 * 参数说明：@param preKey
	 * 参数说明：@return
	 * 功能说明：登陆时加密，校验密码
	 */
	public static String encrypt(String pwd,String preKey) {
		BigInteger bigInteger = null;
		String prePWD = preKey.substring(0, 1) + pwd + preKey.substring(1);
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] inputData = prePWD.getBytes();
			md.update(inputData);
			bigInteger = new BigInteger(md.digest());
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("MD5加密后:" + bigInteger.toString(16));
		return bigInteger.toString(16);
	}
	
}
