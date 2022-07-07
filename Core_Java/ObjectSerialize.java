package com.test;

import java.io.*;

public class ObjectSerialize implements Serializable {
 
    // Member variables
    private String name;
    ObjectSerialize(String name)
    {
        // This keyword refers to current object itself
        this.name = name;
    }
 
    // Main driver method
    public static void main(String[] args)
    {
        // Try block to check for exceptions
        try {
            // Creating object of class in main() method
        	ObjectSerialize d = new ObjectSerialize("Java Programming");
 
            FileOutputStream f
                = new FileOutputStream("file.txt");
            ObjectOutputStream oos
                = new ObjectOutputStream(f);
            oos.writeObject(d);
            oos.close();
 
            // Freeing up memory resources
            f.close();
        }
 
        // Catch block to handle the exceptiona
        catch (Exception e) {
            // Display the exception along with line number
            // using printStacktrace() method
            e.printStackTrace();
        }
    }
}