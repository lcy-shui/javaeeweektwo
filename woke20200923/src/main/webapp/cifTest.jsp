<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="service.EmployeeService" %>
<%@ page import="service.impl.EmloyeeServiceImpl" %>
<%@ page import="entity.Employee" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2020/9/24
  Time: 10:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%
        EmployeeService employeeService=new EmloyeeServiceImpl();
        List<Employee> employees=employeeService.sel("",1);
        request.setAttribute("name",employees.get(0).getEMP_NAME());
    %>
</head>
<body>
<c:if test="${name!=null}" var="ename" scope="request"/>
<c:if test="${ename}">
    欢迎${name}登录
</c:if>
<c:if test="${!ename}">
    没登陆
</c:if>
</body>
</html>
