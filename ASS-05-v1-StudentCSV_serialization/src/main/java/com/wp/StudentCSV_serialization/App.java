package com.wp.StudentCSV_serialization;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.wp.StudentCSV_serialization.entities.Student;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
        FileReader fr = null;
        BufferedReader br = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        
        try {
			fr = new FileReader("resources/student.csv");
			br = new BufferedReader(fr);
			
			while(true) {
				String line = br.readLine();
				
				if(line==null) {
					break;
				}
				
				String tok[] = line.split(",");
				
				int rno = Integer.parseInt(tok[0]);
				String name = tok[1];
				double per = Double.parseDouble(tok[2]);
				
				fos = new FileOutputStream("resources/student.ser");
				oos = new ObjectOutputStream(fos);
				
				Student ob = new Student();
				
				ob.setRno(rno);
				ob.setName(name);
				ob.setPer(per);
				
				oos.writeObject(ob);
				System.out.println("Object has been Serialized");
				
			}
		} 
        catch (FileNotFoundException e) 
        {
			e.printStackTrace();
		}
        finally {
			fos.close();
			oos.close();
		}
        
    }
}
