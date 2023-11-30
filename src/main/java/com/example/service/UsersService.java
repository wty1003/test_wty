package com.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.domain.Users;

import java.util.List;

/**
 * @author 吴天宇
 */
public interface UsersService extends IService<Users> {
    /**
     * 注册
     * @param user
     * @return
     */
    public int register(Users user);

    /**
     * 登录
     * @param user
     */
    public Users login(Users user);

    public Users checkReg(String username);
}
