<%--
  Created by IntelliJ IDEA.
  User: adminstration
  Date: 2020/8/29
  Time: 22:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<style>
    body
    {
        margin: 0;
        padding: 0;
        background-image: url(<%=request.getContextPath()%>/image/bgimg.jpg);
        background-repeat: no-repeat;
    }
    .visitor
    {
        margin: 0 auto;
        margin-top: 200px;
        padding: 20px 50px;
        background-color: #00000090;
        width: 400px;
        height: 300px;
        border-radius: 10px;
        text-align: center;
    }
    .table
    {
        border-spacing: 50px 30px;
    }
</style>
<head>
    <title>查询页面</title>
</head>
<body>
<div class="visitor">
    <h1 align="center" style="color: white">请选择您的查询方式</h1>
    <div align="center">
        <table class="table">
            <tr><th><a href="/visitor?method=findByrow" style="color: white">按民族查询</a></th></tr>
            <tr><th><a href="/visitor?method=findBycol" style="color: white">按数据种类查询</a></th></tr>
            <tr><th><a href="/analysis" style="color: white">我想看看数据的分析结果</a></th></tr>
            <tr><th><a href="login.jsp" style="color: white">以管理员身份登录</a></th></tr>
        </table>
    </div>
</div>
</body>
</html>