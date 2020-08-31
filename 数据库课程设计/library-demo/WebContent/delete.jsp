<%@ page contentType="text/html; charset=UTF-8" %>
<jsp:useBean id="book" type="com.model.Book" 
scope="session"></jsp:useBean>
<html>
<head><title>图书信息</title></head>
<body>
<table border="1">
<tr><td>图书号：</td>
<td>图书名称： </td>
<td>作者 ： </td>
<td>出版社：</td>
<td>图书类型：</td>
<td>图书所在书架：</td>
<td>图书是否可借：</td>
</tr>
<tr>
<td><jsp:getProperty name="book" property="bid" /></td>
<td><jsp:getProperty name="book" property="bname" /></td>
<td><jsp:getProperty name="book" property="bwriter" /></td>
<td><jsp:getProperty name="book" property="bpublish" /></td>
<td><jsp:getProperty name="book" property="bclass" /></td>
<td><jsp:getProperty name="book" property="bcaseid" /></td>
<td><jsp:getProperty name="book" property="bstate" /></td>
 <td><a href="delete-book?id=<%=session.getAttribute("bid") %>">删除</a></td>
</tr>
</table>
</body></html>