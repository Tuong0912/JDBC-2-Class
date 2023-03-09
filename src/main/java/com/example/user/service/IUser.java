package com.example.user.service;

import com.example.user.model.User;

import java.util.List;

public interface IUser {
    List<User> showAll();
    User findById(int id);
}
