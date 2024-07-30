package com.tca;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tca.entities.Student;

public class App 
{
	public static void main( String[] args )
	{
		Configuration configuration = new Configuration();
		configuration.configure();  // load & parse cfg.xml file

		configuration.addAnnotatedClass(Student.class);

		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session = sessionFactory.openSession();
		Transaction txn = session.beginTransaction();


		Student sob = new Student(); // rno =Null, Name=null, Per=null Age=null
		//sob.setRno(107); --> When i am using auto increment property the setRno isn't setting any value
		sob.setName("BBB");
		sob.setPer(90.0);


		session.save(sob);
		txn.commit();

		System.out.println("Saved Record !!");   
		session.close();
		sessionFactory.close();
	}
}
