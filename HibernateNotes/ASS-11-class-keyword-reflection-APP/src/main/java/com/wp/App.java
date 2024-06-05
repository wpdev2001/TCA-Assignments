package com.wp;

import java.lang.reflect.*; //Important to study more about this package
import com.wp.entities.Student;

public class App
{
    public static void main( String[] args )
    {
    	Class<Student> c = Student.class;

        System.out.println("PARENT CLASS : " + c.getSuperClass());

        Field fields[] = c.getDeclaredFields();

        System.out.println("\n\n****Fields in Student class ****");

        for(Field f : fields)
        {
            System.out.println(f);
        }

        Method methods[] = c.getDeclaredMethods();

        System.out.println("\n\n****Methods in Student class ****");

        for(Method m : methods)
        {
            System.out.println(m);
        }

    }
}
