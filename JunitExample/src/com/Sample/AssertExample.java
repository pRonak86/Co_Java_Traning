package com.Sample;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AssertExample {
	@Test
	public void testAssert()
	{
//		String s1= new String("abc");
//		String s2= new String("abc");
//		assertNotSame(s1, s1);
//		assertEquals(s1, s2);
		int ex=50;
		int ac=6;
//		assertTrue(ex>ac);
//		assertFalse(ex<ac);
//		String s1="abc";
//		assertNotNull(s1);
		int a[] = {1,2,3,4};
		int b[]= {1,2,3,4,5};
		assertArrayEquals(a, b);
	}
}
