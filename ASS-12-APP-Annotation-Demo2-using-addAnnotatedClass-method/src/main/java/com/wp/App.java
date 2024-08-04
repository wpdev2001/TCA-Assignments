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
    	
    	configuration.addAnnotatedClass(Student.class);
    	
    	SessionFactory sessionFactory = configuration.buildSessionFactory();
    	
    	Session session = sessionFactory.openSession();
    	
    	Transaction txn  = session.beginTransaction();
    	
    	Student sob = new Student();
    	
    	sob.setRno(101);
    	sob.setName("AAA");
    	sob.setPer(87.0);
    	
    	session.save(sob);
    	txn.commit();
    	
    	System.out.println("Record Saved!!!!");
    	session.close();
    	sessionFactory.close();
    	
    }
}

