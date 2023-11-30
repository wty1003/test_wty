package com.example.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.example.domain.Users;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author 翁良森
 */
@Mapper
public interface UserDao extends BaseMapper<Users> {
    /**
     * 注册
     * @param user
     */
    @Insert("insert into tb_users(username, password,emailaddress,fullname) values(#{username},#{password},#{emailaddress},#{fullname})")
    public int register(Users user);

    /**
     * 登录
     * @param user
     */
    @Select("select * from tb_users where username = #{username} and password = #{password}")
    public Users login(Users user);


    @Select("select * from tb_users where username = #{username}")
    public Users checkReg(String username);
}
