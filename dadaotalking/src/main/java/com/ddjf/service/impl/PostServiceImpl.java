/**
 * 
 * 构建组：大道金服科技部
 * 作者:caihewei
 * 邮箱:caihewei@ddjf.com.cn
 * 日期:2017年8月4日下午12:45:46
 * 版权：大道金服
 * 
 */
package com.ddjf.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.ddjf.dao.IPostDao;
import com.ddjf.dao.IReplyDao;
import com.ddjf.pojo.Post;
import com.ddjf.pojo.Reply;
import com.ddjf.service.IPostService;

/**
 * 
 * 构建组：大道金服科技部
 * 作者:caihewei
 * 日期:2017年8月4日下午12:45:46
 * 功能说明：
 * 
 */
@Service
public class PostServiceImpl implements IPostService {

	@Resource
	private IPostDao iPostDao;

	@Resource
	private IReplyDao iReplyDao;

	/**
	 * 构建组：大道金服科技部
	 * 作者:caihewei
	 * 日期:2017年8月4日下午12:45:46
	 * 参数说明：@param title
	 * 参数说明：@param content
	 * 参数说明：@return
	 * 功能说明：发帖
	 */
	@Override
	public boolean doPost(HttpSession session, String title, String content) {
		// TODO Auto-generated method stub
		Post post = new Post();
		post.setTitle(title);
		post.setContent(content);
		post.setDate(new Date());
		post.setUsername((String) session.getAttribute("username"));
		if (iPostDao.insert(post) > 0) {
			return true;
		}
		return false;
	}

	/**
	 * 构建组：大道金服科技部
	 * 作者:caihewei
	 * 日期:2017年8月4日下午5:21:55
	 * 参数说明：@return
	 * 功能说明：首先查看所有帖子
	 */
	@Override
	public List<Post> allPost(int page) {
		// TODO Auto-generated method stub
		List<Post> list = iPostDao.selectAll((page - 1) * 20, 20);
		if(list == null){
			return new ArrayList<Post>();
		}
		for (Post p : list) {
			List<Reply> replyList = iReplyDao.selectByPID(p.getId());
			if (replyList == null) {
				p.setList(new ArrayList<Reply>());
			}
			p.setList(replyList);
		}
		return list;
	}

	/**
	 * 构建组：大道金服科技部
	 * 作者:caihewei
	 * 日期:2017年8月4日下午5:30:34
	 * 参数说明：@param title
	 * 参数说明：@return
	 * 功能说明：查询帖子
	 */
	@Override
	public List<Post> searchPost(String title) {
		// TODO Auto-generated method stub
		List<Post> list = iPostDao.selectByTitle("%" + title + "%");
		for (Post p : list) {
			p.setList(iReplyDao.selectByPID(p.getId()));
		}
		return list;
	}

}
