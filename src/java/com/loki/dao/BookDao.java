/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loki.dao;

/**
 *
 * @author apiiit-rkv
 */
import com.loki.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
public class BookDao {
    private static final String t="INSERT INTO BK VALUES (?,?,?)";
    public boolean saveBook(int bookid,String bname,double price) throws Exception{
        Connection con=ConnectionFactory.getConnection();
        PreparedStatement stmt=con.prepareStatement(t);
        stmt.setInt(1,bookid);
        stmt.setString(2, bname);
        stmt.setDouble(3, price);
        
      int count=stmt.executeUpdate();
      con.close();
      return count>0;
     
    }
    
}
