package com.dao;
import java.sql.*;
import com.model.Manager;
public class ManagerDaoImpl implements ManagerDao {

	@Override
	public int addManager(Manager manager) throws SQLException {
		String sql ="INSERT INTO manager VALUES(?,?,?,?,?,?)";
		try(
				Connection conn=getConnection();
				PreparedStatement pstmt=conn.prepareStatement(sql)){
			pstmt.setString(1, manager.getMid());
			pstmt.setString(2, manager.getMname());
			pstmt.setString(3, manager.getMsex());
			pstmt.setString(4, manager.getMtele());
			pstmt.setInt(5, manager.getMage());
			pstmt.setString(6, manager.getPassword());
			int i=pstmt.executeUpdate();
			return i;
		}catch(SQLException se){
			se.printStackTrace();
			return 0;
		}		
	}

	
	
}

