/**
 * 
 * 构建组：大道金服科技部
 * 作者:caihewei
 * 邮箱:caihewei@ddjf.com.cn
 * 日期:2017年8月1日上午11:09:26
 * 版权：大道金服
 * 
 */
package com.ddjf.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ddjf.service.IUserService;
import com.ddjf.util.RandomUtil;

/**
 * 
 * 构建组：大道金服科技部
 * 作者:caihewei
 * 日期:2017年8月1日上午11:09:26
 * 功能说明：
 * 
 */
@Controller
public class PageController {

	@Autowired
	IUserService iUserService;

	@RequestMapping("")
	public String homePage() {
		return "index";
	}

	@RequestMapping("/tosuccess")
	public String to(HttpSession session){
		if(session.getAttribute("username")==null){
			return "index";
		}
		return "success";
	}
	@RequestMapping("/postPage")
	public String postPage(HttpSession session){
		if(session.getAttribute("username")==null){
			return "index";
		}
		return "postPage";
	}
	@RequestMapping("/loginPage")
	public String loginPage(HttpServletRequest req,Model mv) {
		String username = "";
		String p = "";
		//存入token，重复提交表单验证
		String token = RandomUtil.preKey()[1];
		req.getSession().setAttribute("token", token);
//		mv.addAttribute("token",token);
		//获取当前站点的所有Cookie
		Cookie[] cookies = req.getCookies();
		for (int i = 0; i < cookies.length; i++) {//对cookies中的数据进行遍历，找到用户名、密码的数据
//			System.out.println(cookies[i].getName() + ":  "
//					+ cookies[i].getValue());
			if ("name".equals(cookies[i].getName())) {
				username = cookies[i].getValue();
				mv.addAttribute("username", username);
			} else if ("password".equals(cookies[i].getName())) {
				p = cookies[i].getValue();
			}
		}
		if (iUserService.login(username, p)) {
			return "success";
		}

		return "loginPage";
	}

}
