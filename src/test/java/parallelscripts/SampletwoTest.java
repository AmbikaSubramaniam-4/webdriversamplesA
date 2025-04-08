package parallelscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampletwoTest {
	WebDriver driver;
  @Test
  public void testone() {
	  long id = Thread.currentThread().getId();
	  System.out.println("Test21 in sample one .."+id);
  }
  
  @Test
  public void testtwo() {
	  driver = new ChromeDriver();
	  long id = Thread.currentThread().getId();
	  System.out.println("Test22 in sample one .."+id);
  }
  
  @Test
  public void testthree() {
	  driver = new ChromeDriver();
	  long id = Thread.currentThread().getId();
	  System.out.println("Test23 in sample one .."+id);
  }
  
}
