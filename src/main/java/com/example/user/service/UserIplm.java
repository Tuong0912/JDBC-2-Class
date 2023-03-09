package com.example.user.service;

import com.example.user.DAO.UserDAO;
import com.example.user.model.User;

import java.util.List;

public class UserIplm implements IUser {
    private final UserDAO userDAO = new UserDAO() ;

//    public UserIplm(UserDAO userDAO) {
//        this.userDAO = userDAO;
//    }

    @Override
    public List<User> showAll() {
        return userDAO.findAll();
    }

    @Override
    public User findById(int id) {
        return null;
    }
}
