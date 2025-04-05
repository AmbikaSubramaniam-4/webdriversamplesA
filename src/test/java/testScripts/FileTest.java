package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileTest {
  @Test
  public void filet() {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	//File upload
	  driver.get("https://blueimp.github.io/jQuery-File-Upload/");
	  WebElement addfile = driver.findElement(By.xpath("//input[@type='file']"));
	  String path  = System.getProperty("user.dir")
		  		+ "//screenshots//" + "1743068770075.png";
	  addfile.sendKeys(path);
	  driver.findElement(By.xpath("//span[text()='Start upload']")).click();
	  
	  
	  
	  
  }
}
