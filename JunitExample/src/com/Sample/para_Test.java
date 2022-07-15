package com.Sample;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class para_Test {
	
	int a;
	int b;
	int result;
	
	
	public para_Test(int a, int b, int result) {
		super();
		this.a = a;
		this.b = b;
		this.result = result;
	}


	@Test
	@Ignore
	public void test()
	{
		Calc c=new Calc();
		int expected = c.add(a, b);
		int actual = result;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testMul()
	{
		Calc c = new Calc();
		int expected = c.mul(a, b);
		int actual = result;
		Assert.assertEquals(expected, actual);
	}
	
	
	
	@Parameterized.Parameters
	public static List<Object[]> dataProvider()
	{
		Object obj[][]=new Object[4][3];
		
		obj[0][0]=2;
		obj[0][1]=3;
		obj[0][2]=6;
		
		obj[1][0]=4;
		obj[1][1]=5;
		obj[1][2]=7;

		obj[2][0]=7;
		obj[2][1]=8;
		obj[2][2]=15;

		obj[3][0]=8;
		obj[3][1]=3;
		obj[3][2]=24;
		
		return Arrays.asList(obj);
	}
}
