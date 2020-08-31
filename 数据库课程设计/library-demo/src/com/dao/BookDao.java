package com.dao;
import java.sql.SQLException;
import com.model.Book;

public interface BookDao extends Dao {
	int addBook (Book book) throws SQLException;
	int deleteBook (String isbn) throws SQLException;
}

