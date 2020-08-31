<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>欢迎页面</title>
</head>
<body>
<p align="center"><font color="blue" size="50px">欢迎登录图书管理系统</font></p>
<p align="right">
欢迎<font color="blue"><%=session.getAttribute("mname")%></font>登录图书管理系统！
<a href="mupdate.jsp">修改密码</a>
<a href="mlogin.jsp">退出</a>
</p>
<p><font size="4px">更多操作</font></p>
<p><a href="show-manager"><font size="5px">个人信息</font></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<font color="blue" size="5px">读者管理</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<font color="blue" size="5px">图书管理</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<font color="blue" size="5px">借阅管理</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<font color="blue" size="5px">查询</font></p>

<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
读者信息修改
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="add-book.jsp">新书入库</a>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
借阅处理
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
读者信息查询
</p>
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
读者信息注销
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
销书处理
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
归还处理
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="search.jsp">图书信息查询</a>
</p>
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
图书信息修改
&nbsp;&nbsp;&nbsp;&nbsp;
罚款处理
</p>

</body>
</html> 