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
import javax.websocket.Session;
import javax.servlet.annotation.WebServlet;
import com.model.Reader;
@WebServlet("/show-reader")
public class ReaderShowServlet extends HttpServlet{
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
	     ArrayList<Reader> readerList = null; 
	     readerList = new ArrayList<Reader>();
	     HttpSession session=request.getSession();
	     String rname = (String)session.getAttribute("rname");
	     System.out.println(rname);
	     try{
	    	 dbconn = dataSource.getConnection();
	    	 String sql="SELECT rid,rname,rsex,rtype,rdept,rtele,bnum FROM library.reader WHERE rname=?;";
             PreparedStatement pstmt = dbconn.prepareStatement(sql);
             pstmt.setString(1,rname) ;
             ResultSet result = pstmt.executeQuery();
             while(result.next()){
              Reader reader = new Reader();
              reader.setRid(result.getString("rid"));
              reader.setRname(result.getString("rname"));
              reader.setRsex(result.getString("rsex"));
              reader.setRtype(result.getString("rtype"));
              reader.setRdept(result.getString("rdept"));
              reader.setRtele(result.getString("rtele"));
              reader.setBnum(result.getInt("bnum"));
              readerList.add(reader);
           }
           if(!readerList.isEmpty()){
    	      request.getSession().setAttribute("readerList",readerList);
              response.sendRedirect("/library-demo/personal-information.jsp");
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

