package com.tech.blog.servlets;

import java.io.IOException;
import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import com.tech.blog.entities.*;
import com.tech.blog.helper.connectionProvider;
import com.tech.blog.dao.*;
import com.tech.blog.helper.*;



@WebServlet("/AddPostServlet")
@MultipartConfig
public class AddPostServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		
	   int cId =Integer.parseInt( request.getParameter("cid"));
		String pTitle = request.getParameter("pTitle");
		String pContent = request.getParameter("pContent");
		String pCode = request.getParameter("pCode");
		
		//pw.print("Your post title is "+pTitle);
		//getting current user id
		HttpSession session = request.getSession();
		User user  =(User)session.getAttribute("currentUser");
		int userId = user.getId();
		Part p = request.getPart("pic");
		String fileName = p.getSubmittedFileName();
		//pw.print(fileName);
		//pw.print(cId);
		//pw.print(pTitle);
		//pw.println(pCode);
		
		
		Post post = new Post(pTitle,pContent,pCode,fileName,null,cId,userId);
		PostDao dao = new PostDao(connectionProvider.getConnection());
		boolean f =dao.savePost(post);
		if(f) {
			
			String path = request.getRealPath("/")+"img"+File.separator+p.getSubmittedFileName();
		   pw.println(path);
			Helper.saveFile(p.getInputStream(), path);
		    pw.print("Succes");
		}
		else {
			pw.print("not success");
		}
		//String path = getServletContext().getRealPath("/"+"img"+File.separator+fileName);
		//pw.println(path);
		
		
		//InputStream is = p.getInputStream();
		//boolean success = uploadFile(is,path);
		//if(success) {
			//pw.print("File uploaded"+path);
		//}else {
			//pw.println("error");
		//}
		
	}

	/*public boolean uploadFile(InputStream is ,String path) {
		boolean test = false ;
		
		try {
			byte[] byt = new byte[is.available()];
			is.read();
			FileOutputStream fops = new FileOutputStream(path);
			fops.write(byt);
			fops.flush();
			fops.close();
			test =true ;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return test ;
	}*/
}
