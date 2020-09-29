<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2020/9/25
  Time: 11:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery-2.0.3.js" type="text/javascript" charset="utf-8"></script>
</head>
<body>
<form action="/ee" method="post" id="form">
    <input type="text" name="a" id="a"><br>
    <input type="submit" value="提交">
</form>
<div id="div"></div>
<script>
    $("#a").blur(function () {
        $.ajax({
            url:"/woke20200923_war_exploded/ee",
            type:"get",
            data:{
                "a":$("#a").val()
            },
            success:function (data) {
                $("#div").text(data)
            }
        });
    })
</script>
</body>
</html>
