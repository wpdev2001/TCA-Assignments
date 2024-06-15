package com.wp;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.wp.entities.Student;

public class AppDeserialize {
	
	public static void main(String[] args) throws Exception{
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			
			fis = new FileInputStream("resources/student.ser");
			ois = new ObjectInputStream(fis);
			
			Student s = (Student)ois.readObject();
			
			System.out.println(s.getRno());
			System.out.println(s.getName());
			System.out.println(s.getPer());
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			fis.close();
			ois.close();
		}

	}

}
