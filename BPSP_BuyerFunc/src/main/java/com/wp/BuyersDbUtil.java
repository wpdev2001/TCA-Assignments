package com.wp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BuyersDbUtil {
	public static List<Buyers_Info> getBuyerList() throws ClassNotFoundException, SQLException
	{
		ArrayList<Buyers_Info> buyers = new ArrayList<>();
		
		String url = "jdbc:mysql://192.168.120.5:3306/hfbdb";
        String user = "rmsadmin";
        String password = "password";
		
		//Load the Driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        //Get the connection
        Connection con = DriverManager.getConnection(url,user,password);
        
        //Create a statement
        PreparedStatement ps = con.prepareStatement("select * from buyerList");
        
        //Execute the statement
        ResultSet rs = ps.executeQuery();
        
        while(rs.next())
        {
        	int buyer_id = rs.getInt(1);
        	String buyer_name = rs.getString(2);
        	double buyer_request_amount = rs.getDouble(3);
        	
        	Buyers_Info buyer_info = new Buyers_Info(buyer_id,buyer_name,buyer_request_amount);
        	
        	buyers.add(buyer_info);
        }
		
		return buyers;
	}
}