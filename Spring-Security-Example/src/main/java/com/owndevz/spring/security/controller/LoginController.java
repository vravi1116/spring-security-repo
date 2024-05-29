package com.owndevz.spring.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LoginController {
 
    @GetMapping("/welcome") public String welcome()
    {
        System.out.println("Welcome page accessed...");
        return "welcome.html";
    }
 
    @GetMapping("/admin") public String user()
    {
        return "admin.html";
    }
 
    @GetMapping("/basic") public String basic()
    {
        return "basic.html";
    }
 
    @GetMapping("/login") public String login()
    {
        return "login.html";
    }
}