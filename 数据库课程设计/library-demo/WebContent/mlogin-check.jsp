<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<html>
<head><title>登录检查页面</title></head>
<body>
<center>
<h1>登陆操作</h1>
<hr>
<%!	// 定义若干个数据库的连接常量
	public static final String DBDRIVER = "org.gjt.mm.mysql.Driver" ;
	public static final String DBURL = "jdbc:mysql://localhost:3306/library" ;
	public static final String DBUSER = "root" ;
	public static final String DBPASS = "980902" ;
%>
<%
    request.setCharacterEncoding("UTF-8");
    Connection conn = null ;		// 数据库连接
	PreparedStatement pstmt = null ;	// 数据库预处理操作
	ResultSet rs = null ;		// 查询要处理结果集
	boolean flag = false ;	// 保存标记
%>
<%
try{
%>
<%
	Class.forName(DBDRIVER) ;
	conn = DriverManager.getConnection(DBURL,DBUSER,DBPASS) ;
	String sql = "SELECT mname FROM library.manager WHERE mid=? AND password=?;";
	pstmt = conn.prepareStatement(sql) ;
	pstmt.setString(1,request.getParameter("id")) ;
	pstmt.setString(2,request.getParameter("password")) ;
	rs = pstmt.executeQuery() ;	// 查询
	if(rs.next()){	// 如果有数据，则可以执行
		flag = true ;	//  表示登陆成功
		String mname = rs.getString(1) ;
		session.setAttribute("mname", mname);
		out.print(mname);
		
	}	
%>
<%
}catch(Exception e)	{
	e.printStackTrace() ;
}
finally{
	try{
		if(rs!=null) rs.close() ;
		if(pstmt!=null) pstmt.close() ;
		if(conn!=null) conn.close() ;
	} catch(Exception e){}
}
%>
<%
	if(flag){	// 登陆成功
%>
		 <jsp:forward page="welcome.jsp"/>
<%
	} else {		// 登陆失败
%>
		<jsp:forward page="login-failure.jsp"/>
<%
	}
%>
</center>
</body>
</html>