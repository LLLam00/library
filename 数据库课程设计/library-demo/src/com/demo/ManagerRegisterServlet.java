package com.demo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.ManagerDao;
import com.dao.ManagerDaoImpl;
import com.model.Manager;

@WebServlet("/manager-register")
public class ManagerRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
throws ServletException, IOException {
		ManagerDao dao=new ManagerDaoImpl();
		Manager manager=new Manager();
			String message=null;
	try {
		manager.setMid(new String(request.getParameter("mid").getBytes("iso-8859-1"),"UTF-8"));
		manager.setMname(new String(request.getParameter("mname").getBytes("iso-8859-1"),"UTF-8"));
		manager.setMsex(new String(request.getParameter("msex").getBytes("iso-8859-1"),"UTF-8"));
		manager.setMtele(new String(request.getParameter("mtele").getBytes("iso-8859-1"),"UTF-8"));
		manager.setMage(Integer.parseInt(request.getParameter("mage")));
		manager.setPassword(new String(request.getParameter("password").getBytes("iso-8859-1"),"UTF-8"));
		int success=dao.addManager(manager);
	}catch(Exception e) {
			System.out.println(e);
		}
		RequestDispatcher rd=getServletContext().getRequestDispatcher("/mregister-success.jsp");
		rd.forward(request, response);
	}

}
