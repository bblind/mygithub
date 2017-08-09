package com.ddjf.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ddjf.dao.IPostDao;
import com.ddjf.dao.IReplyDao;
import com.ddjf.service.IPostService;

/**
 * 
 * 构建组：大道金服科技部
 * 作者:caihewei
 * 日期:2017年8月4日下午3:12:40
 * 功能说明：
 * 
 */
@Controller
public class PostController {

	@Autowired
	private IPostService iPostService;

	@Autowired
	private IPostDao iPostDao;
	
	@Autowired
	private IReplyDao iReplyDao;
	
	@Autowired
	private HttpServletRequest request;

	@RequestMapping("/post")
	public String post(@RequestParam("title") String title,
			@RequestParam("content") String content,
			HttpServletResponse response) {
		iPostService.doPost(request.getSession(), title, content);
		return "redirect:/tosuccess";
	}

	@RequestMapping(value="/detail",method=RequestMethod.GET)
	public String detail(@RequestParam("pId") int pId,Model model){
		model.addAttribute("post", iPostDao.selectById(pId));
		model.addAttribute("replys", iReplyDao.selectByPID(pId));
		return "de";
	}
}
