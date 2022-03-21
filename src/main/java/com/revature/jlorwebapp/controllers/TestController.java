package com.revature.jlorwebapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    
    @GetMapping("/")
    public String home() {
        return "Hello";
    }

    @GetMapping("/test")
    public String test() {
        return "Test";
    }
}
