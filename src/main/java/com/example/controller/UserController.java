package com.example.controller;

import com.example.domain.Users;
import com.example.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author 翁良森
 */
@Controller
public class UserController {

    @Autowired
    private UsersService usersService;

    @RequestMapping("/")
    public String index() {
        return "forward:/register.html";
    }

    @GetMapping("/log")
    public String login(Users user){

        Users u = usersService.login(user);


        if (u != null){
            return "/index.html";
        }else {
            return "/logno.html";
        }
    }

    @PostMapping("/reg")
    public String register(Users user){
        Users u = usersService.checkReg(user.getUsername());

        if (u == null) {
            usersService.register(user);
            return "redirect:/regok.html";
        }

        return "redirect:/regno.html";
    }

}
