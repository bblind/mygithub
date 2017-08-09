/**
 * 
 * 构建组：大道金服科技部
 * 作者:caihewei
 * 邮箱:caihewei@ddjf.com.cn
 * 日期:2017年7月29日下午5:03:12
 * 版权：大道金服
 * 
 */
package com.ddjf.pojo;


/**
 * 
 * 构建组：大道金服科技部
 * 作者:caihewei
 * 日期:2017年7月29日下午5:03:12
 * 功能说明：
 * 
 */
public class User {

	private Integer id;

	private String userName;

	private String password;

	private String preKey;

	private Integer failedTimes = 0 ;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName == null ? null : userName.trim();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	/**
	 * 获取属性方法
	 * @return the preKey
	 */
	public String getPreKey() {
		return preKey;
	}

	/**
	 * 设置属性方法
	 * @param preKey the preKey to set
	 */
	public void setPreKey(String preKey) {
		this.preKey = preKey == null ? null : preKey.trim();
	}

	/**
	 * 获取属性方法
	 * @return the failedTimes
	 */
	public Integer getFailedTimes() {
		return failedTimes;
	}

	/**
	 * 设置属性方法
	 * @param failedTimes the failedTimes to set
	 */
	public void setFailedTimes(Integer failedTimes) {
		this.failedTimes = failedTimes;
	}


}
