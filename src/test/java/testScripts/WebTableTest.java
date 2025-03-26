package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableTest {
	@Test
	  public void dynamicwebtable() throws InterruptedException {
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://testautomationpractice.blogspot.com/");
		  List<WebElement> items = driver.findElements(By.xpath("//td[contains(text(),'Master In Selenium')]//following-sibling::td"));
		  System.out.println("etails of a book... "+items.size());
		  for (WebElement item: items)
		  {
			  System.out.println(item.getText());
		  }
		  
		  
		  
}
}
