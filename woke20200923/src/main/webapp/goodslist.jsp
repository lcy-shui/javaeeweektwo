<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2020/9/25
  Time: 18:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery-2.0.3.js" type="text/javascript" charset="utf-8"></script>
</head>
<body>
<input type="text" id="name"><br>
<button id="btn">搜索</button>
<div id="div"></div>
<script>
    $("#btn").click(function () {
        var name=$("#name").val();
        $.ajax({
            url:"/woke20200923_war_exploded/ff",
            type:"get",
            data:{
                "name":name
            },
            success:function (data) {
                var goods=JSON.parse(data);
                $.each(goods,function (i,good) {
                    $("#div").append(good.id);
                   $("#div").append(good.name);
                    $("#div").append(good.price+"<br>");
                });
            }
        });
    })
</script>
</body>
</html>
