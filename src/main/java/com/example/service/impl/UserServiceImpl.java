package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.dao.UserDao;
import com.example.domain.Users;
import com.example.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author 翁良森
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, Users> implements UsersService {

    @Autowired
    private UserDao userDao;


    @Override
    public int register(Users user) {
        return userDao.register(user);
    }

    @Override
    public Users login(Users user) {
        return userDao.login(user);
    }

    @Override
    public Users checkReg(String username) {

        return userDao.checkReg(username);

    }

//    @Override
//    public List<Users> checkReg(String username) {
//
//        return userDao.checkReg(username);
//        QueryWrapper<Users> qw = new QueryWrapper<>();
//        qw.like("username",username);
//        List<Users> users = userDao.selectList(qw);
//        return users;
//    }
}
