<%--
  Created by IntelliJ IDEA.
  User: adminstration
  Date: 2020/8/30
  Time: 16:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<style>
    body
    {
        margin: 0;
        padding: 0;
        background-image: url(<%=request.getContextPath()%>/image/bgimg.jpg);
        background-repeat: no-repeat;
    }
    .findbyrow
    {
        margin: 0 auto;
        margin-top: 200px;
        padding: 20px 50px;
        background-color: #00000090;
        width: 400px;
        height: 200px;
        border-radius: 10px;
        text-align: center;
    }
    .submitbutton
    {
        margin-top: 30px;
        width: 150px;
        height: 25px;
        color: white;
        border: 0;
        border-radius: 20px;
        background-image: linear-gradient(to right, #b8cbb8 0%, #b8cbb8 0%, #b465da 0%, #cf6cc9 33%, #ee609c 66%, #ee609c 100%);
    }
</style>
<head>
    <title>按民族查询</title>
</head>
<body>
    <div align="center" class="findbyrow">
        <h1 style="color: white">请选择您要查询的民族</h1>
        <form action="/visitor?method=findbyrow" method="post">
            <select name="name" style="background: white">
                <c:forEach items="${list}" var="nation">
                    <option value="${nation.name}">${nation.name}</option>
                </c:forEach>
            </select>
            <br>
            <input type="submit" value="提交" class="submitbutton">
        </form>
    </div>
</body>
</html>
