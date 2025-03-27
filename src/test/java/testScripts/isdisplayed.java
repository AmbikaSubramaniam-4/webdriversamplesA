package testScripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class isdisplayed {
	
	 @Test
	  public void seleniumnSearch() throws IOException,InterruptedException {
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		//Is displayed
		  driver.get("https://automationbookstore.dev/");
		  
		  //Entire page screenshot
		  TakesScreenshot	screen = (TakesScreenshot)driver;
		  File src = screen.getScreenshotAs(OutputType.FILE);
		  String path  = System.getProperty("user.dir")
		  		+ "/screenshots/" + System.currentTimeMillis() + ".png";
		  FileUtils.copyFile(src, new File(path));
		  
		  driver.findElement(By.id("searchBar")).sendKeys("test");
		  Thread.sleep(4000);
		  WebElement closeicon = driver.findElement(By.cssSelector("a[title='Clear text']"));
		  
		  //single element screenshot
		  System.out.println("close icon there");
		  File srcImng = closeicon.getScreenshotAs(OutputType.FILE);
		  String path1  = System.getProperty("user.dir")
		  		+ "/screenshots/" + System.currentTimeMillis() + ".png";
		  FileUtils.copyFile(srcImng, new File(path1));
		  
		  if(closeicon.isDisplayed())
		  {
			  closeicon.click();
		  }
		  
		 

}
}
