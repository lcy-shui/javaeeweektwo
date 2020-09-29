<%@ page import="java.util.List" %>
<%@ page import="entity.Employee" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2020/9/23
  Time: 18:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="css/bootstrap.css" />
    <script src="js/jquery-2.0.3.js" type="text/javascript" charset="utf-8"></script>
    <script src="js/bootstrap.js" type="text/javascript" charset="utf-8"></script>
    <%
        List<Employee> employees= (List<Employee>) request.getAttribute("list");
    %>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-lg-12">
            <table class="table table-striped">
                <caption>查询结果</caption>
                <thead>
                <tr>
                    <th>编号</th>
                    <th>部门号</th>
                    <th>姓名</th>
                    <th>性别</th>
                    <th>年龄</th>
                    <th>部门</th>
                    <th>工龄</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${list}" var="employee">
                    <tr>
                        <th>${employee.id}</th>
                        <th>${employee.POST_TYPE}</th>
                        <th>${employee.EMP_NAME}</th>
                        <th>${employee.EMP_SEX==1?"男":"女"}</th>
                        <th>${employee.EMP_AGE}</th>
                        <th>${employee.EMP_DEPART}</th>
                        <th>${employee.EMP_YEAR}</th>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>
