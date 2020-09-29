<%@ page import="service.EmpService" %>
<%@ page import="service.impl.EmpServiceImpl" %>
<%@ page import="entity.Emp" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2020/9/23
  Time: 9:52
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%
        EmpService empService=new EmpServiceImpl();
        List<Emp> sel = empService.sel();
        request.setAttribute("emp",sel.get(0));
    %>
</head>
<body>
${param.username}----
${paramValues.password}----
${pageContext.request}----
${emp}----
<c:set target="${emp}" property="ename" value="阿大"/>
${emp}<br>
${"<a href='www.baidu.com'>百度</a>"}
<c:out value="<a href='www.baidu.com'>百度</a>"/>
<c:out escapeXml="false" value="<a href='www.baidu.com'>百度</a>"/>
</body>
</html>
