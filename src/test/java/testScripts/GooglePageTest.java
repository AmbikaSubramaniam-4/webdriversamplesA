package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


/**
 * 
 */
public class GooglePageTest {
  @Test
  public void seleniumnSearch() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
//	  driver.get("https://the-internet.herokuapp.com/login"); //toolsqa.com
////	  WebElement user = driver.findElement(By.id("username"));
//	  WebElement user = driver.findElement(By.xpath("//input[@type='text']"));	
//	  user.sendKeys("tomsmith");
//	  WebElement pwd = driver.findElement(By.id("password"));
//	  pwd.sendKeys("SuperSecretPassword!");
////	  WebElement click = driver.findElement(By.className("radius"));
////	  click.click();
////	  driver.findElement(By.tagName("button")).click();
//	  driver.findElement(By.xpath("//button[@type='submit']")).click();
//	  Thread.sleep(5000);
	  
	  
//	  driver.get("https://accounts.lambdatest.com/register");
//	  driver.findElement(By.xpath("//form[@class='form reg-custom']//input[@type='email']")).sendKeys("test");
	  //contains
//	  driver.get("https://www.lambdatest.com/blog");
//	  driver.findElement(By.xpath(("//ul[@id='menu-side-menu']//li[starts-with(@id,'menu-item-3042')][1]"))).click();
//	  
//	  driver.get("https://www.testautomation");
	  
//	  //css selectors
//	  driver.get("https://the-internet.herokuapp.com/login"); //toolsqa.com
//	  WebElement user = driver.findElement(By.cssSelector("#username"));
//
//	  user.sendKeys("tomsmith");
//	  WebElement pwd = driver.findElement(By.cssSelector("input#password"));
//	  pwd.sendKeys("SuperSecretPassword!");
//	  WebElement click = driver.findElement(By.cssSelector("button.radius"));
//	  click.click();
//	  
//	  //nav
//	  driver.get("https://www.lambdatest.com/blog");
//	  driver.findElement(By.cssSelector("nav div.header-menu-item"));
	  
	//submit & clear & click
	  driver.get("https://the-internet.herokuapp.com/login"); //toolsqa.com
	  WebElement user = driver.findElement(By.cssSelector("#username"));//
	  user.sendKeys("tomsmith1");
	  user.clear();
	  user.sendKeys("tomsmith");
	  user.sendKeys(Keys.TAB);
	  WebElement pwd = driver.findElement(By.cssSelector("input#password"));
	  pwd.sendKeys("SuperSecretPassword!");
	  WebElement click = driver.findElement(By.cssSelector("i.fa.fa-2x.fa-sign-in"));
	  click.submit();
	  
	  
  
}
}