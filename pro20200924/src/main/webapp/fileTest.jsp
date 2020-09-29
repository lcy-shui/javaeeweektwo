<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2020/9/28
  Time: 16:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/0924/cc?op=add" method="post" enctype="multipart/form-data">
    <input type="text" name="name"><br>
    <input type="file" name="file" multiple><br>
    <input type="submit" value="提交">
</form>
<a href="/0924/cc?op=sel">查询图片</a>
</body>
</html>
