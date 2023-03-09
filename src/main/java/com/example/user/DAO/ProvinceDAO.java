package com.example.user.DAO;

import com.example.user.connection.ConnectionDAO;
import com.example.user.model.Province;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProvinceDAO {
    private final Connection connection = ConnectionDAO.getConnection();
    private final String SELECT_ALL = "select * from province";
    private final String SELECT_BY_ID = "select * from province where id=?;";

    public List<Province> findAll() {
        List<Province> provinces = new ArrayList<>();
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(SELECT_ALL);
            while (resultSet.next()) {
                provinces.add((new Province(resultSet.getInt("id"),
                        resultSet.getString("name"))));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return provinces;
    }

    public Province findById(int id) {
        Province province = null;
        try (PreparedStatement statement = connection.prepareStatement(SELECT_BY_ID)) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                province = new Province(resultSet.getInt("id"),
                        resultSet.getString("name"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return province;
    }
}
