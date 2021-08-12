package com.learning.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.learning.dao.UserDao;
import com.learning.model.AddCourse;

/**
 * Servlet implementation class UserOptions
 */
public class UserOptions extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserOptions() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String choice=request.getParameter("useroptions");
		if(choice.equals("ViewCourses"))
		{
		  UserDao ud=new UserDao();
		  try {
			ArrayList<AddCourse> courses=ud.getCourses();
//			for(int i=0;i<users.size();i++)
//			{
//				System.out.println(users.get(i).getName());
//			}
			HttpSession session=request.getSession();
			session.setAttribute("courses", courses);
			response.sendRedirect("displayCourses.jsp");
		  } catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error in try of view courses");
			out.println("Error in try of view courses");
			e.printStackTrace();
			}
		  
		  
		}
		
		
		else 
		{
			out.println("please choose something to proceed");
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
