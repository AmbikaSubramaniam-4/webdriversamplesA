package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Booksearchtest {
	WebDriver driver;
  @Parameters("browser")	
  @BeforeMethod //Here before method also can be used
  public void pre(String strbrowser) {
	  if(strbrowser.equalsIgnoreCase("chrome")) {
		  driver = new ChromeDriver(); 
	  }
	  else if (strbrowser.equalsIgnoreCase("edge")) {
		  driver = new EdgeDriver(); 
	  }
	  driver.manage().window().maximize();
	  driver.get("https://danube-webshop.herokuapp.com/");
  }

//  @Test(priority=1)
//  public void crimenovel() throws InterruptedException {
//	  
//	  driver.findElement(By.xpath("//a[text()='Crime & Thrillers']")).click();
//	  Thread.sleep(2000);
//	  String url = driver.getCurrentUrl();
//	  Assert.assertTrue(url.contains("crime")); 
//	  	  
//  }
//  
//  
//  @Test(priority=3)
//  public void storiesnovel() throws InterruptedException {	  
//	  driver.findElement(By.xpath("//a[text()='Novels & Stories']")).click();
//	  Thread.sleep(2000);
//	  String url = driver.getCurrentUrl();
//	  Assert.assertTrue(url.contains("novel"));   
//	  
//  }
//  
//  @Test(enabled=false)
//  public void eroticnovel() throws InterruptedException {	  
//	  driver.findElement(By.xpath("//a[text()='Erotic Novels']")).click();
//	  Thread.sleep(2000);
//	  String url = driver.getCurrentUrl();
//	  Assert.assertTrue(url.contains("erotic"));   
//	  
//  }
//  
//  @Test(priority=2)
//  public void horrernovel() throws InterruptedException {	  
//	  driver.findElement(By.xpath("//a[text()='Horror']")).click();
//	  Thread.sleep(2000);
//	  String url = driver.getCurrentUrl();
//	  Assert.assertTrue(url.contains("horror"));   
//	  
//  }
  
  
  @Test
  public void horrernovel() throws InterruptedException {	  
	  driver.findElement(By.xpath("//a[text()='Horror']")).click();
	  Thread.sleep(2000);
	  String url = driver.getCurrentUrl();
	  Assert.assertTrue(url.contains("horror"));   
	  
  }
  
//  @Test
//  public void storiesnovel(){	  
//	  driver.findElement(By.xpath("//a[text()='Novels & Stories']")).click();
//	  //Thread.sleep(2000);
//	  String url = driver.getCurrentUrl();
//	  Assert.assertTrue(url.contains("novell"));
//  }
//  
//  @Test(alwaysRun = true, dependsOnMethods = "storiesnovel")
//  public void horrernovel() throws InterruptedException {	  
//	  driver.findElement(By.xpath("//a[text()='Horror']")).click();
//	  Thread.sleep(2000);
//	  String url = driver.getCurrentUrl();
//	  Assert.assertTrue(url.contains("horror"));   
//	  
//  }
//  @AfterMethod
//  public void toclose() {	
//	  driver.close();
//  }
  }
  

