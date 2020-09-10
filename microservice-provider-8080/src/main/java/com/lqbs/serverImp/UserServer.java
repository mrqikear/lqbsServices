package com.lqbs.serverImp;

import com.lqbs.dao.UserDao;
import com.lqbs.server.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServer implements User {

    @Autowired
    UserDao userDao;
    @Override
    public List<com.lqbs.entity.User> getAllUser() {
        return userDao.getAll();
    }
}
