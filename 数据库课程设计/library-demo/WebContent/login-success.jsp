<%@ page language="java" import="java.util.*" contentType="text/html; 
charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="UTF-8">
<title>图书馆官网</title>
</head>
<body>
<p align="right">
欢迎<a href="show-reader"><%=session.getAttribute("rname")%></a>登录图书馆官网！
</p>
<p align="right">
<a href="update.jsp">修改密码</a>
<a href="login.jsp">退出</a>
</p>
<br><br><br><br><br>
<p align="center"><a href="book-search">查询所有在馆可借图书</a></p>
<form action="book-search" method="post">
<p align="center">
<input type="text" name="keyword" size="30">
<input type="submit" value="查询">
</p>
</form> 
</body>
</html>