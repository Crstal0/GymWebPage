<%--
  Created by IntelliJ IDEA.
  User: adminstration
  Date: 2020/8/29
  Time: 16:25
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
        #bigBox
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
        #bigBox .loginButton
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
    <title>网络查询系统</title>
    <head>
</head>
<body>
<div id="bigBox" style="text-align: center;">
    <h1 style="color:white">管理员登录</h1>
<%--    <form id="indexform" name="indexForm" action="logincheck.jsp" method="post">--%>
        <form action="/login" method="post">
        <table align="center">
            <tr>
                <td style="color: white">账号：</td>
                <td><input type="text" name="username"></td>
            </tr>
            <tr>
                <td style="color: white">密码：</td>
                <td><input type="password" name="password">
                </td>
            </tr>
        </table>
        <input class="loginButton" type="submit" value="登录" style="color: white">
    </form>
    <%if(request.getAttribute("state")!=null){%>
    <div style="color: red">用户名或密码错误</div>
    <%}%>
    <a href="visitor.jsp" style="color: white">以访客身份浏览</a>

</div>
</body>
</html>