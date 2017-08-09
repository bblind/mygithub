/**
 * 
 * 构建组：大道金服科技部
 * 作者:caihewei
 * 邮箱:caihewei@ddjf.com.cn
 * 日期:2017年8月3日下午2:07:45
 * 版权：大道金服
 * 
 */
package com.ddjf.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import javax.servlet.http.HttpServletRequest;

import com.alibaba.fastjson.JSONObject;

/**
 * 
 * 构建组：大道金服科技部
 * 作者:caihewei
 * 日期:2017年8月3日下午2:07:45
 * 功能说明：
 * 
 */
public class IPUtil {

	/**
	 * 
	 * 构建组：大道金服科技部
	 * 作者:caihewei
	 * 日期:2017年8月3日下午2:08:12
	 * 参数说明：@param request
	 * 参数说明：@return
	 * 功能说明：获取客户端IP地址，针对Nginx等反代作处理 
	 */
	public static String getIP(HttpServletRequest request) {
		String ip = request.getHeader("x-forwarded-for");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("X-Real-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		return ip.equals("0:0:0:0:0:0:0:1") ? "127.0.0.1" : ip;
	}

	/**
	 * 
	 * 构建组：大道金服科技部
	 * 作者:caihewei
	 * 日期:2017年8月3日下午2:52:32
	 * 参数说明：@param ip
	 * 参数说明：@return
	 * 参数说明：@throws MalformedURLException
	 * 功能说明：根据ip，调用淘宝接口获得地址
	 */
	public static String location(String ip) throws MalformedURLException {
		URL url = new URL("http://ip.taobao.com/service/getIpInfo.php?ip=" + ip);
		/**//** 输入流 */
		BufferedReader in = null;
		StringBuffer sb = new StringBuffer();
		try {
			in = new BufferedReader(new InputStreamReader(url.openStream(),
					"UTF-8"));
			String str = null;
			while ((str = in.readLine()) != null) {
				sb.append(str);
			}
		} catch (Exception ex) {

		} finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (IOException ex) {
			}
		}
		JSONObject j = JSONObject.parseObject(sb.toString());
		if (j.getInteger("code").equals(0)) {
			JSONObject data = j.getJSONObject("data");
			return new String(data.getString("country") + "-"
					+ data.getString("region") + "-" + data.getString("city"));
		}
		return "";
	}

//	public static void main(String[] args) {
//		System.out.println(new String("\u534e\u5357-\u534e\u5357"));
//	}
}
