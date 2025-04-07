package groupscripts;

import org.testng.annotations.Test;

public class SampleThree {
  
	@Test(groups = "featureone")
	  public void testOne() {
		  System.out.println("Test31 in SampleOne");
	  }
	  
	  @Test
	  public void testTwo() {
		  System.out.println("Test32 in SampleOne");
	  }
	  
	  
	  @Test
	  public void testThree() {
		  System.out.println("Test33 in SampleOne");
	  }
	
}
