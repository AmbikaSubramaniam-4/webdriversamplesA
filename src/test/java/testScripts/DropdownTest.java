package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropdownTest {
  @Test
  public void dropdown() throws Exception {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://testautomationpractice.blogspot.com/");
	  //single select
	  Select s1 = new Select(driver.findElement(By.id("country")));
	  s1.selectByValue("uk");
	  s1.selectByVisibleText("United Kingdom");
	  
	  
	  //multi select
	  Select multi_select = new Select(driver.findElement(By.id("colors")));
	  if(multi_select.isMultiple()) {
	  multi_select.selectByValue("red");
	  multi_select.selectByVisibleText("White");
	  multi_select.selectByIndex(3);
	  Thread.sleep(5000);
	  
	  List<WebElement> items= multi_select.getAllSelectedOptions();
	  System.out.println(items.size());
	  multi_select.deselectByIndex(3);
	  
	  
	  }  
	  
	  
	  
  }
}
