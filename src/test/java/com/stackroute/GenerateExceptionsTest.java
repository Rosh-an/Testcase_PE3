package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class GenerateExceptionsTest {
  private static GenerateExceptions ge;
  @BeforeClass
  public static void setup() {
    // This methods runs, before running any one of the test case
    // This method is used to initialize the required variables
    ge = new GenerateExceptions();

  }

  @AfterClass
  public static void teardown() {
    // This method runs, after running all the test cases
    // This method is used to clear the initialized variables
    ge = null;

  }

  @Test(expected = NegativeArraySizeException.class)
  public void GenerateExceptions_Exception_shouldreturnNeagtiveArrayException()
  {
    ge.ArraySize();
  }

  @Test(expected = IndexOutOfBoundsException.class)
  public void GenerateExceptions_Exception_shouldreturnIndexOutOfBoundsException()
  {
    ge.ArrayIndex();
  }

  @Test(expected = NullPointerException.class)
  public void GenerateExceptions_Exception_shouldreturnNullPointerException()
  {
    ge.NullPointer();
  }

}
