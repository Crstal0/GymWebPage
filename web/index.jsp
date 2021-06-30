<%--
  Created by IntelliJ IDEA.
  User: adminstration
  Date: 2020/8/28
  Time: 16:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
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
    border-spacing: 50px 30px;
  }
</style>

  <head>
    <title>查询系统管理</title>

  </head>

  <br>
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
<%--检验是否登录，直接键入域名访问会跳转至登录页面--%>
<div align="center">
  <h1 style="color: white">网络查询系统</h1>
  <table style="color: white" class="table">
    <tr>
      <th>民族</th>
      <th>男性人口</th>
      <th>男性比重（%）</th>
      <th>女性人口</th>
      <th>女性比重（%）</th>
      <th>男女性别比（%）</th>
      <th>操作</th>
    </tr>
    <c:forEach items="${list}" var="nation">
      <tr>
        <td>${nation.name}</td>
        <td>${nation.manpop}</td>
        <td><fmt:formatNumber value="${nation.manrat}" pattern="0.00"></fmt:formatNumber> </td>
        <td>${nation.womanpop}</td>
        <td><fmt:formatNumber value="${nation.womanrat}" pattern="0.00"></fmt:formatNumber> </td>
        <td><fmt:formatNumber value="${nation.mwrat}" pattern="0.00"></fmt:formatNumber> </td>
<%--        按两位小数输出--%>
        <td>
          <a href="/nation?method=delete&name=${nation.name}" class="button">删除</a>
          <a href="/nation?method=find&name=${nation.name}" class="button">修改</a>
        </td>
      </tr>
    </c:forEach>
  </table>
  <a href="/nation?method=add" class="button">添加</a></br>
</div>
  <div align="right">
    <a href="/login" class="button">退出登录</a>
  </div>
  </body>
</html>