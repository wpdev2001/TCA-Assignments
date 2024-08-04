package com.wp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FoodCartDbUtil {
	public static List<Food> getFoodList() throws ClassNotFoundException, SQLException
	{
		ArrayList<Food> food = new ArrayList<>();
		
		String url = "jdbc:mysql://192.168.120.5:3306/hfbdb";
        String user = "rmsadmin";
        String password = "password";
		
		//Load the Driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        //Get the connection
        Connection con = DriverManager.getConnection(url,user,password);
        
        //Create a statement
        PreparedStatement ps = con.prepareStatement("select * from foodcart");
        
        //Execute the statement
        ResultSet rs = ps.executeQuery();
        
        while(rs.next())
        {
        	int id = rs.getInt(1);
        	String items = rs.getString(2);
        	double price = rs.getDouble(3);
        	
        	Food f = new Food(id,items,price);
        	
        	food.add(f);
        }
		
		return food;
	}
}
