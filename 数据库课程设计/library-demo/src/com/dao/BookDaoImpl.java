package com.dao;
import java.sql.*;
import com.model.Book;
public class BookDaoImpl implements BookDao {

	@Override
	public int addBook(Book book) throws SQLException {
		String sql ="INSERT INTO book VALUES(?,?,?,?,?,?,?,?,'ÊÇ',?)";
		try(
				Connection conn=getConnection();
				PreparedStatement pstmt=conn.prepareStatement(sql)){
			pstmt.setString(1, book.getBid());
			pstmt.setString(2, book.getBname());
			pstmt.setString(3, book.getBwriter());
			pstmt.setString(4, book.getBpublish());
			pstmt.setString(5, book.getBclass());
			pstmt.setString(6, book.getBdate());
			pstmt.setFloat(7, book.getBprice());
			pstmt.setInt(8, book.getBcopy());
			pstmt.setString(9, book.getBcaseid());
			int i=pstmt.executeUpdate();
			return i;
		}catch(SQLException se){
			se.printStackTrace();
			return 0;
		}		
	}

	public int deleteBook(String isbn) throws SQLException {
		String sql ="DELETE FROM book WHERE bid=?";
		try(
				Connection conn=getConnection();
				PreparedStatement pstmt=conn.prepareStatement(sql)){
			pstmt.setString(1, isbn);
			int i=pstmt.executeUpdate();
			return i;
		}catch(SQLException se){
			return 0;
		}		
	}
	
}

