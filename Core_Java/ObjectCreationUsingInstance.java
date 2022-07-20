package com.test;

public class ObjectCreationUsingInstance {
	 String name = "Java Programming";
	 
	    // Main driver method
	    public static void main(String[] args)
	    {
	        // Try block to check for exceptions
	        try {
	 
	            Class cls = Class.forName("ObjectCreationUsingInstance");
	 
	            // Creating object of main class
	            // using instance method
	            ObjectCreationUsingInstance obj = (ObjectCreationUsingInstance)cls.newInstance();
	 
	            // Print and display
	            System.out.println(obj.name);
	        }
	 
	        // Catch block to handle the exceptions
	 
	        // Catch block 1
	        // Handling ClassNotFound Exception
	        catch (ClassNotFoundException e) {
	 
	            // Display the exception along with line number
	            // using printStacktrace() method
	            e.printStackTrace();
	        }
	 
	        // Catch block 2
	        // Handling InstantiationException
	        catch (InstantiationException e) {
	 
	            e.printStackTrace();
	        }
	 
	        // Catch block 2
	        // Handling IllegalAccessException
	        catch (IllegalAccessException e) {
	 
	            e.printStackTrace();
	        }
	    }

}
