<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: adminstration
  Date: 2020/9/1
  Time: 15:13
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
    .button
    {
        -webkit-border-radius: 2px;
        -moz-border-radius: 2px;
        border-radius: 10px;
        border: solid 1px #20538D;
        text-shadow: 0 -1px 0 rgba(0, 0, 0, 0.4);
        -webkit-box-shadow: inset 0 1px 0 rgba(255, 255, 255, 0.4), 0 1px 1px rgba(0, 0, 0, 0.2);
        -moz-box-shadow: inset 0 1px 0 rgba(255, 255, 255, 0.4), 0 1px 1px rgba(0, 0, 0, 0.2);
        box-shadow: inset 0 1px 0 rgba(255, 255, 255, 0.4), 0 1px 1px rgba(0, 0, 0, 0.2);
        background: linear-gradient(to right, #b8cbb8 0%, #b8cbb8 0%, #b465da 0%, #cf6cc9 33%, #ee609c 66%, #ee609c 100%);
        color: #FFF;
        padding: 3px 10px;
        text-decoration: none;

    }
    .table
    {
        border-spacing: 30px 30px;
    }
    .bigbox
    {
        margin: 0 auto;
        margin-top: 50px;
        padding: 20px 50px;
        background-color: #00000090;
        width: 600px;
        height: 800px;
        border-radius: 10px;
        text-align: center;
    }
</style>
<head>
    <title>数据分析</title>
</head>
<% System.out.println(request.getAttribute("data"));%>
<body>
    <div align="center" class="bigbox">
        <h1 style="color: white">数据分析</h1>
        <table style="color: white" class="table">
            <tr>
                <th>民族</th>
                <th>男性人口占全国男性人口比重（%）</th>
                <th>女性人口占全国女性人口比重（%）</th>
            </tr>
            <c:forEach items="${data}" var="nation">
                <tr>
                <td>${nation.name}</td>
                <td align="center"><fmt:formatNumber value="${nation.manrat}" pattern="0.00"></fmt:formatNumber></td>
                <td align="center"><fmt:formatNumber value="${nation.womanrat}" pattern="0.00"></fmt:formatNumber></td>
                </tr>
            </c:forEach>

        </table>
        <a href="visitor.jsp" style="color: white">返回</a>
    </div>
</body>
</html>