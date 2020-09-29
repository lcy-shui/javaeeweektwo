<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2020/9/23
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="css/bootstrap.css" />
    <script src="js/jquery-2.0.3.js" type="text/javascript" charset="utf-8"></script>
    <script src="js/bootstrap.js" type="text/javascript" charset="utf-8"></script>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-lg-4">

        </div>
        <div class="col-lg-4" style="width: 100%;background-color: antiquewhite;text-align: center;line-height: 100px">
            雇员查询系统
        </div>
        <div class="col-lg-4">

        </div>
    </div>
    <div class="row">
        <div class="col-lg-4">

        </div>
        <div class="col-lg-4" style="width: 100%;background-color: antiquewhite;text-align: center;line-height: 100px">
            <form id="zform" action="/woke20200923_war_exploded/aa" method="post">
                <div class="form-group">
                    <label for="exampleInputEmail1">员工姓名</label>
                    <input type="text" class="form-control" id="exampleInputEmail1" placeholder="请输入查询员工姓名" name="ename">
                </div>
                <select class="form-control" name="job" id="con">
                    <option value="" id="null"></option>
                    <option value="1">行政助理</option>
                    <option value="2">业务经理</option>
                    <option value="3">总经理</option>
                </select>
                <button type="submit" class="btn btn-default">查询</button>
            </form>
        </div>
        <div class="col-lg-4">

        </div>
    </div>
</div>
<script type="text/javascript">
    $("#con").click(function(){
        $("#null").remove();
    })
    $("#zform").submit(function(){
        var flag=false;
        var a=$("#null").val();
        if(a!=null){
            alert("请选择职位");
            return false;
        }
    })
</script>
</body>
</html>
