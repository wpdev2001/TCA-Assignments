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

        //CONSTRUCTOR part is missing???
    }
}


//-----------------------------------------------------------------------------
// import java.lang.reflect.Field;

// class Person {
//     private String name;
//     private int age;

//     public Person(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }

//     // Getters (not strictly necessary for reflection, but useful for testing)
//     public String getName() {
//         return name;
//     }

//     public int getAge() {
//         return age;
//     }
// }

// public class ReflectionExample {
//     public static void main(String[] args) {
//         try {
//             // Create an instance of the Person class
//             Person person = new Person("Alice", 30);

//             // Access the private field 'name'
//             Field nameField = Person.class.getDeclaredField("name");
//             nameField.setAccessible(true); // Allow access to the private field

//             // Get the value of the 'name' field
//             String nameValue = (String) nameField.get(person);
//             System.out.println("Name: " + nameValue);

//             // Set a new value for the 'name' field
//             nameField.set(person, "Bob");
//             System.out.println("Updated Name: " + person.getName());

//             // Access the private field 'age'
//             Field ageField = Person.class.getDeclaredField("age");
//             ageField.setAccessible(true); // Allow access to the private field

//             // Get the value of the 'age' field
//             int ageValue = (int) ageField.get(person);
//             System.out.println("Age: " + ageValue);

//             // Set a new value for the 'age' field
//             ageField.set(person, 35);
//             System.out.println("Updated Age: " + person.getAge());

//         } catch (NoSuchFieldException | IllegalAccessException e) {
//             e.printStackTrace();
//         }
//     }
// }
