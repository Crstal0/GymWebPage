package com.southwind.servlet;

import com.southwind.util.JDBCTools;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet(name = "LoginServlet",urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String method = request.getParameter("method");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Connection connection= JDBCTools.getConnection();
        String sql="select * from admin where username = '"+ username +"' and password = '"+password+"'";
        ResultSet resultSet=null;
        PreparedStatement preparedStatement=null;
        try {
            preparedStatement=connection.prepareStatement(sql);
            resultSet=preparedStatement.executeQuery();
            if (resultSet.next()) {
                //检索数据库，判定存在用户信息且密码正确
                 HttpSession session = request.getSession();
                 session.setAttribute("username", username);
                 response.sendRedirect("/nation");
                 } else {
                        request.setAttribute("state","wrong");
                        request.getRequestDispatcher("login.jsp").forward(request,response);
                    }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session=request.getSession();
        session.invalidate();//销毁对话，退出登录
        response.sendRedirect("login.jsp");
    }
}
