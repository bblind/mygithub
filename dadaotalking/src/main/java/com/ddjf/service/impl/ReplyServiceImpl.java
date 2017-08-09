/**
 * 
 * 构建组：大道金服科技部
 * 作者:caihewei
 * 邮箱:caihewei@ddjf.com.cn
 * 日期:2017年8月5日下午2:55:45
 * 版权：大道金服
 * 
 */
package com.ddjf.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.ddjf.dao.IReplyDao;
import com.ddjf.pojo.Reply;
import com.ddjf.service.IReplyService;

/**
 * 
 * 构建组：大道金服科技部
 * 作者:caihewei
 * 日期:2017年8月5日下午2:55:45
 * 功能说明：
 * 
 */
@Service
public class ReplyServiceImpl implements IReplyService {

	@Resource
	private IReplyDao iReplyDao;
	/**
	 * 构建组：大道金服科技部
	 * 作者:caihewei
	 * 日期:2017年8月4日下午5:34:39
	 * 参数说明：@param session
	 * 参数说明：@param content
	 * 参数说明：@param post
	 * 参数说明：@return
	 * 功能说明：评论
	 */
	@Override
	public boolean doReply(HttpSession session, String content, int pId) {
		// TODO Auto-generated method stub
		
		Reply reply = new Reply();
		reply.setContent(content);
		reply.setpId(pId);
		reply.setUsername((String)session.getAttribute("username"));
		reply.setDate(new SimpleDateFormat().format(new Date()));
		if(iReplyDao.insert(reply) > 0){
			return true;
		}
		return false;
	}
//	/**
//	 * 构建组：大道金服科技部
//	 * 作者:caihewei
//	 * 日期:2017年8月5日下午2:55:45
//	 * 参数说明：@param id
//	 * 参数说明：@return
//	 * 功能说明：
//	 */
//	@Override
//	public boolean deleteReply(int id) {
//		// TODO Auto-generated method stub
//		if(iReplyDao.deleteByPrimaryKey(id) > 0){
//			return true;
//		}
//			
//		return false;
//	}

}
