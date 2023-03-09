package com.example.user.service;

import com.example.user.model.Province;

import java.util.List;

public interface IProvince {
    List<Province> showAll();
    Province findProvince(int id);
}
