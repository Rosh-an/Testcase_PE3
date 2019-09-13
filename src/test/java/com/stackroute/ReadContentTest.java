package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import static org.junit.Assert.*;

public class ReadContentTest {

  private static ReadContent rc;
  @BeforeClass
  public static void setup() {
    // This methods runs, before running any one of the test case
    // This method is used to initialize the required variables
    rc = new ReadContent();

  }

  @AfterClass
  public static void teardown() {
    // This method runs, after running all the test cases
    // This method is used to clear the initialized variables
    rc = null;
  }

  @Test
  public void ReadContentTest_File_shouldconverttoUppercase() throws IOException
  {
    File file = new File("Hello.txt");
    File file1 = new File("HelloNull.txt");
    OutputStream outstream= new FileOutputStream(file);
    OutputStream outstream1= new FileOutputStream(file1);
    String s="She borrowed the book from him many years ago and hasn't yet returned it.";
    String s1="";
    outstream.write(s.getBytes());
    outstream1.write(s1.getBytes());
    assertEquals("Read content of file",s.toUpperCase(),rc.contentInUpperCase("Hello.txt"));
    assertNull("Read content of file",rc.contentInUpperCase("HelloNull.txt"));
  }

  @Test
  public void ReadContentTest_File_shouldconverttoUppercaseFailure() throws IOException
  {
    File file = new File("Hello.txt");
    OutputStream outstream= new FileOutputStream(file);
    String s="She borrowed the book from him many years ago and hasn't yet returned it.";
    outstream.write(s.getBytes());
    assertNotEquals("Read content of file","SHE BORROWED THE BOOK",rc.contentInUpperCase("Hello.txt"));
    assertNotNull("Read content of file",rc.contentInUpperCase("Hello.txt"));
  }



}
