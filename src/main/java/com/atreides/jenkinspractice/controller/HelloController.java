package com.atreides.jenkinspractice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api")
    public String sayHello() {
        return "Hello from Jenkins";
    }
}
