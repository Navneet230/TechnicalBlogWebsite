package com.tech.blog.servlets;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.*;
import javax.servlet.http.*;
import com.tech.blog.entities.User;
import com.tech.blog.helper.connectionProvider;
import com.tech.blog.dao.UserDao ;
import javax.servlet.annotation.MultipartConfig;

@WebServlet("/EditServlet")
@MultipartConfig
public class EditServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		//fetch all data 
		String userEmail = request.getParameter("user_email");
		String userName = request.getParameter("user_name");
		String userPassword = request.getParameter("user_password");
		String userAbout = request.getParameter("user_about");
		Part part = request.getPart("image");
		String imageName = part.getSubmittedFileName();
		
		HttpSession s = request.getSession();
		
		User user = (User)s.getAttribute("currentUser");
		user.setEmail(userEmail);
		user.setName(userName);
		user.setPassword(userPassword);
		user.setAbout(userAbout);
		user.setPassword(imageName);
		
		//Upadate User
		UserDao userDao = new UserDao(connectionProvider.getConnection());
		boolean ans =userDao.updateUser(user);
		if(ans) {
		   pw.print("updated to db");
		}else {
			pw.print("Not updated");
		}
		
	}

}
