package com.example.demo.controller;

import com.example.demo.model.Account;
import com.example.demo.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class MainController {

    @Resource
    private UserService userService;

    @GetMapping("/ping")
    public String getMessage() {
        return "Elo there chum";
    }

    @GetMapping("/user")
    public Account getUserDetails() {
        return userService.getUserDetails();
    }
}
