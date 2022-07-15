package com.Sample;

import org.junit.Assert;
import org.junit.Test;

public class CalcMain {
	@Test
	public void CalcTest()
	{
		Calc c=new Calc();
		int expected = c.add(10, 20);
		int actual = 30;
		
		Assert.assertEquals(expected, actual);
	}

}
