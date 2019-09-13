package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {
  private static ChessBoard cb;
  @BeforeClass
  public static void setup() {
    // This methods runs, before running any one of the test case
    // This method is used to initialize the required variables
    cb = new ChessBoard();

  }

  @AfterClass
  public static void teardown() {
    // This method runs, after running all the test cases
    // This method is used to clear the initialized variables
    cb = null;

  }

  @Test
  public void ChessBoardTest_colorPattern_ShouldDisplayPattern()
  {
    String chessboard[]=new String[8];
    for(int i=0;i<8;i+=2)
      chessboard[i]="WW|BB|WW|BB|WW|BB|WW|BB|";
    for(int i=1;i<8;i+=2)
      chessboard[i]="BB|WW|BB|WW|BB|WW|BB|WW|";
    assertEquals("Error in displaying chess board in showchessboard",chessboard,cb.showchessboard());
    assertNotNull("should not be null",cb.showchessboard());

  }

}
