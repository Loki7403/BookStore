/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loki.util;

/**
 *
 * @author apiiit-rkv
 */
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;

public class ConnectionFactory {
    private static HikariDataSource ds=null;
    public static Connection getConnection() throws Exception{
        if(ds==null){
      FileInputStream fis=new  FileInputStream(new File("/home/apiiit-rkv/NetBeansProjects/BookStore/src/java/com/loki/util/dbconfig.properties"));
      Properties p=new Properties(); 
      p.load(fis);
      String uname=p.getProperty("db.username");
      String upass=p.getProperty("db.password");
      String url=p.getProperty("db.url");
      
      HikariConfig config=new HikariConfig();
        config.setUsername("root");
        config.setPassword("Welcome@12");
        config.setJdbcUrl("jdbc:mysql://localhost:3306/mango");
        config.setDriverClassName("com.mysql.cj.jdbc.Driver");
        
        ds= new HikariDataSource(config);}
       Connection con= ds.getConnection();
       return con;
               
               
        }
}

    
    

