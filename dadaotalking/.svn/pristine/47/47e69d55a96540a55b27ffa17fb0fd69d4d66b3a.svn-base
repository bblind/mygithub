/**
 * 
 * 构建组：大道金服科技部
 * 作者:caihewei
 * 邮箱:caihewei@ddjf.com.cn
 * 日期:2017年8月5日下午6:29:33
 * 版权：大道金服
 * 
 */
package com.ddjf.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ddjf.service.IReplyService;

/**
 * 
 * 构建组：大道金服科技部
 * 作者:caihewei
 * 日期:2017年8月5日下午6:29:33
 * 功能说明：
 * 
 */
@Controller
public class ReplyController {

	@Autowired
	private IReplyService iReplyService;
	
	@RequestMapping("/doReply")
	public String reply(HttpSession session, @RequestParam("content") String content,@RequestParam("pId") int pId){
		iReplyService.doReply(session, content, pId);
		return "redirect:/de";
	}
}
