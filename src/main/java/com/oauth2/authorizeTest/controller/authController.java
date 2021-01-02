package com.oauth2.authorizeTest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class authController {

    @GetMapping("/")
    public String getHello() {
        return "hello world";
    }

    @GetMapping("/secured")
    public String restrict() {
        return "Text to be restricted";
    }

}
