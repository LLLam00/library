<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>注册页面</title>
</head>
<body>
   <center>
   <h2>注册</h2><hr>
   <form action="manager-register" method="post">
		<table border="1">
			<tr>
				<td colspan="2">
					注册新用户
				</td>
			</tr>
			<tr>
			<td>用户账号（手机号或QQ号）：</td>
			<td><input type="text" name="mid"></td>
			</tr>
			<tr>
			<td>姓名：</td>
			<td><input type="text" name="mname"></td>
		    </tr>
		    <tr>
			<td>性别：</td>
			<td>男<input type="radio" name="msex">
			    女<input type="radio" name="msex"></td>
		    </tr>
		    <tr>
			<td>联系方式：</td>
			<td><input type="text" name="mtele"></td>
		    </tr>
		    <tr>
			<td>年龄：</td>
			<td><input type="text" name="mage"></td>
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
			    <input type="submit" value="注册">
				</td>
			</tr>
		</table>
	</form>
	已注册？<a href="login.jsp">点击登录</a>
   </center>
</body>
</html>