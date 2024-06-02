package com.wp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginUtil {

    public static boolean authenticate(String username, String password) throws ClassNotFoundException, SQLException {
        Connection conn = DatabaseUtil.getConnection();
        String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, username);
        ps.setString(2, password);
        ResultSet rs = ps.executeQuery();

        boolean isAuthenticated = rs.next();

        rs.close();
        ps.close();
        conn.close();

        return isAuthenticated;
    }
}
