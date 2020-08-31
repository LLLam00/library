<%@ page contentType="text/html; charset=UTF-8"
                              pageEncoding="UTF-8"%>
<%@ page import="java.util.*,com.model.Book" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head><title>显示所有图书信息</title></head>
<body>
<table border="1">
<tr><td>图书号</td><td>图书名称</td><td>作者</td>
<td>出版社</td><td>图书类别</td><td>所在书架号</td>
<td>图书是否可借</td></tr>
<c:forEach var="book" items="${bookList}" >
   <tr><td>${book.bid}</td>
       <td>${book.bname}</td>
       <td>${book.bwriter}</td>
       <td>${book.bpublish}</td>
       <td>${book.bclass}</td>
       <td>${book.bcaseid}</td>
       <td>${book.bstate}</td>
       <td><a href="delete-book?bid=${book.bid}">删除</a></td>
    </tr>
</c:forEach>
</table>
</body></html>
