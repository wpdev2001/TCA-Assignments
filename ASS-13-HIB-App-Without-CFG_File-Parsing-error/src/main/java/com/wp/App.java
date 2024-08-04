<<<<<<< HEAD
package com.wp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wp.entities.Student;


public class App 
{
    public static void main( String[] args ) throws IOException
    {
        Configuration configuration = new Configuration();
        //NO need of configure method bcz by default when the configuration constructor is called it will search for hibernate.properties file
        
        //Giving the mapping file details
        //Earlier we used to give those details within configuration file. So, can't we pass those details within hibernate.properties file?
        FileInputStream fis = new FileInputStream("src/main/resources/myconfig.properties");
        Properties prop = new Properties();
        prop.load(fis);
        configuration.setProperties(prop);
        
        configuration.addAnnotatedClass(Student.class);
        
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        
        Session session = sessionFactory.openSession();
        
        Transaction txn = session.beginTransaction();
        
        Student sob = new Student();
        sob.setRno(101);
        sob.setName("AAA");
        sob.setPer(88.0);
        
        session.save(sob);
        txn.commit();
        
        System.out.println("First HIB application on AWS EC2 instance!!!");
        
        session.close();
        sessionFactory.close();
        
        
        
    }
}
=======
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
        //NO need of configure method bcz by default when the configuration constructor is called it will search for hibernate.properties file
        
        //Giving the mapping file details
        //Earlier we used to give those details within configuration file. So, can't we pass those details within hibernate.properties file?
        configuration.addAnnotatedClass(Student.class);
        
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        
        Session session = sessionFactory.openSession();
        
        Transaction txn = session.beginTransaction();
        
        Student sob = new Student();
        sob.setRno(101);
        sob.setName("AAA");
        sob.setPer(88.0);
        
        session.save(sob);
        txn.commit();
        
        System.out.println("First HIB application on AWS EC2 instance!!!");
        
        session.close();
        sessionFactory.close();
        
        
        
    }
}
>>>>>>> 1f6be5e6e889df97ccf4d4a4082c7af5c1f5641f
