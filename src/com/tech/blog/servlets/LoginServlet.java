package com.tech.blog.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import com.tech.blog.dao.UserDao;
import com.tech.blog.helper.connectionProvider;
import com.tech.blog.entities.User;
import com.tech.blog.entities.Message;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
	
		
		//fetch username and password 
		String userEmail = request.getParameter("email");
		String userPassword = request.getParameter("password");
		
		UserDao dao = new UserDao(connectionProvider.getConnection());
		
		User u = dao.getUserEmailAndPassword(userEmail, userPassword);
		if(u==null) {
			
			Message msg = new Message("Invalid Details! try with another","error","alert-danger");
			HttpSession s= request.getSession();
			s.setAttribute("msg", msg);
			response.sendRedirect("login_page.jsp");
		}else {
			//login success
			
			HttpSession s= request.getSession();
			s.setAttribute("currentUser", u);
			response.sendRedirect("profile.jsp");
			
		}
	}

}
