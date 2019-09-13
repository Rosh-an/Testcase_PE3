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

public class Matrixtest {
  private static Matrix mt;
  @BeforeClass
  public static void setup() {
    // This methods runs, before running any one of the test case
    // This method is used to initialize the required variables
    mt = new Matrix();

  }

  @AfterClass
  public static void teardown() {
    // This method runs, after running all the test cases
    // This method is used to clear the initialized variables
    mt = null;

  }

  @Test
  public void matrixAdd(){
    int r=2;
    int c=3;
    int[] m1 ={1,2,3,4,5,6};
    int[] m2 ={9,8,7,6,5,4};
    int [] m3={1,2,3,4,5,6,7,8,9,10,11,12};
    int [] m4 = {24,23,22,21,20,19,18,17,16,15,14,13};
    mt.initmatrix(r,c,m1,m2);
    mt.initmatrix(3,4,m3,m4);
    int[][] addm ={{10,10,10},{10,10,10}};
    assertEquals("Addition of Matrix.",addm,mt.addmatrix());
    assertEquals("Addition of Matrix.",new int[][]{{25,25,25,25},{ 25,25,25,25}, {25,25,25,25}},mt.addmatrix());


  }
}
