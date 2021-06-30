package com.southwind.servlet;

import com.southwind.entity.Nation;
import com.southwind.entity.NationData;
import com.southwind.repository.NationRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "AnalysisServlet",urlPatterns = "/analysis")
public class AnalysisServlet extends HttpServlet {
    private NationRepository nationRepository=new NationRepository();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double totalman=1.0;
        double totalwoman=1.0;
        double tempman=1.0;
        double tempwoman=1.0;
        try {//取出数据进行分析
            List<Nation> list=nationRepository.findAll();
            List<NationData> listdata=new ArrayList<>();
            NationData nationData=null;

            for(Nation temp:list)
            {
                if (temp.getName().equals("合计"))
                {
                    totalman=temp.getManpop().doubleValue();
                    totalwoman=temp.getWomanpop().doubleValue();
                }
            }
            for(Nation temp:list) {
                if (temp.getName().equals("合计")) {
                    System.out.println(temp.getName());
                    continue;

                } else {
                    System.out.println("done " + temp.getName());
                    tempman = temp.getManpop().doubleValue();
                    tempwoman = temp.getWomanpop().doubleValue();
                    tempman = tempman / totalman*100;
                    tempwoman = tempwoman / totalwoman*100;
                    tempman = Double.valueOf(String.format("%.2f", tempman));
                    tempwoman = Double.valueOf(String.format("%.2f", tempwoman));
                    nationData = new NationData(temp.getName(), tempman, tempwoman);
                    System.out.println(nationData);
                    listdata.add(nationData);
                }
            }
                request.setAttribute("data",listdata);
                System.out.println(listdata);
                request.getRequestDispatcher("analysis.jsp").forward(request,response);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
