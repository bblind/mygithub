/**
 * 
 * 构建组：大道金服科技部
 * 作者:caihewei
 * 邮箱:caihewei@ddjf.com.cn
 * 日期:2017年7月29日下午5:05:23
 * 版权：大道金服
 * 
 */
package com.ddjf.service;


/**
 * 
 * 构建组：大道金服科技部
 * 作者:caihewei
 * 日期:2017年7月29日下午5:05:23
 * 功能说明：
 * 
 */

public interface IUserService {

	public boolean login(String name,String pwd);
	public boolean registry(String name,String pwd);
}
