package com.test;

import java.lang.reflect.Constructor;

public class objectNewInstanceMethod {
	 // Member variables of this class
    private String name;
 
    // Constructor of this class
    objectNewInstanceMethod() {}
 
    // Method 1
    // To set name ofthe string
    public void setName(String name)
    {
        // This method refers to current object itself
        this.name = name;
    }
 
    // Main driver method
    public static void main(String[] args)
    {
        // Try block to check for exceptions
        try {
            Constructor<objectNewInstanceMethod> constructor
                = objectNewInstanceMethod.class.getDeclaredConstructor();
 
            objectNewInstanceMethod r = constructor.newInstance();
 
            // Custom passing
            r.setName("Java Programming");
            System.out.println(r.name);
        }
 
        // Catch block to handle the exceptions
        catch (Exception e) {
 
            // Display the exception on console
            // using printStackTrace() method
            e.printStackTrace();
        }
    }

}
