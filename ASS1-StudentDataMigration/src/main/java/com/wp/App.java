package com.wp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
        FileReader fr = null;
        BufferedReader br = null;
        Connection con = null;
        PreparedStatement ps = null;
        
        String dbUrl = "jdbc:mysql://192.168.120.5:3306/hfbdb";
        String user = "rmsadmin";
        String password = "password";
        
        try {
        	
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	
        	con = DriverManager.getConnection(dbUrl,user,password);
        	
        	fr = new FileReader("resources/student.csv");
        	
        	br = new BufferedReader(fr);
        	
        	ps = con.prepareStatement("insert into student values(?,?,?)");
        	
        	while(true) {
        		String line = br.readLine();
        		
        		if(line == null) {
        			break;
        		}
        		
        		String tok[] = line.split(",");
        		
        		int rno = Integer.parseInt(tok[0]);
        		String name = tok[1];
        		double per = Double.parseDouble(tok[2]);
        		
        		ps.setInt(1,rno);
        		ps.setString(2, name);
        		ps.setDouble(3, per);
        		
        		int sval = ps.executeUpdate();
        		
        		if(sval == 1) {
        			System.out.println("Record is saved for RNO: " + rno);
        		}
        	}
        	
        }
        catch (Exception e) {
			e.printStackTrace();
		}
        finally {
			con.close();
			fr.close();
		}
    }
}
