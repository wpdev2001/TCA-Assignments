package com.wp.ASS_05_v1_StudentCSV_Deserialization;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;

import com.wp.ASS_05_v1_StudentCSV_Deserialization.entities.Student;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
        //Deserialization logic
    	FileInputStream fis = null;
    	ObjectInputStream ois = null;
    	FileWriter writer = null;
    	
    	try {
    		
    		//In this code through this line it is searching for the serialization .class file which we have created inside the Serialization project to Deserialize it which was not found resulting it into an ClassNotFoundException!!!
    		fis = new FileInputStream("resources/student.ser");
    		ois = new ObjectInputStream(fis);
    		
    		Student s = (Student)ois.readObject();
    		
    		int rno = s.getRno();
    		String name = s.getName();
    		double per = s.getPer();
			
    		//Inserting records into csv
    		
    		writer = new FileWriter("resources/student.csv");
    		
    		writer.append(String.valueOf(rno))
    		.append(',')
    		.append(name)
    		.append(',')
    		.append(String.valueOf(per))
    		.append('\n');
    		
    		System.out.println("Record Deserialized and Inserted successfully!!!");
    		
		} 
    	catch (Exception e) {
			e.printStackTrace();
		}
    	finally {
			fis.close();
			ois.close();
		}
    	
    }
}
