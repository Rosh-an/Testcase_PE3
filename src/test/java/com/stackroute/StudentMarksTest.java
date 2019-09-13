package com.stackroute;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class StudentMarksTest {
  private static StudentMarks std;
  @BeforeClass
  public static void setup() {
    // This methods runs, before running any one of the test case
    // This method is used to initialize the required variables
    std = new StudentMarks();

  }

  @AfterClass
  public static void teardown() {
    // This method runs, after running all the test cases
    // This method is used to clear the initialized variables
    std = null;

  }

  @Test
  public void StudentTest(){
    int arr[]={100,90,90,70,60,80,100,90,80,100};
    std.numOfStudents(10);
    assertEquals("Success",std.stuGrades(arr));

  }

  @Test
  public void StudentTestFailure(){
    int arr[]={-80,90,90,70,60,80,100,-90,80,100};
    std.numOfStudents(10);
    assertEquals("Error in values",std.stuGrades(arr));
  }
}
