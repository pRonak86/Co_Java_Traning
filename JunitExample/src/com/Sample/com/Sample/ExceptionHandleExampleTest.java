package com.Sample.com.Sample;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class ExceptionHandleExampleTest {

  @Test(enabled = false)
  public void testTest() {
    System.out.println("Testing1");
  }
  @Test
  public void testTest1() {
    System.out.println("Testing2");
  }
}
