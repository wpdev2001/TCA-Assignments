package com.wp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wp.entities.Student;
import com.wp.entities.Teacher;

public class App 
{
    public static void main( String[] args )
    {
    	//Configuration-->sessionFactory-->session-->Transaction
    	Configuration mconfiguration = new Configuration();
    	//Passing the file name manually
    	mconfiguration.configure("mysql.cfg.xml");

    	Configuration pconfiguration = new Configuration();
    	//Passing the file name manually
    	pconfiguration.configure("postgresql.cfg.xml");
    	
    	SessionFactory msessionFactory = mconfiguration.buildSessionFactory();
    	SessionFactory psessionFactory = pconfiguration.buildSessionFactory();
    	
    	Session msession = msessionFactory.openSession();
    	Session psession = psessionFactory.openSession();
    	
    	Transaction mtxn = msession.beginTransaction();
    	Transaction ptxn = psession.beginTransaction();
    	
    	Student sob = new Student();
    	
    	sob.setRno(101);
    	sob.setName("AAA");
    	sob.setPer(36.0);
    	
    	Teacher tob = new Teacher();
    	
    	tob.setTno(111);
    	tob.setTname("PPP");
    	tob.setSalary(10000.0);
    	
    	//Saving student records
    	msession.save(sob);
    	psession.save(sob);
    	
    	//Saving teacher records
    	msession.save(tob);
    	psession.save(tob);
    	
    	mtxn.commit();
    	ptxn.commit();
    	
    	msession.close();
    	psession.close();
    	
    	msessionFactory.close();
    	psessionFactory.close();
    	
        
    }
}
