package com.example.user.DAO;

import com.example.user.connection.ConnectionDAO;
import com.example.user.model.User;
import com.example.user.model.Province;
import com.example.user.service.ProvinceIplm;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    private final Connection connection = ConnectionDAO.getConnection();
    private final ProvinceIplm provinceIplm;
    private final String SELECT_ALL_USER = "select * from user join province on" +
            " province.id = user.province_id";

//    private final String SELECT_USER_BY_ID = "select * from user where id =?;";

    public UserDAO() {

        provinceIplm = new ProvinceIplm();
    }

    public List<User> findAll() {
        List<User> users = new ArrayList<>();
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(SELECT_ALL_USER);
            while (resultSet.next()) {
                Province province = provinceIplm.findProvince(resultSet.getInt("id"));
                users.add(new User(resultSet.getInt("id"),
                        resultSet.getString("name"),
                        province));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return users;
    }

}
