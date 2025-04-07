package groupscripts;

import org.testng.annotations.Test;

public class SampleTwo {
  
	@Test(groups = "featureone")
	  public void testOne() {
		  System.out.println("Test21 in SampleOne");
	  }
	  
	  @Test(groups = "featuretwo")
	  public void testTwo() {
		  System.out.println("Test22 in SampleOne");
	  }
	  
	  
	  @Test
	  public void testThree() {
		  System.out.println("Test23 in SampleOne");
	  }
}
