package com.Sample;

import org.junit.Test;

public class ExceptionHandleExample {
	@Test(expected = ArithmeticException.class)
	public void test()
	{
		int a=10/0; // we put this code inside the try and catch or else we throws the error
		
	}
}
