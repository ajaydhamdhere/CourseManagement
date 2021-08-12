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

import com.learning.model.User;
import com.learning.dao.AdminDoa;
import com.learning.model.Feedback;
import com.learning.model.Contact;

/**
 * Servlet implementation class AdminOptions
 */
public class AdminOptions extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminOptions() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String choice=request.getParameter("adminoptions");
		if(choice.equals("ViewUsers"))
		{
		  AdminDoa ud=new AdminDoa();
		  try {
			ArrayList<User> users=ud.getUsers();

			HttpSession session=request.getSession();
			session.setAttribute("users", users);
			response.sendRedirect("displayUsers.jsp");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error in try of view users");
			out.println("Error in try of view users");
			e.printStackTrace();
		}
		  
		  
		}
		else if(choice.equals("ViewFeedbacks"))
		{
			AdminDoa ud=new AdminDoa();
			  try {
				ArrayList<Feedback> users=ud.getFeedback();
				HttpSession session=request.getSession();
				session.setAttribute("users", users);
				response.sendRedirect("displayFeedback.jsp");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("Error in try of view Feedback");
				out.println("Error in try of view Feedback");
				e.printStackTrace();
			}
		}
		else if(choice.equals("ViewContacts"))
		{
			AdminDoa ud=new AdminDoa();
			  try {
				ArrayList<Contact> users=ud.getContact();
				HttpSession session=request.getSession();
				session.setAttribute("users", users);
				response.sendRedirect("displayContact.jsp");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("Error in try of view Contacts");
				out.println("Error in try of view Contacts");
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



