package com.chaerim.accountbook.member.controller;

import com.chaerim.accountbook.member.dto.MemberDto;
import com.chaerim.accountbook.member.service.MemberService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Controller
@AllArgsConstructor
public class MemberController {
    final private MemberService memberService;

    @GetMapping("/login")
    public String JoinAndLoginPage(){
        return "user/join-login.html";
    }

    @PostMapping("/signup")
    public String signUp(MemberDto memberDto) {
        memberService.joinUser(memberDto);
        return "redirect:/login";
    }
}
