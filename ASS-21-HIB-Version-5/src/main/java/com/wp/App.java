package com.wp;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.wp.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
    	
        Configuration configuration = new Configuration();
        configuration.configure();  //We declare this object in order to load and parse configuration file
        
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        
        Session session = sessionFactory.openSession();
        
        Transaction txn = session.beginTransaction();
        
        Student sob = new Student();
        sob.setRno(111);
        sob.setName("AAAA");
        sob.setPer(67.0);
        
        session.save(sob);
        txn.commit();
        
        System.out.println("Record Saved!!!");
        
        session.close();
        sessionFactory.close();
        
    }
}

