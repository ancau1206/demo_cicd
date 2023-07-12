package com.example.demo_cicd.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class MainController {
    @RequestMapping("/get")
    public String get() {
        return "Hello";
    }
}
