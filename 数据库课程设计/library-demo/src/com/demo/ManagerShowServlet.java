package com.demo;
import java.io.*;
import java.sql.*;
import java.util.*;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.sql.DataSource;
import javax.servlet.annotation.WebServlet;
import com.model.Manager;
@WebServlet("/show-manager")
public class ManagerShowServlet extends HttpServlet{
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
   
   public void doGet(HttpServletRequest request,
                        HttpServletResponse response)
                        throws ServletException,IOException{
	     Connection dbconn = null;  
	     ArrayList<Manager> managerList = null; 
	     managerList = new ArrayList<Manager>();
	     HttpSession session=request.getSession();
	     String mname = (String)session.getAttribute("mname");
	     try{
	    	 dbconn = dataSource.getConnection();
	    	 String sql="SELECT mid,mname,msex,mtele,mage FROM library.manager WHERE mname=?;";
             PreparedStatement pstmt = dbconn.prepareStatement(sql);
             pstmt.setString(1,mname) ;
             ResultSet result = pstmt.executeQuery();
             while(result.next()){
              Manager manager = new Manager();
              manager.setMid(result.getString("mid"));
              manager.setMname(result.getString("mname"));
              manager.setMsex(result.getString("msex"));
              manager.setMtele(result.getString("mtele"));
              manager.setMage(Integer.parseInt(result.getString("mage")));
              managerList.add(manager);
           }
           if(!managerList.isEmpty()){
    	      request.getSession().setAttribute("managerList",managerList);
              response.sendRedirect("/library-demo/mpersonal-information.jsp");
           }else{
              response.sendRedirect("/library-demo/error.jsp");
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

