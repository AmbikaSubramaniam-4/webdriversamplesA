package parallelscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SamplethreeTest {
	WebDriver driver;
  @Test
  public void testone() {
	  long id = Thread.currentThread().getId();
	  System.out.println("Test31 in sample one .."+id);
  }
  
  @Test
  public void testtwo() {
	  driver = new ChromeDriver();
	  long id = Thread.currentThread().getId();
	  System.out.println("Test32 in sample one .."+id);
  }
  
  @Test
  public void testthree() {
	  driver = new ChromeDriver();
	  long id = Thread.currentThread().getId();
	  System.out.println("Test33 in sample one .."+id);
  }
  
}
