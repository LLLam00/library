<%@ page contentType="text/html; charset=UTF-8"
                              pageEncoding="UTF-8"%>
<%@ page import="java.util.*,com.model.Manager" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head><title>个人信息</title></head>
<body>
<center>
<c:forEach var="manager" items="${managerList}" >
       管理员编号：
       ${manager.mid}<br>
       姓名:
       ${manager.mname}<br>
       性别：
       ${manager.msex}<br>
       年龄：
       ${manager.mage}<br>
       联系方式：
       ${manager.mtele}<br>
</c:forEach>
</center>
</body></html>
