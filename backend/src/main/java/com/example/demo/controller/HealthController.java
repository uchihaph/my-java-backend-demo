package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
    @GetMapping("/hello")
    public String hello() {
        throw new RuntimeException("模拟业务故障");

    }

    @GetMapping("/checkHealth")
    public String checkHealth() {
        return "is ok!";
    }
}
