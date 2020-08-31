<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>图书馆管理信息系统登录页面</title>
</head>
<body>
<center>
<h1>登陆</h1>
	<form action="mlogin-check.jsp" method="post">
		<table border="1">
			<tr>
				<td colspan="2">
					管理员登录
				</td>
			</tr>
			<tr>
				<td>管理员账号：</td>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<td>登陆密码：</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
			<td colspan="2">
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<input type="reset" value="重置">
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<input type="submit" value="登陆"></td>
			</tr>		
		</table>
		<a href="mupdate.jsp">忘了密码？</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="mregister.jsp">还没有账号？</a>
	</form>
</center>
</body>
</html>