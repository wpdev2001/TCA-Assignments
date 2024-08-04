package com.wp.foodcart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FoodItemsDb {

    public static List<Food> getFoodList() {
        String url = "jdbc:mysql://192.168.120.5:3306/hfbdb";
        String user = "rmsadmin";
        String password = "password";

        ArrayList<Food> food = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection con = DriverManager.getConnection(url, user, password);
                 PreparedStatement ps = con.prepareStatement("SELECT id, item, price FROM foodcart");
                 ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String item = rs.getString("item");
                    double price = rs.getDouble("price");
                    Food f = new Food(id, item, price);
                    food.add(f);
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            // Handle ClassNotFoundException and SQLException
        }
        return food;
    }
}
