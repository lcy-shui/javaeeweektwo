<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2020/9/27
  Time: 19:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Object admin = session.getAttribute("login");
    if (null==admin){
        response.sendRedirect("login.jsp");
    }
%>
${applicationScope.num}人访问<br>
欢迎${login.name}登录
</body>
</html>
