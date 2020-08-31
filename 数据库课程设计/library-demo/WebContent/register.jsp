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
   <form action="reader-register" method="post">
		<table border="1">
			<tr>
				<td colspan="2">
					注册新用户
				</td>
			</tr>
			<tr>
			<td>学号/工号：</td>
			<td><input type="text" name="rid"></td>
			</tr>
			<tr>
			<td>姓名：</td>
			<td><input type="text" name="rname"></td>
		    </tr>
		    <tr>
			<td>性别：</td>
			<td>男<input type="radio" name="rsex">
			    女<input type="radio" name="rsex"></td>
		    </tr>
		    <tr>
			<td>读者类型：</td>
			<td><select name="rtype">
			        <option value="rtype">学生</option>
			         <option value="rtype">教师</option>
			</select></td>
		    </tr>
		       <tr>
			<td>学院：</td>
			<td><input type="text" name="rdept"></td>
		    </tr>
		    <tr>
			<td>联系方式：</td>
			<td><input type="text" name="rtele"></td>
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