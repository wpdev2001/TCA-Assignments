package com.wp;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class FoodCart extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    	//Get the data from the database
    	List<Food> foodItems;
		try {
			foodItems = FoodCartDbUtil.getFoodList();
			request.setAttribute("foodItems", foodItems);
		} 
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    	//Redirect to a different page
        RequestDispatcher rd = request.getRequestDispatcher("show-food.jsp");
        rd.forward(request, response);
    }
}