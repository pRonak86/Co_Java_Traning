package com.Sample;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class SampleTestCase {

	@Test
	public void Home() {
		System.out.println("Home Method ");
	}
	@Test
	@Ignore
	public void Login()
	{
		System.out.println("Login Method");
	}
	@Test
	public void LogOut()
	{
		System.out.println("Log out Method");
	}
	@Before
	public void BeforeTest()
	{
		System.out.println("Before Method");
	}
	@After
	public void afterTest()
	{
		System.out.println("** After Method ** ");
	}
	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("---- Before Class ----");
	}
	@AfterClass
	public static void afterClass()
	{
		System.out.println("--- After Class");
	}
}
