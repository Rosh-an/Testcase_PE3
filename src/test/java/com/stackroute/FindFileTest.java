package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FindFileTest {
  private static FindFile ff;
  @BeforeClass
  public static void setup() {
    // This methods runs, before running any one of the test case
    // This method is used to initialize the required variables
    ff = new FindFile();

  }

  @AfterClass
  public static void teardown() {
    // This method runs, after running all the test cases
    // This method is used to clear the initialized variables
    ff = null;
  }

  @Test
  public void FindFile_Files_shouldReadContent() throws IOException
  {
    File file= new File("Directory1");
    file.mkdir();
    File file7= new File("Directory2");
    file.mkdir();

    File file1= new File("Directory1//test1.txt");
    String s1="You are in text1.txt";
    OutputStream outstream= new FileOutputStream(file1);
    outstream.write(s1.getBytes());
    File file2= new File("Directory1/test2.csv");
    File file3= new File("Directory1/test3.java");
    File file4= new File("Directory1/test4.c");
    File file5= new File("Directory1/test5.txt");
    String s2="You are in text5.txt";
    OutputStream outstream1= new FileOutputStream(file5);
    outstream1.write(s1.getBytes());
    File file6= new File("Directory1/test6.txt");
    String s3="You are in text6.txt";
    OutputStream outstream2= new FileOutputStream(file6);
    outstream2.write(s1.getBytes());

    String extension=".txt";
    String path="Directory1";
    String path1="Directory2";

    List<String> list= new ArrayList<String>();
    list.add(s1);
    list.add(s2);
    list.add(s3);

    assertEquals("Reading content of file",list,ff.ContentOfFile(path,extension));
    assertNull("Reading content of file",ff.ContentOfFile(path1,extension));
    assertNotNull("Reading content of file",ff.ContentOfFile(path,extension));
  }

  @Test
  public void FindFile_Files_shouldReadContentFailure() throws IOException
  {
    String s1="You are not in text1.txt";
    String s2="You are not  in text5.txt";
    String s3="You are not in text6.txt";
    List<String> list= new ArrayList<String>();
    list.add(s1);
    list.add(s2);
    list.add(s3);
    String extension=".txt";
    String path="Directory1";
    assertNotEquals("Reading content of file",list,ff.ContentOfFile(path,extension));
  }


}
