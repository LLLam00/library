package com.demo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.ReaderDao;
import com.dao.ReaderDaoImpl;
import com.model.Reader;

@WebServlet("/reader-register")
public class ReaderRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
throws ServletException, IOException {
			ReaderDao dao=new ReaderDaoImpl();
			Reader reader=new Reader();
			String message=null;
	try {
		reader.setRid(new String(request.getParameter("rid").getBytes("iso-8859-1"),"UTF-8"));
		reader.setRname(new String(request.getParameter("rname").getBytes("iso-8859-1"),"UTF-8"));
		reader.setRsex(new String(request.getParameter("rsex").getBytes("iso-8859-1"),"UTF-8"));
		reader.setRtype(new String(request.getParameter("rtype").getBytes("iso-8859-1"),"UTF-8"));
		reader.setRdept(new String(request.getParameter("rdept").getBytes("iso-8859-1"),"UTF-8"));
		reader.setRtele(new String(request.getParameter("rtele").getBytes("iso-8859-1"),"UTF-8"));
		reader.setIdpassword(new String(request.getParameter("password").getBytes("iso-8859-1"),"UTF-8"));
		int success=dao.addReader(reader);
	}catch(Exception e) {
			System.out.println(e);
		}
		RequestDispatcher rd=getServletContext().getRequestDispatcher("/register-success.jsp");
		rd.forward(request, response);
	}

}
