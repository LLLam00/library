<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>修改密码</title>
</head>
<body>
  <center>
   <h2>修改密码</h2>
   <form action="manager-update" method="post">
		<table border="1">
			<tr>
				<td colspan="2">
					修改密码
				</td>
			</tr>
			<tr>
				<td>登录账号：</td>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<td>原密码：</td>
				<td><input type="password" name="password1"></td>
			</tr>
			<tr>
				<td>新密码：</td>
				<td><input type="password" name="password2"></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="确定">
					<input type="reset" value="重置">
				</td>
			</tr>
		</table>
	</form>
   </center>
</body>
</html>