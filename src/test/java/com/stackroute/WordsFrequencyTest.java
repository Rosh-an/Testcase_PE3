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

import static junit.framework.TestCase.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class WordsFrequencyTest {

  private static WordsFrequency wf;
  @BeforeClass
  public static void setup() {
    // This methods runs, before running any one of the test case
    // This method is used to initialize the required variables
    wf = new WordsFrequency();

  }

  @AfterClass
  public static void teardown() {
    // This method runs, after running all the test cases
    // This method is used to clear the initialized variables
    wf = null;
  }

  @Test
  public void WordsFrequency_File_shouldreturnFrequencyOfWordsInAFile() throws IOException
  {
    File file = new File("FileDemo.txt");
    File file1 = new File("FileDemoNull.txt");
    OutputStream outstream= new FileOutputStream(file);
    OutputStream outstream1= new FileOutputStream(file1);
    String s="i am a man ,\n" +
      "i like to sleep ,\n" +
      "i have a home.";
    String s1="";
    outstream.write(s.getBytes());
    outstream1.write(s1.getBytes());
    List<String> list= new ArrayList<String>();
    list.add("i-3");
    list.add("am-1");
    list.add("a-2");
    list.add("man-1");
    list.add("like-1");
    list.add("to-1");
    list.add("sleep-1");
    list.add("have-1");
    list.add("home-1");
    List<String> list1= new ArrayList<String>();
    list.add("i-4");
    list.add("am-1");
    list.add("a-2");
    list.add("man-2");
    list.add("like-1");
    list.add("to-1");
    list.add("sleep-5");
    list.add("have-1");
    list.add("home-1");
    assertEquals(" ",list,wf.frequency("FileDemo.txt"));
    assertNotEquals(" ",list1,wf.frequency("FileDemo.txt"));
    assertNull(" ",wf.frequency("FileDemoNull.txt"));

  }
}
