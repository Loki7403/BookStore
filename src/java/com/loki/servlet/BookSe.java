/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.loki.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author apiiit-rkv
 */
import com.loki.dao.BookDao;
@WebServlet(name = "BookSe", urlPatterns = {"/bookservlet"})
public class BookSe extends HttpServlet {
    public void doGet(HttpServletRequest req,HttpServletResponse resp){
        try{
        String id=req.getParameter("bookid");
        String name=req.getParameter("bookname");
        String pri=req.getParameter("bprice");
        int booid=Integer.parseInt(id);
        double boopri=Double.parseDouble(pri);
        BookDao b=new BookDao();
        boolean status=b.saveBook(booid,name,boopri);
        String response=null;
        if(status){
            response="Record Inserted";
        }
        else{
        response="Record not inserted";
        }
        PrintWriter pw=resp.getWriter();
        pw.append(response);}
        
        catch(Exception e){
            e.printStackTrace();
        }
        
        
        
        
        
    
        
    }

   
}
