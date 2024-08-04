package com.wp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wp.entities.Student;
import com.wp.entities.StudentCompositeKey;

public class App 
{
    public static void main( String[] args )
    {
        Configuration configuration = new Configuration();
        configuration.configure(); //Load and parse cfg.xml file
        
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        
        Session session = sessionFactory.openSession();
        
        Transaction txn = session.beginTransaction();
        
//		  Logic for saving the data into database        
//        Student sob = new Student();
//        
//        sob.setFname("RRR");
//        sob.setLname("QQQ");
//        sob.setCity("Pune"); 
//        session.save(sob);
       
//        Logic for fetching the city name of given primary key
        StudentCompositeKey ck = new StudentCompositeKey();
        ck.setFname("RRR");
        ck.setLname("QQQ");
        
        Student sob = (Student)session.get(Student.class, ck);
        System.out.println("CITY : " + sob.getCity());
        
        txn.commit();
        session.close();
        sessionFactory.close();
        
        System.out.println("Hibernate app Composite Key demo..");
        
    }
}