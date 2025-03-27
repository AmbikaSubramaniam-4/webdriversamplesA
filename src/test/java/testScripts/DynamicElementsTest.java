package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DynamicElementsTest {
	String e_item = "Nokia lumia 1520";
  @Test
  public void f() {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();

	  driver.get("https://demoblaze.com/");
	  List<WebElement> items = driver.findElements(By.cssSelector("h4.card-title"));
	  
	  for (WebElement item:items)
	  {
	  if(item.getText().equalsIgnoreCase(e_item)) {
		  item.click();
		  System.out.println(item);
		  break;
	  }
	  }
	  
  }
}
