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
        configuration.configure(); //Load and parse cfg file
        
        //let me know why do we create this object?
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        
        //Let me know why do we create this object?
        Session session = sessionFactory.openSession();
        
        //Let me know why we create a transaction object?
        Transaction txn = session.beginTransaction();
        
        Student sob = new Student();
        sob.setRno(102);
        sob.setName("BBB");
        sob.setPer(59.99);
        sob.setAge(20);
        
        
        //What does save method do internally?
        session.save(sob);
        txn.commit();
        session.close();
        sessionFactory.close();
        
        System.out.println("Hurray I have build my first Hibernate application");
        
        
        
    }
}
