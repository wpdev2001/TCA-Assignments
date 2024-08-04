package com.wp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wp.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
    	//No. of databases == No. of cfg files == No. of objects of Configuration class
        Configuration configuration = new Configuration();
        configuration.configure(); //Load and parse cfg.xml file
        
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        
        Session session = sessionFactory.openSession();
        
        Transaction txn = session.beginTransaction();
        
        Student sob = new Student();
        sob.setRno(102);
        sob.setName("AAA");
        sob.setPer(78.00);
        
        session.save(sob);
        txn.commit();
        session.close();
        sessionFactory.close();
        
        System.out.println("Hurray.....I done My First Hibernate Application");
        
    }
}
