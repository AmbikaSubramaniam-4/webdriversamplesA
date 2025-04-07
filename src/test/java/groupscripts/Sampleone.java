package groupscripts;

import org.testng.annotations.Test;

public class Sampleone {
  @Test(groups = "featureone")
  public void testOne() {
	  System.out.println("Test11 in SampleOne");
  }
  
  @Test(groups = "featuretwo")
  public void testTwo() {
	  System.out.println("Test12 in SampleOne");
  }
  
  
  @Test
  public void testThree() {
	  System.out.println("Test13 in SampleOne");
  }
  
 
  
  
  
}
