package com.dao;
import java.sql.SQLException;
import com.model.Reader;

public interface ReaderDao extends Dao {
	int addReader (Reader reader) throws SQLException;
}

