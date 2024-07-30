package com.tca;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tca.entities.Student;

public class App {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure(); // load & parse cfg.xml file

		configuration.addAnnotatedClass(Student.class);

		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session = sessionFactory.openSession();
		Transaction txn = session.beginTransaction();

		Student sob = new Student(); // rno =Null, Name=null, Per=null Age=null
		sob.setName("BBB");
		sob.setPer(65.0);

		session.save(sob);
		txn.commit();

		System.out.println("Saved Record !!");
		session.close();
		sessionFactory.close();
	}
}
