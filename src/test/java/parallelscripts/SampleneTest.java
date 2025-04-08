package parallelscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleneTest {
	WebDriver driver;
  @Test(invocationCount = 6, threadPoolSize = 3)
  public void testone() {
	  long id = Thread.currentThread().getId();
	  System.out.println("Test11 in sample one .."+id);
  }
  
  @Test
  public void testtwo() {
	  driver = new ChromeDriver();
	  long id = Thread.currentThread().getId();
	  System.out.println("Test12 in sample one .."+id);
  }
  
  @Test
  public void testthree() {
	  driver = new ChromeDriver();
	  long id = Thread.currentThread().getId();
	  System.out.println("Test13 in sample one .."+id);
  }
  
}
