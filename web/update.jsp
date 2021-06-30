<%--
  Created by IntelliJ IDEA.
  User: adminstration
  Date: 2020/8/29
  Time: 11:44
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
    .inputtable {
        margin: 0 auto;
        margin-top: 200px;
        padding: 20px 50px;
        background-color: #00000090;
        width: 400px;
        height: 400px;
        border-radius: 10px;
        text-align: center;
    }
    .button
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
    <title>修改</title>
</head>
<body>
<%
    String name="";
%>
<%
    name=(String)session.getAttribute("username");
    if(name==null)
    {
        response.sendRedirect("login.jsp");
    }
%>
<div align="center" class="inputtable">
    <form action="/nation" method="post"/>
    <h1 style="color: white">请输入您要修改的值</h1>
    <table style="color: white">
        <tr><th>民族：</th><th><input type="text" name="name" value="${nation.name}" readonly/></th>
        <tr><th>男性人口：</th><th><input type="text" name="manpop" value="${nation.manpop}"/></th>
        <tr><th>男性比重（%）：</th><th><input type="text" name="manrat" value="${nation.manrat}"/></th>
        <tr><th>女性人口：</th><th><input type="text" name="womanpop" value="${nation.womanpop}" /></th>
        <tr><th>女性比重（%）：</th><th><input type="text" name="womanrat" value="${nation.womanrat}"/></th>
        <tr><th>男女性别比（%）：</th><th><input type="text" name="mwrat" value="${nation.mwrat}"/></th>
    </table>
        <input type="hidden" name="method" value="update">
        <br><input type="submit" value="修改" class="button"/>
    </form>
    <a href="/nation" style="color: white">返回</a>
</div>
</body>
</html>