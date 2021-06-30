package com.southwind.servlet;

import com.southwind.entity.Nation;
import com.southwind.repository.NationRepository;
import javafx.util.Pair;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "VisitorServlet",urlPatterns = "/visitor")
public class VisitorServlet extends HttpServlet {
    private NationRepository nationRepository=new NationRepository();
    private List<Nation> list=null;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(list==null)
        {
            response.sendRedirect("visitor.jsp");
        }//防止直接输入域名跳转引发程序错误
        else
        {
            String method=request.getParameter("method");
            switch (method) {
                case "findbyrow":
                    String name = request.getParameter("name");
                    for(Nation temp:list)
                    {

                        if(temp.getName().equals(name))//根据民族名查找
                        {
                            request.setAttribute("data",temp);
                            break;
                        }
                    }
                    request.getRequestDispatcher("result1.jsp").forward(request,response);
                    break;
                case "findbycol":
                    String datatype=request.getParameter("datatype");
                    List<Pair<String,Integer>> intlist=new ArrayList<>();
                    List<Pair<String,Double>> doublelist=new ArrayList<>();
                    Pair<String,Integer> intpair=null;
                    Pair<String,Double> doublepair=null;
                    System.out.println(datatype);
                    switch (datatype){//根据请求返回对应数据类型
                        case "manpop":
                            for(Nation temp:list)
                            {
                                intpair=new Pair<>(temp.getName(),temp.getManpop());
                                intlist.add(intpair);
                            }
                            request.setAttribute("data",intlist);
                            request.setAttribute("datatype","男性人口");
                            break;
                        case "manrat":
                            for(Nation temp:list)
                            {
                                doublepair=new Pair<>(temp.getName(),temp.getManrat());
                                doublelist.add(doublepair);
                            }
                            request.setAttribute("data",doublelist);
                            request.setAttribute("datatype","男性比重（%）");
                            break;
                        case "womanpop":
                            for(Nation temp:list)
                            {
                                intpair=new Pair<>(temp.getName(),temp.getWomanpop());
                                intlist.add(intpair);
                            }
                            request.setAttribute("data",intlist);
                            request.setAttribute("datatype","女性人口");
                            break;
                        case "womanrat":
                            for(Nation temp:list)
                            {
                                doublepair=new Pair<>(temp.getName(),temp.getWomanrat());
                                doublelist.add(doublepair);
                            }
                            request.setAttribute("data",doublelist);
                            request.setAttribute("datatype","女性比重（%）");
                            break;
                        case "mwrat":
                            for(Nation temp:list)
                            {
                                doublepair=new Pair<>(temp.getName(),temp.getMwrat());
                                doublelist.add(doublepair);
                            }
                            request.setAttribute("data",doublelist);
                            request.setAttribute("datatype","男女性别比（%）");
                            break;
                    }
                    request.getRequestDispatcher("result2.jsp").forward(request,response);

            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            list=nationRepository.findAll();
            request.setAttribute("list",list);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String method=request.getParameter("method");

        switch (method) {//根据请求不同转发给不同页面
            case "findByrow":
                request.getRequestDispatcher("findbyrow.jsp").forward(request,response);
                break;
            case "findBycol":
                request.getRequestDispatcher("findbycol.jsp").forward(request,response);
                break;
        }
    }
}
