package com.dao;
import java.sql.*;
import com.model.Reader;
public class ReaderDaoImpl implements ReaderDao {

	@Override
	public int addReader(Reader reader) throws SQLException {
		String sql ="INSERT INTO reader VALUES(?,?,?,?,?,'2019-09-01','10','0','30Ìì',?,?)";
		try(
				Connection conn=getConnection();
				PreparedStatement pstmt=conn.prepareStatement(sql)){
			pstmt.setString(1, reader.getRid());
			pstmt.setString(2, reader.getRname());
			pstmt.setString(3, reader.getRsex());
			pstmt.setString(4, reader.getRtype());
			pstmt.setString(5, reader.getRdept());
			pstmt.setString(6, reader.getRtele());
			pstmt.setString(7, reader.getIdpassword());
			int i=pstmt.executeUpdate();
			return i;
		}catch(SQLException se){
			se.printStackTrace();
			return 0;
		}		
	}

	
	
}

