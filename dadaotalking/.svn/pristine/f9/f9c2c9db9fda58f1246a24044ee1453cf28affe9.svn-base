package com.ddjf.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ddjf.pojo.Post;

public interface IPostDao {
	int deleteByPrimaryKey(Integer id);

	int insert(Post record);

	List<Post> selectByTitle(String title);

	Post selectById(int id);
	
	List<Post> selectAll(@Param("start")int start, @Param("limit")int limit);

}