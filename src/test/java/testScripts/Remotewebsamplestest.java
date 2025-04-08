package testScripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Remotewebsamplestest {
	WebDriver driver;
  @Test
  public void storiesnovel() throws MalformedURLException, InterruptedException {	  
	  ChromeOptions opt = new ChromeOptions();
	  opt.setCapability(CapabilityType.PLATFORM_NAME,Platform.WINDOWS);
	  
	  String strhub ="";
	  
	  driver = new RemoteWebDriver(new URL(strhub),opt);
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//a[text()='Novels & Stories']")).click();
	  Thread.sleep(2000);
	  String url = driver.getCurrentUrl();
	  Assert.assertTrue(url.contains("novel"));   
	  
  }
}
