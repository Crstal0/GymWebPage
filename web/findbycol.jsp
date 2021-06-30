<%--
  Created by IntelliJ IDEA.
  User: adminstration
  Date: 2020/8/30
  Time: 17:52
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
    .findbycol
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
    <title>按数据查询</title>
</head>
<body>
    <div align="center" class="findbycol">
        <h1 style="color: white">请选择您要查询的数据类型</h1>
        <form action="/visitor?method=findbycol" method="post">
            <select name="datatype" class="select" style="background: white">
                <option value="manpop">男性人口</option>
                <option value="manrat">男性比重（%）</option>
                <option value="womanpop">女性人口</option>
                <option value="womanrat">女性比重（%）</option>
                <option value="mwrat">男女性别比（%）</option>
            </select>
            <br>
            <input type="submit" value="提交" class="submitbutton">
        </form>
    </div>
</body>
</html>
