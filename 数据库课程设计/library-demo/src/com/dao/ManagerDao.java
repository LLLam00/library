package com.dao;
import java.sql.SQLException;
import com.model.Manager;

public interface ManagerDao extends Dao {
	int addManager (Manager manager) throws SQLException;
}

