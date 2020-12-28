package com.attence.employee.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @ResponseBody
    @RequestMapping("/main")
    public String login() {
        return "conguration!";
    }

    @ResponseBody
    @RequestMapping("/login/hello")
    public String login2() {
        return "conguration!";
    }

    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "conguration!";
    }

    @ResponseBody
    @RequestMapping("/*")
    public String hello2() {
        return "conguration!";
    }
}
