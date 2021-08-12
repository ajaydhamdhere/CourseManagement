package com.learning.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.learning.dao.AdminDoa;
import com.learning.model.AddCourse;

/**
 * Servlet implementation class AddCourseServlet
 */
public class AddCourseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCourseServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   AddCourse add=new AddCourse();
		   add.setCourseId(Integer.parseInt(request.getParameter("courseId")));
	       add.setCourseName(request.getParameter("courseName"));
	       add.setCourseDesc(request.getParameter("courseDesc"));
	       add.setCourseFees(Integer.parseInt(request.getParameter("courseFees")));
	       AdminDoa temp=new AdminDoa();
	       try {
			boolean courseAdded=temp.addCourse(add);
			if(courseAdded)
			{
			 response.sendRedirect("addSuccess.jsp");
			}
		} catch (SQLException e) {
			System.out.println("Throwing sql Exception while adding Course");
			e.printStackTrace();
		} catch (ParseException e) {
			System.out.println("Throwing parse Exception while adding Course");
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
