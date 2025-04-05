package testScripts;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FiledownloadTest {
  @Test
  public void filedown() throws InterruptedException {
	  
	  ChromeOptions options = new ChromeOptions();
	  Map<String, Object> prefs = new HashMap<String, Object>();
	  prefs.put("download.prompt_for_download", false);
	  options.setExperimentalOption("prefs", prefs);
	  
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://selenium.dev/downloads/");
	  
	  Actions action = new Actions(driver);
	  Thread.sleep(4000);
	  action.scrollByAmount(100, 900).perform();
	  driver.findElement(By.xpath("//a[text()='4.30.0']")).click();
	  Thread.sleep(2000);
	  
	  
	  
  }
  
  
}
