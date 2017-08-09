/**
 * 
 * 构建组：大道金服科技部
 * 作者:caihewei
 * 邮箱:caihewei@ddjf.com.cn
 * 日期:2017年7月31日下午7:04:29
 * 版权：大道金服
 * 
 */
package com.ddjf.util;

/**
 * 
 * 构建组：大道金服科技部
 * 作者:caihewei
 * 日期:2017年7月31日下午7:04:29
 * 功能说明：
 * 
 */
public class RandomUtil {
	private final static String AZ09 = "01234566789abcdefghijklmnopqrstuvwxyz";

	public static String[] preKey() {
		String[] preKey = {
				String.valueOf(AZ09.charAt((int) (Math.random() * 36))),
				String.valueOf(AZ09.charAt((int) (Math.random() * 36)))
						+ String.valueOf(AZ09.charAt((int) (Math.random() * 36))) };
		return preKey;
	}
}
