package com.southwind.servlet;

import com.southwind.entity.Nation;
import com.southwind.repository.NationRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "NationServlet",urlPatterns = "/nation")
public class NationServlet extends HttpServlet {
    private NationRepository nationRepository=new NationRepository();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String method=request.getParameter("method");
        String name="";
        Integer manpop=0;
        Double manrat=0.00;
        Integer womanpop=0;
        Double womanrat=0.00;
        Double mwrat=0.00;
        switch (method){
            case "add":
                name=request.getParameter("name");
                manpop= Integer.parseInt(request.getParameter("manpop"));
                manrat=Double.parseDouble(request.getParameter("manrat"));
                womanpop= Integer.parseInt(request.getParameter("womanpop"));
                womanrat=Double.parseDouble(request.getParameter("womanrat"));
                mwrat=Double.parseDouble(request.getParameter("mwrat"));
                nationRepository.add(name,manpop,manrat,womanpop,womanrat,mwrat);

                break;
            case "update":
                name=request.getParameter("name");
                manpop= Integer.parseInt(request.getParameter("manpop"));
                manrat=Double.parseDouble(request.getParameter("manrat"));
                womanpop= Integer.parseInt(request.getParameter("womanpop"));
                womanrat=Double.parseDouble(request.getParameter("womanrat"));
                mwrat=Double.parseDouble(request.getParameter("mwrat"));
                nationRepository.update(name,manpop,manrat,womanpop,womanrat,mwrat);
                break;
        }
        response.sendRedirect("/nation");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String method=request.getParameter("method");
        String name="";
        if(method==null){
            method="findAll";
        }//默认为全部查询
       switch(method)
        {
            case "findAll":
                try {
                    List<Nation> list=nationRepository.findAll();
                    request.setAttribute("list",list);
                    request.getRequestDispatcher("index.jsp").forward(request,response);

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "delete":
                name=request.getParameter("name");
                nationRepository.deleteByname(name);
                response.sendRedirect("/nation");
                break;
            case "find":
                name=request.getParameter("name");
                request.setAttribute("nation",nationRepository.findByname(name));
                request.getRequestDispatcher("update.jsp").forward(request,response);
                break;
            case "add":
                request.getRequestDispatcher("add.jsp").forward(request,response);
        }




    }
}
