package com.wp;

import java.io.BufferedReader;
import java.io.FileReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wp.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        Configuration configuration = null;
        SessionFactory sessionFactory = null;
        Session session = null;
        Transaction txn = null;
        
        FileReader fr = null;
        BufferedReader br = null;
        
        try 
        {
        	
        	fr = new FileReader("src/main/resources/student.csv");
        	br = new BufferedReader(fr);
        	
        	configuration = new Configuration();
        	configuration.configure();
        	
        	sessionFactory = configuration.buildSessionFactory();
			session = sessionFactory.openSession();
			
			txn = session.beginTransaction();
			
			while(true)
			{
				String line = br.readLine();
				if(line==null) {
					break;
				}
				
				String tok[] = line.split(",");
				
				//If the csv file contains only 2 entries then that shouldn't be added
				if(tok.length<3)
				{
					System.out.println("Rejected: " + line);
					continue;
				}
				
				Student s = new Student();

				//handling exception for number format
				try 
				{
					s.setRno(Integer.parseInt(tok[0]));
				} 
				catch (Exception e) 
				{
					System.out.println("Rejected: " + line);
					continue;
				}
				
				s.setName(tok[1]);
				
				//handling exception for number format
				try 
				{
					s.setPer(Double.parseDouble(tok[2]));
				} 
				catch (Exception e) 
				{
					System.out.println("Rejected: " + line);
					continue;
				}
					
				session.save(s);
				
				System.out.println(tok[0] + " is Saved!!!");
								
			}
			txn.commit();
			
		} 
        catch (Exception e) 
        {
			e.printStackTrace();
			txn.rollback();
		}
        finally {
			session.close();
			sessionFactory.close();
		}
    }
}
