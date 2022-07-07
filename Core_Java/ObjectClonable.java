package com.test;

public class ObjectClonable implements Cloneable {

	// Method 1
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// Super() keyword refers to parent class
		return super.clone();
	}

	// Declaring and initializing string
	String name = "Java Programming";

	// Method 2
	// main driver method
	public static void main(String[] args) {
		ObjectClonable obj1 = new ObjectClonable();

		// Try block to check for exceptions
		try {

			// Using the clone() method
			ObjectClonable obj2 = (ObjectClonable) obj1.clone();

			// Print and display the main class object
			// as created above
			System.out.println(obj2.name);
		}

		// Catch block to handle the exceptions
		catch (CloneNotSupportedException e) {

			// Display the exception
			// using printStackTrace() method
			e.printStackTrace();
		}
	}
}
