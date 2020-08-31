package com.demo;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@WebServlet("/reader-update")
public class ReaderUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DataSource dataSource;
	   public void init() {   
	      try{
		      Context context = new InitialContext();
		      dataSource = (DataSource)context.lookup("java:comp/env/jdbc/libraryDS");  
	      }catch(NamingException ne){
	          System.out.println(ne);
	          getServletContext().log("驱动程序类找不到！");   
	      }
	   }

    public ReaderUpdateServlet() {
        super();
        
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection dbconn = null;
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String password1 = request.getParameter("password1");
		String password2 = request.getParameter("password2");
		try {
			dbconn = dataSource.getConnection();
			String sql = "UPDATE library.reader SET idpassword=? WHERE rid=? AND idpassword=?;";
			PreparedStatement pstmt = dbconn.prepareStatement(sql);
	        pstmt.setString(1,password2);
	        pstmt.setString(2,id);
	        pstmt.setString(3,password1);
	        int rst = pstmt.executeUpdate();
	        if(rst>0){
	           response.sendRedirect("/library-demo/update-success.jsp");
	        }else{
	           response.sendRedirect("/library-demo/update.jsp");
	        }
	      }catch(SQLException e){
	  	      e.printStackTrace();
	      }finally {
	          try {
	 	         dbconn.close();
	 	      }catch(Exception e){
	 		     e.printStackTrace();
	         }
	      }
	}
	}
