package com.gzx.controller;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/user.do")
public class UserController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6903612778166670186L;

	
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userName = req.getParameter("userName");
		String password = req.getParameter("password");
		String remember = req.getParameter("remember");
		
		System.out.println(userName);
		System.out.println(password);
		System.out.println(remember);
		
		if("1".equals(remember)) {
			Cookie userNameCookie = new Cookie("userName", userName);
			userNameCookie.setMaxAge(60*60*24*7);
			resp.addCookie(userNameCookie);
			
			Cookie passwordCookie = new Cookie("password",password);
			passwordCookie.setMaxAge(60*60*24*7);
			resp.addCookie(passwordCookie);
		}
		resp.getWriter().print("login successfully!");
	}
	
}
