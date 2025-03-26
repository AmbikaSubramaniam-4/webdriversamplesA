package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Relativelocator {
	
	 @Test
	  public void seleniumnSearch() throws InterruptedException {
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();

	  //relativelocators
	  driver.get("https://automationbookstore.dev");
	  

}
}
