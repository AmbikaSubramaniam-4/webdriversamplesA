package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Booksearchtest {
  @Test
  public void crimenovel() {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://danube-webshop.herokuapp.com/");
	  driver.findElement(By.xpath("//a[text()='Crime & Thrillers']")).click();
	  String url = driver.getCurrentUrl();
	  Assert.assertTrue(url.contains("crime")); 
	  
	  
  }
  
  
  @Test
  public void f() {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://danube-webshop.herokuapp.com/");
	  driver.findElement(By.xpath("//a[text()='Novels & Stories']")).click();
	  String url = driver.getCurrentUrl();
	  Assert.assertTrue(url.contains("novel")); 
	  
	  
  }
}
