package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReturnExceptionTest {
  private static ReturnException re;
  @BeforeClass
  public static void setup() {
    // This methods runs, before running any one of the test case
    // This method is used to initialize the required variables
    re = new ReturnException();

  }

  @AfterClass
  public static void teardown() {
    // This method runs, after running all the test cases
    // This method is used to clear the initialized variables
    re = null;

  }

  @Test(expected = ArithmeticException.class)
  public void ReturnException_Exception_shouldreturnException ()
  {
    re.main();
  }


}
