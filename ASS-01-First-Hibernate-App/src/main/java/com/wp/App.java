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
        Configuration configuration = new Configuration();
        configuration.configure();
        
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        
        Session session = sessionFactory.openSession();
        
        Transaction txn = session.beginTransaction(); //We need this object only in case of DML operations
        
        Student sob = new Student();
        
        sob.setRno(101);
        sob.setName("AAA");
        sob.setPer(79.0);
        
        session.save(sob);
        
        txn.commit();
        
        session.close();
        sessionFactory.close();
        
        System.out.println("Hurry....I have done my First Hibernate Application!!!");
               
        
    }
}
