package com.example.hello.controller;

import com.example.hello.dto.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

    @RequestMapping("/main")
    public String main(){
        return "main.html";
    }

    @ResponseBody
    @GetMapping("/user")
    public UserDto user(){
        var user = new UserDto();
        user.setName("홍길동");
//        user.setAge(14);
        user.setPhoneNumber("010-1234-1234");
        user.setAddress("대전광역시 유성구 장동");
        return user;
    }
}
