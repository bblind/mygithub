/**
 * 
 * 构建组：大道金服科技部
 * 作者:caihewei
 * 邮箱:caihewei@ddjf.com.cn
 * 日期:2017年8月4日上午11:44:12
 * 版权：大道金服
 * 
 */
package com.ddjf.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.ddjf.pojo.Post;

/**
 * 
 * 构建组：大道金服科技部
 * 作者:caihewei
 * 日期:2017年8月4日上午11:44:12
 * 功能说明：
 * 
 */
public interface IPostService {

	boolean doPost(HttpSession session, String title,String content);
	
	List<Post> allPost(int page);
	List<Post> searchPost(String title);
}
