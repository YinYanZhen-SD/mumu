package com.icloud.mumu.system.controller;


import ch.qos.logback.core.net.SyslogOutputStream;
import com.icloud.mumu.system.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yinyanzhen
 * @since 2019-12-20
 */
@Controller
@RequestMapping("/system/user")
public class UserController {


    @PostMapping("login")
    @ResponseBody
    public String login(@Param("username") String username,@Param("password") String password ){

        return "";
    }

    @PostMapping("register")
    @ResponseBody
    public String register(User user){
        System.out.println("user:"+user);
        return "ok";
    }


    @PostMapping("remoteUsername")
    @ResponseBody
    public String remoteUsername(String username){
        System.out.println("username:"+username);
        return "";

    }




}
