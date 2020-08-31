<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加图书信息</title>
</head>
<body>
	<p>请输入图书信息</p>
	${message}<br>
	<form action="add-book" method="post">
	图书编号：&nbsp;<input type="text" name="bid"/><br>
	书名：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="bname"/><br>
	作者：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="bwriter"/><br>
	出版社：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="bpublish"/><br>
	图书类别：&nbsp;<input type="text" name="bclass"/><br>
	出版日期：&nbsp;<input type="text" name="bdate"/><br>
	价格：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="bprice"/><br>
	数量：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="bcopy"/><br>
	书架号：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="bcaseid"/><br>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="重置"/>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="确定"/>
	
	</form>
</body>
</html>
