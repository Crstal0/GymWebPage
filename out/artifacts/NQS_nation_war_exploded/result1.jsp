<%--
  Created by IntelliJ IDEA.
  User: adminstration
  Date: 2020/8/30
  Time: 17:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--返回按数据类型查询结果--%>
<html>
<style>
    body
    {
        margin: 0;
        padding: 0;
        background-image: url(<%=request.getContextPath()%>/image/bgimg.jpg);
        background-repeat: no-repeat;
    }
    .result
    {
        margin: 0 auto;
        margin-top: 200px;
        padding: 20px 50px;
        background-color: #00000090;
        width: 950px;
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
    <title>查询结果</title>
</head>
<body>
    <div align="center" class="result">
        <table style="color: white" align="center" class="table">
            <tr>
                <th>民族</th>
                <th>男性人口</th>
                <th>男性比重（%）</th>
                <th>女性人口</th>
                <th>女性比重（%）</th>
                <th>男女性别比（%）</th>
            </tr>
            <tr>
                <th>${data.name}</th>
                <th>${data.manpop}</th>
                <th>${data.manrat}</th>
                <th>${data.womanpop}</th>
                <th>${data.womanrat}</th>
                <th>${data.mwrat}</th>
            </tr>
        </table>
        <br><a href="/visitor?method=findByrow" style="color: white">重新选择查询民族</a>
        <br><a href="visitor.jsp" style="color: white">重新选择查询方式</a>
        <br><a href="login.jsp" style="color: white">我是管理员，我要修改数据</a>
    </div>
</body>
</html>
