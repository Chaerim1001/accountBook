package com.chaerim.accountbook.user.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Controller
@AllArgsConstructor
public class UserController {

    @GetMapping("/user")
    public String JoinAndLoginPage(){
        return "user/join-login.html";
    }
}
