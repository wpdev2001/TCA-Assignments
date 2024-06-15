package com.wp;

import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
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
        int rid = 104;
        
        //Story of load method
        //This methods returns the object if found for particular record else it throws an exception and it follows lazy loading
        //The reason why we need to handle the exception
      
        try 
        {   
        	Student sob = (Student)session.load(Student.class, rid); // --> This line triggers an exception
        	System.out.println("Roll num: " + sob.getRno());
        	System.out.println("Name: " + sob.getName());
        	System.out.println("Percentage: " + sob.getPer());
        	System.out.println(sob); 

        }
        catch(ObjectNotFoundException oe) {

        	//oe.printStackTrace();
        	System.out.println("No record found for Roll number: " + rid);
        }
           
//       Story of get method
//		 This methods returns the object if found for particular record else it returns null
//		 The reason why we don't need to handle the exception
//        int rid = 105;
//        Student sob = (Student)session.get(Student.class, rid);
//        
//        if(sob==null) {
//        	System.out.println("No record found for Roll number: " + rid);
//        }
//        else {
//        	System.out.println("Roll num: " + sob.getRno());
//        	System.out.println("Name: " + sob.getName());
//        	System.out.println("Percentage: " + sob.getPer());
//        }
//        
//        
//        
        session.close();
        sessionFactory.close();
        
    }
}
