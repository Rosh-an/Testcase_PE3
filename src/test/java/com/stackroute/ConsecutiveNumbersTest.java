package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumbersTest {
  private static ConsecutiveNumbers cn;
  @BeforeClass
  public static void setup() {
    // This methods runs, before running any one of the test case
    // This method is used to initialize the required variables
    cn = new ConsecutiveNumbers();

  }

  @AfterClass
  public static void teardown() {
    // This method runs, after running all the test cases
    // This method is used to clear the initialized variables
    cn = null;

  }

  @Test
  public void ConsecutiveNumbers_ArrayofNumbers_ShouldreturnTrueorFalse()
  {
    String arr[]={"98,96,95,94,93"};
    String arr1[]={"1,2,3,4,5,6"};
    assertEquals("Consecutive function fails to detect consecutive numbers",false,cn.consecutive(arr));
    assertEquals("Consecutive function fails to detect consecutive numbers",true,cn.consecutive(arr1));
  }

  @Test
  public void ConsecutiveNumbers_ArrayofNumbers_ShouldreturnTrueorFalseFailure()
  {
    String arr1[]={"54,53,52,51,50,49,48"};
    assertNotEquals("Consecutive function returns false for consecutive numbers",false,cn.consecutive(arr1));
  }



}
