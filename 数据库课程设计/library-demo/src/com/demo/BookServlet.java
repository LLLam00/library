package com.demo;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.dao.BookDao;
import com.dao.BookDaoImpl;
import com.model.Book;
import javax.servlet.annotation.WebServlet;
@WebServlet("/add-book")

	public class BookServlet extends HttpServlet {
		private static final long serialVersionUID = 1L;
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				BookDao dao=new BookDaoImpl();
				Book book=new Book();
				String message=null;
		try {
			book.setBid(new String(request.getParameter("bid").getBytes("iso-8859-1"),"UTF-8"));
			book.setBname(new String(request.getParameter("bname").getBytes("iso-8859-1"),"UTF-8"));
			book.setBwriter(new String(request.getParameter("bwriter").getBytes("iso-8859-1"),"UTF-8"));
			book.setBpublish(new String(request.getParameter("bpublish").getBytes("iso-8859-1"),"UTF-8"));
			book.setBclass(new String(request.getParameter("bclass").getBytes("iso-8859-1"),"UTF-8"));
			book.setBdate(new String(request.getParameter("bdate").getBytes("iso-8859-1"),"UTF-8"));
			book.setBprice(Float.parseFloat(request.getParameter("bprice")));
			book.setBcopy(Integer.parseInt(request.getParameter("bcopy")));
			book.setBcaseid(new String(request.getParameter("bcaseid").getBytes("iso-8859-1"),"UTF-8"));
			int success=dao.addBook(book);
			if(success==1) {
				message="<li>成功插入一条记录！</li>";
			}
			else {
				message="<li>插入记录失败！</li>";	
			}
		}catch(Exception e) {
				System.out.println(e);
				message="<li>插入记录失败！</li>"+e;
			}
			request.setAttribute("message", message);
			RequestDispatcher rd=getServletContext().getRequestDispatcher("/add-book.jsp");
			rd.forward(request, response);
		}
		}
