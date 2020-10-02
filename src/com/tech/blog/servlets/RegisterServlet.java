package com.tech.blog.servlets;

import java.io.IOException;

import com.tech.blog.dao.UserDao;
import com.tech.blog.helper.connectionProvider;
import com.tech.blog.entities.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
		  PrintWriter out = response.getWriter();
		String check = request.getParameter("check");
	   if(check==null) {
	}
	   else {
		   String name= request.getParameter("user_name");
		   String email= request.getParameter("user_email");
		   String password= request.getParameter("user_password");
		   String gender= request.getParameter("user_gender");
		   String about= request.getParameter("about");
		  //create user object and set all data to that object
		   
		   User user = new User(name,email,password,gender,about);
		   //create a UserDao object....
		   UserDao dao = new UserDao(connectionProvider.getConnection());;
		   if(dao.saveUser(user)) {
			   out.print("saved successfully....");
		   }else {
			   out.print("error");
		   }
		   
	   }
	}
}
