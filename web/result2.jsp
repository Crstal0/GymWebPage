<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: adminstration
  Date: 2020/8/30
  Time: 18:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--返回按民族查询结果--%>
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
        margin-top: 50px;
        padding: 20px 50px;
        background-color: #00000090;
        width: 400px;
        height: 600px;
        border-radius: 10px;
        text-align: center;
    }
    .table
    {
        border-spacing: 50px 15px;
    }

</style>
<head>
    <title>查询结果</title>
    <div align="center" class="result">
        <table style="color: white" align="center" class="table">
            <tr>
                <th>民族</th>
                <th><%=request.getAttribute("datatype")%></th>
            </tr>
            <c:forEach items="${data}" var="nation">
                <tr>
                    <th style="font-family: 宋体">${nation.key}</th>
                    <th style="font-family: 宋体">${nation.value}</th>
                </tr>
            </c:forEach>
        </table>
        <br><a href="/visitor?method=findBycol" style="color: white">重新选择查询数据类型</a>
        <br><a href="visitor.jsp" style="color: white">重新选择查询方式</a>
        <br><a href="login.jsp" style="color: white">我是管理员，我要修改数据</a>
    </div>
</head>
<body>

</body>
</html>
