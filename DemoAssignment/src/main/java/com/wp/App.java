package com.wp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wp.entities.Student;

public class App 
{
	//Configuration --> SessionFactory --> Session --> Transaction(We create this object only in case of DML statements).
    public static void main( String[] args )
    {
    	//Why do we create this object?
    	// --> I create a Configuration object to initialize and configure Hibernate settings.
        Configuration configuration = new Configuration();
        // What is the use of this?
        configuration.configure(); 
        //--> This line loads and configures Hibernate settings from the default configuration file.
        
        //What is the use of Session Factory?
        //--> Using the configured settings, I build a SessionFactory object which acts as a factory for creating session objects.
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        
        //Now, I open a session using the SessionFactory. This session represents a connection to the database for performing CRUD operations.
        Session session = sessionFactory.openSession();
        
        //Before making any changes to the database, I begin a transaction. This ensures that changes are atomic and consistent.
        Transaction transaction = session.beginTransaction();
        
        Student sob = new Student();
        sob.setRno(111);
        sob.setName("Akhil");
        sob.setPer(89.0);
        
        //I create a Student object, set its attributes (like roll number, name, and percentage), and persist it to the database using session.save(sob);.
        session.save(sob);
        
        //After successfully saving the data, I commit the transaction to make the changes permanent in the database.
        transaction.commit();
        
        session.close();
        sessionFactory.close();
        
        System.out.println("Build hibernate application");
        
        
        
    }
}
