package com.singtonExample;

public class SingletonObject {
	
	//create an object of SingletonObject
	private static SingletonObject instance=new SingletonObject();
	
	//create Constructor as an Private so no one create and object
	private SingletonObject() {
		
	}

	public static SingletonObject getInstance() {
		return instance;
	}
	
	public void showMessage()
	{
		System.out.println("Hello World");
	}
	
	

}
