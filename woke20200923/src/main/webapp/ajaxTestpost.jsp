<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2020/9/25
  Time: 10:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script>
        var xm;
        window.onload=function (ev) {
            document.getElementById("btn").onclick=function () {
                var a=document.getElementById("a").value;
                if (window.XMLHttpRequest){
                    xm=new XMLHttpRequest();
                } else {
                    xm=new ActiveXObject("Mirosoft.XMLHTTP")
                }
                xm.onreadystatechange=back;
                xm.open("get","/woke20200923_war_exploded/dd?a="+a,true);
                xm.send(null)
            }
        }
        function back() {
            if (xm.readyState==4) {
                if ((xm.status==200)) {
                    var s=xm.responseText;
                    document.getElementById("div").innerText=s;
                }
            }
        }
    </script>
</head>
<body>
<input type="text" name="a" id="a"><br>
<button id="btn">按钮</button>
<div id="div"></div>
</body>
</html>
