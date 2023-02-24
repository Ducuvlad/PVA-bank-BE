package com.example.demo.service.impl;

import com.example.demo.model.Account;
import com.example.demo.service.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public Account getUserDetails() {
        return new Account("Michael", "Jackson");
    }
}
