package com.ddjf.dao;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ddjf.pojo.User;

public interface IUserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    User selectByUsername(String username);

    int updateByUsername(User record);
    
    List<User> pageQueryUser(@Param("start")int start, @Param("limit")int limit );
}