package com.dao;
import java.sql.*;
import javax.sql.DataSource;
import javax.naming.*;
public interface Dao {
	public static DataSource getDataSource(){
		DataSource dataSource=null;
		try{
			Context context=new InitialContext();
			dataSource=(DataSource)context.lookup("java:comp/env/jdbc/libraryDS");
		}catch(NamingException ne){
			System.out.println("“Ï≥££∫"+ne);
		}
		return dataSource;
	}
	
	public default Connection getConnection() throws SQLException{
		DataSource datasource=getDataSource();
		Connection conn=null;
		try{
			conn=datasource.getConnection();
		}catch(SQLException se){
			System.out.println("“Ï≥££∫"+se);
		}
		return conn;	
	}
}

