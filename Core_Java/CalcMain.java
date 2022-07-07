package com.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class CalcMain {
	
			SampleCalc c = new SampleCalc(10, 20);
			SampleCalc c1 = new SampleCalc(5,5);
			@Test
			public void test1()
			{
				assertEquals("Sum of Two Number",10, c.sum());
			}
			@Test
			public void test2()
			{
				assertEquals(10, c1.sum());
			}
			@Test
			public void test3()
			{
				assertSame(10, c1.sum());
			}
			
			
	

}
