package com.learning.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.learning.dao.AdminDoa;
import com.learning.model.Admin;

/**
 * Servlet implementation class AdminServlet
 */
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("Servlet called");
		
		Admin admin=new Admin();
	       
	       admin.setAdminId(Integer.parseInt(request.getParameter("adminId")));
	       admin.setPassword(request.getParameter("password"));
	      
	       
	       
	       AdminDoa temp=new AdminDoa();
	       try {
			boolean userLogin=temp.isAdminValid(admin);
			if(userLogin)
			{
				response.sendRedirect("AdminHome.jsp");
			}
		} catch (SQLException e) {
			System.out.println("Throwing sql Exception while login admin");
			e.printStackTrace();
		} catch (ParseException e) {
			System.out.println("Throwing parse Exception while login admin");
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
