<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2020/9/24
  Time: 16:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery-2.0.3.js" type="text/javascript" charset="utf-8"></script>
</head>
<body>
<form method="post" action="/woke20200923_war_exploded/cc">
    <input type="text" id="pagenow" name="pagenow" value="${page.pageNow}">页数<br>
    <input type="text" id="limit" name="limit" value="${page.pageSize}">/页<br>
    <input type="submit" value="分页">
</form>
<c:forEach items="${page.list}" var="emp">
    ${emp}<br>
</c:forEach>
<script>
    var pagenow=$("#pagenow").val();
    var limit=$("#limit").val();
    if (pagenow==null&&limit==null){
        <%
        request.getRequestDispatcher("/woke20200923_war_exploded/cc?pagenow=1&limit=5");
        %>
    }
</script>
</body>
</html>
