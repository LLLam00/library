<%@ page contentType="text/html; charset=UTF-8"
                              pageEncoding="UTF-8"%>
<%@ page import="java.util.*,com.model.Reader" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head><title>个人信息</title></head>
<body>
<center>
<c:forEach var="reader" items="${readerList}" >
       读者编号：
       ${reader.rid}<br>
       姓名:
       ${reader.rname}<br>
       性别：
       ${reader.rsex}<br>
       读者类型：
       ${reader.rtype}<br>
       所在学院：
       ${reader.rdept}<br>
       联系方式：
       ${reader.rtele}<br>
       已借阅数：
       ${reader.bnum}<br>
</c:forEach>
</center>
</body></html>
