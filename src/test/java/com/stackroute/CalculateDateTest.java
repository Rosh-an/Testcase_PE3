package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculateDateTest {
  private static CalculateDate cd;
  @BeforeClass
  public static void setup() {
    // This methods runs, before running any one of the test case
    // This method is used to initialize the required variables
    cd = new CalculateDate();

  }

  @AfterClass
  public static void teardown() {
    // This method runs, after running all the test cases
    // This method is used to clear the initialized variables
    cd = null;
  }

  @Test
  public void CalculateDate_Date_shouldreturnFirstAndLastDateOfWeek()
  {
    String date[]={"Mon 09/09/2019","Sun 15/09/2019"};
    assertEquals("First and last day of current week",date,cd.getFirstAndLastDate());
  }

  @Test
  public void CalculateDate_Date_shouldreturnFirstAndLastDateOfWeekFailure()
  {
    String date[]={"Tue 10/09/2019","Sun 15/09/2019"};
    assertNotEquals("First and last day of current week",date,cd.getFirstAndLastDate());
  }
}
