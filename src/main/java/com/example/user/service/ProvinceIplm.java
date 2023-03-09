package com.example.user.service;

import com.example.user.DAO.ProvinceDAO;
import com.example.user.model.Province;

import java.util.List;

public class ProvinceIplm implements IProvince {
    private final ProvinceDAO provinceDAO = new ProvinceDAO();



    @Override
    public List<Province> showAll() {
        return provinceDAO.findAll();
    }

    @Override
    public Province findProvince(int id) {
        return provinceDAO.findById(id);
    }
}
