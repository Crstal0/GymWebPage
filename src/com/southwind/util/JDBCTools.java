package com.southwind.util;

import java.sql.*;

public class JDBCTools {
    private static Connection connection;
    private static String url = "jdbc:mysql://localhost:3306/prc-nation?useUnicode=true&characterEncoding=UTF-8";
    private static String user = "root";
    private static String password = "123456";
    //可以用数据库连接池改进，但考虑到并不会申请太多次，所以使用了立即申请立即释放的策略
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection() {
        try{
            connection= DriverManager.getConnection(url,user,password);
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
        return connection;
    }
    public static void release(Connection connection, Statement statement, ResultSet resultSet)
    {
        try {
            if (connection != null) {
                connection.close();
            }
            if(statement!=null)
            {
                statement.close();
            }
            if(resultSet!=null)
            {
                resultSet.close();
            }
        }catch(SQLException e)
        {
            e.printStackTrace();
        }

    }
}
