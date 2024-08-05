package com.wp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wp.entities.Student;

public class App {
	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure(); // We declare this object in order to load and parse configuration file

		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session = null;
		Transaction txn = null;

		try {

			session = sessionFactory.openSession();

			txn = session.beginTransaction();

			Student sob = new Student();
			sob.setRno(111);
			sob.setName("AAA");
			sob.setPer(97.0);

			session.save(sob);
			txn.commit();

			System.out.println("Record Saved!!!");
		} 
		catch (Exception e) 
		{
			txn.rollback();
			e.printStackTrace();
		} 
		finally {
			session.close();
			sessionFactory.close();
		}

	}
}
