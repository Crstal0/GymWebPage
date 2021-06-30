package com.southwind.repository;

//import com.mysql.cj.protocol.Resultset;
import com.southwind.entity.Nation;
import com.southwind.util.JDBCTools;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class NationRepository {
    public List<Nation> findAll() throws SQLException {
        List<Nation> list = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {

            connection=JDBCTools.getConnection();
            String sql = "select * from nation";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            Nation nation = null;
            while (resultSet.next()) {
                String name = resultSet.getNString(1);
                Integer manpop = resultSet.getInt(2);
                Double manrat = resultSet.getDouble(3);
                Integer womanpop = resultSet.getInt(4);
                Double womanrat = resultSet.getDouble(5);
                Double mwrat = resultSet.getDouble(6);
                nation = new Nation(name, manpop, manrat, womanpop, womanrat, mwrat);
                list.add(nation);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCTools.release(connection,preparedStatement,resultSet);
        }
        return list;
    }
    public void add(String name,Integer manpop,Double manrat,Integer womanpop,Double womanrat,Double mwrat)
    {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {

            connection = JDBCTools.getConnection();
            String sql = "insert into nation(name,manpop,manrat,womanpop,womanrat,mwrat) values(?,?,?,?,?,?)";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,name);
            preparedStatement.setInt(2,manpop);
            preparedStatement.setDouble(3,manrat);
            preparedStatement.setInt(4,womanpop);
            preparedStatement.setDouble(5,womanrat);
            preparedStatement.setDouble(6,mwrat);
            preparedStatement.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCTools.release(connection,preparedStatement,null);
        }
    }
    public void deleteByname(String name)  {
        Connection connection =null;
        PreparedStatement preparedStatement=null;
        connection=JDBCTools.getConnection();
        String sql="delete from nation where name = ?";

        try{
            preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,name);
            preparedStatement.executeUpdate();
        }catch (SQLException e)
        {
            e.printStackTrace();
        }finally {
            JDBCTools.release(connection,preparedStatement,null);
        }
    }
    public Nation findByname(String name) {
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        Nation nation=null;
        connection=JDBCTools.getConnection();
        String sql="select * from nation where name = ?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,name);
            resultSet=preparedStatement.executeQuery();
            while(resultSet.next()){

                Integer manpop = resultSet.getInt(2);
                Double manrat = resultSet.getDouble(3);
                Integer womanpop = resultSet.getInt(4);
                Double womanrat = resultSet.getDouble(5);
                Double mwrat = resultSet.getDouble(6);
                nation = new Nation(name, manpop, manrat, womanpop, womanrat, mwrat);

            }
        }catch (SQLException e)
        {
            e.printStackTrace();
        }finally {
            JDBCTools.release(connection,preparedStatement,resultSet);
        }
        return nation;
    }
    public void update(String name,Integer manpop,Double manrat,Integer womanpop,Double womanrat,Double mwrat)
    {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {

            connection = JDBCTools.getConnection();
            String sql = "update nation set manpop=?,manrat=?,womanpop=?,womanrat=?,mwrat=? where name=?";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(6,name);
            preparedStatement.setInt(1,manpop);
            preparedStatement.setDouble(2,manrat);
            preparedStatement.setInt(3,womanpop);
            preparedStatement.setDouble(4,womanrat);
            preparedStatement.setDouble(5,mwrat);
            preparedStatement.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCTools.release(connection,preparedStatement,null);
        }
    }

}