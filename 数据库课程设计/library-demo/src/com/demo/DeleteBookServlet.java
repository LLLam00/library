package com.demo;
import java.io.*;
import java.sql.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import com.model.Book;
@WebServlet("/delete-book")
public class DeleteBookServlet extends HttpServlet{
   private static final long serialVersionUID = 1L;
   Connection dbconn = null;
   public void init() {
      String driver = "com.mysql.jdbc.Driver";
      String dburl = "jdbc:mysql://127.0.0.1:3306/library?useSSL=true";
      String username = "root";
      String password = "980902";
      try{
          Class.forName(driver); // 加载驱动程序
          // 创建连接对象
          dbconn = DriverManager.getConnection(
      	                     dburl,username,password);
      }catch(ClassNotFoundException e1){
          System.out.println(e1);
          getServletContext().log("驱动程序类找不到！");   
      }catch(SQLException e2){
    	  System.out.println(e2);
      }
   }
   
   public void doGet(HttpServletRequest request,
                        HttpServletResponse response)
                        throws ServletException,IOException{
	     String bid = request.getParameter("bid"); 
	     try{
          String sql="DELETE FROM book WHERE bid =?";
          PreparedStatement pstmt = dbconn.prepareStatement(sql);
          pstmt.setString(1, bid);
         int n  = pstmt.executeUpdate();
         if(n!=0){
             
        	 request.getRequestDispatcher("search.do").forward(request, response);
         }else{
            response.sendRedirect("/library-demo/error.jsp");
         }
       }catch(SQLException e){
  	      e.printStackTrace();
       }
   }
   public void destroy(){
	      try {
	         dbconn.close();
	      }catch(Exception e){
		     e.printStackTrace();
      }
   }
}

