package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class Remove_VowelTest {
  private static Remove_Vowel rv;
  @BeforeClass
  public static void setup() {
    // This methods runs, before running any one of the test case
    // This method is used to initialize the required variables
    rv = new Remove_Vowel();

  }

  @AfterClass
  public static void teardown() {
    // This method runs, after running all the test cases
    // This method is used to clear the initialized variables
    rv = null;

  }

  @Test
  public void RemoveVowelTest_Places_ShouldRemoveVowels()
  {
    String places[]={"India","United States","Germany","Egypt","Czekoslovakia"};
    String places1[]={""};
    String vowelsremoved[]={"Ind","Untd Stts","Grmny","Egypt","Czkslvk"};
    assertEquals("Error in removing vowel in removeVowelsfromPlaceName",vowelsremoved,rv.removeVowelsfromPlaceName(places));
    assertNull("expected null",rv.removeVowelsfromPlaceName(places1));

  }

  @Test
  public void RemoveVowelTest_Places_ShouldRemoveVowelsFailure()
  {
    String places[]={"India","United States","Germany","Egypt","Czeck"};
    String places1[]={""};
    String vowelsremoved[]={"Ind","Untd Stts","Grmny","Egypt","Czkslvk"};
    assertNotEquals("Error in removing vowel in removeVowelsfromPlaceName",vowelsremoved,rv.removeVowelsfromPlaceName(places));
    assertNotNull("not expected null",rv.removeVowelsfromPlaceName(places));

  }
}
