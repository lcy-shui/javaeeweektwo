<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2020/9/28
  Time: 17:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <td>姓名</td>
        <td>图片</td>
    </tr>
    <c:forEach items="${imgs}" var="img">
        <tr>
            <td>${img.name}</td>
            <td><img src="<%=application.getContextPath()%>/${img.path}"></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
