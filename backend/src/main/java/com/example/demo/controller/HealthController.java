package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello from features_20260915 branch!";

    }

    @GetMapping("/checkHealth")
    public String checkHealth() {
        return "is ok!";
    }
}
