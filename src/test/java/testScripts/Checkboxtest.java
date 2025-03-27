package testScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Checkboxtest {
	@Test
	  public void seleniumnSearch() throws IOException,InterruptedException {
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
//		Checkbox
		  driver.get("https://the-internet.herokuapp.com/checkboxes");
		  driver.findElement(By.xpath("//input[@type='checkbox'][1]")).click();
		  Boolean b1 = driver.findElement(By.xpath("//input[@type='checkbox'][2]")).isSelected();
		  if(b1)
		  {
			  driver.findElement(By.xpath("//input[@type='checkbox'][2]")).click();
		  }
		  
		  //Radiobutton
		  driver.get("https://testautomationpractice.blogspot.com/");
		  driver.findElement(By.id("male")).click();
		  Thread.sleep(1000);
		  
		  		  
		  

}
}
