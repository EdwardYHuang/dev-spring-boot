package com.udemy.springboot.demosecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class loginController {

    @GetMapping("/showMyLoginPage")
    public String showLoginPage() {

        //return "plain-login";
        return "fancy-login";
    }
}
