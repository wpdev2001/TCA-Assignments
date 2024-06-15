package com.wp;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wp.entities.Student;


public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	//Programmatic Approach is not usually preferred bcz it creates a problem of Hard coded programming
        Configuration configuration = new Configuration();
        //Programmatic way of setting configuration details
        configuration.setProperty("hibernate.connection.driver_class","com.mysql.cj.jdbc.Driver");
        configuration.setProperty("hibernate.connection.url","jdbc:mysql://localhost:3306/hfbdb");
        configuration.setProperty("hibernate.connection.username","root");
        configuration.setProperty("hibernate.connection.password","root2001");
        configuration.setProperty("hibernate.dialect","org.hibernate.dialect.MySQL5Dialect");
        configuration.setProperty("hibernate.show_sql","true");
        configuration.setProperty("hibernate.hbm2ddl.auto","create");
        configuration.setProperty("hibernate.format_sql","false");
        
        configuration.addAnnotatedClass(Student.class);
        
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        
        Session session = sessionFactory.openSession();
        
        Transaction txn = session.beginTransaction();
        
        Student sob = new Student();
        sob.setRno(101);
        sob.setName("AAA");
        sob.setPer(88.0);
        
        session.save(sob);
        txn.commit();
        
        System.out.println("First HIB application on AWS EC2 instance!!!");
        
        session.close();
        sessionFactory.close();
        
        
        
    }
}
