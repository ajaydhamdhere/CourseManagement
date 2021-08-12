package com.learning.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.ParseException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.learning.dao.UserDao;
import com.learning.model.User;

/**
 * Servlet implementation class UserLoginServlet
 */
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("Servlet called");
		
		User user=new User();
	       
	       user.setEmail(request.getParameter("email"));
	       user.setPassword(request.getParameter("password"));
	      
	       
	       
	       UserDao temp=new UserDao();
	       try {
			boolean userLogin=temp.isUserValid(user);
			if(userLogin)
			{
				response.sendRedirect("HomeUser.jsp");
			}
		} catch (SQLException e) {
			System.out.println("Throwing sql Exception while login user");
			e.printStackTrace();
		} catch (ParseException e) {
			System.out.println("Throwing parse Exception while login user");
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
