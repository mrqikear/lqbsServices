package com.lqbs.dao;

import com.lqbs.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserDao {

        List<User> getAll();

}
