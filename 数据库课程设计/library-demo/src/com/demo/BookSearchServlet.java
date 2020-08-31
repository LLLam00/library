package com.demo;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import com.model.Book;


@WebServlet("/book-search")
public class BookSearchServlet extends HttpServlet {
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
    public BookSearchServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		 request.setCharacterEncoding("UTF-8");
		 response.setCharacterEncoding("UTF-8");
	     Connection dbconn = null;  
         ArrayList<Book> bookList = null; 
         bookList = new ArrayList<Book>();
         try{
              dbconn = dataSource.getConnection();
              String sql="SELECT bid,bname,bwriter,bpublish,bclass,bcaseid,bstate FROM book;";
              PreparedStatement pstmt = dbconn.prepareStatement(sql);
              ResultSet result = pstmt.executeQuery();
              while(result.next()){
                   Book book = new Book();
                   book.setBid(result.getString("bid"));
    	           book.setBname(result.getString("bname"));
    	           book.setBwriter(result.getString("bwriter"));
    	           book.setBpublish(result.getString("bpublish"));
    	           book.setBclass(result.getString("bclass"));
    	           book.setBcaseid(result.getString("bcaseid"));
    	           book.setBstate(result.getString("bstate"));
    	           bookList.add(book);
               }
            if(!bookList.isEmpty()){
               request.getSession().setAttribute("bookList",bookList);
               response.sendRedirect("/library-demo/displayAllBook.jsp");
            }else{
               response.sendRedirect("/library-demo/error.jsp");
            }
         }catch(SQLException e){
            e.printStackTrace();
         }finally {
            try {
             // dbconn.close();
            }catch(Exception e){
               e.printStackTrace();
            }
         }
	  }
	

protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		Connection dbconn = null;
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		String keyword = request.getParameter("keyword");
		try {
			dbconn = dataSource.getConnection();
			String sql="SELECT bid,bname,bwriter,bpublish,bclass,bcaseid,bstate FROM library.book WHERE bname=? "
					+ "UNION SELECT bid,bname,bwriter,bpublish,bclass,bcaseid,bstate FROM library.book WHERE bwriter=?"
					+ "UNION SELECT bid,bname,bwriter,bpublish,bclass,bcaseid,bstate FROM library.book WHERE bpublish=?;";
			PreparedStatement pstmt = dbconn.prepareStatement(sql);
	        pstmt.setString(1,keyword);
	        pstmt.setString(2,keyword);
	        pstmt.setString(3,keyword);
	        ResultSet rst = pstmt.executeQuery();
	        if(rst.next()){
	           Book book = new Book();
	           book.setBid(rst.getString("bid"));
	           book.setBname(rst.getString("bname"));
	           book.setBwriter(rst.getString("bwriter"));
	           book.setBpublish(rst.getString("bpublish"));
	           book.setBclass(rst.getString("bclass"));
	           book.setBcaseid(rst.getString("bcaseid"));
	           book.setBstate(rst.getString("bstate"));
	           request.getSession().setAttribute("book",book);
	           response.sendRedirect("/library-demo/displayBook.jsp");
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