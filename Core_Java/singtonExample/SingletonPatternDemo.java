package com.singtonExample;

public class SingletonPatternDemo {
	public static void main(String[] args) {
		// private Constructor object is not possible to create
		//SingletonObject s = new SingletonObject();
		
		SingletonObject s=SingletonObject.getInstance();
		
		s.showMessage();
		
	}

}
