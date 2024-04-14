package com.wp;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import com.wp.entities.Student;

public class AppSerialize {

	public static void main(String[] args) throws Exception{
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("resources/student.ser");
			oos = new ObjectOutputStream(fos);
			
			Student ob = new Student();
			ob.setRno(101);
			ob.setName("AAA");
			ob.setPer(60);
			
			oos.writeObject(ob);
			System.out.println("Object has been Serialized");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			fos.close();
			oos.close();
		}

	}

}
