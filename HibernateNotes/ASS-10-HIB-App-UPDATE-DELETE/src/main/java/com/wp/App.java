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
    	Configuration configuration  = new Configuration();
        configuration.configure();

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction txn = session.beginTransaction();

        Student sob = new Student();
        sob.setRno(111);
        sob.setName("AAAA");
        sob.setPer(66.0);

//         2. To update record in database
//          -- update() - UPDATE
//              Existing record will be updated based on <id> or primary key otherwise you will get an Exception

//          -- saveOrUpdate()
//              --> Existing record : SELECT & INSERT SQL is fired
//              --> Non-Existing record : SELECT & INSERT SQL is fired &
//              --> No Exception is generated

//         3.To delete record from database
//          -- delete() 
//              --> Existing record : SELECT & DELETE SQL is fired
//              --> Non-Existing record : SELECT SQL is fired &
//              --> No Exception is generated
//


        // session.save(sob);
        // session.update(sob); --> Need to add update inside hbm2ddl field inside configuration
        // session.saveOrUpdate(sob); 
        session.delete(sob);

        txn.commit();

        session.close();
        sessionFactory.close();
        
    }
}
