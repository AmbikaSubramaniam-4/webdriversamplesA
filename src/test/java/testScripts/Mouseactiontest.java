package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Mouseactiontest {
  @Test
  public void mouse_action() throws Exception{
	  
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  Actions a = new Actions(driver);
	  driver.get("https://testautomationpractice.blogspot.com/");
	  //scroll
	  WebElement field2 = driver.findElement(By.id("field2"));
	  a.scrollToElement(field2).perform();
	  
	  //mousehover
	  WebElement hover = driver.findElement(By.xpath("//button[@class='dropbtn']"));
	  a.moveToElement(hover).perform();
	  Thread.sleep(5000);
	  
	  //click
	  WebElement cli = driver.findElement(By.linkText("Mobiles"));
	  a.click(cli).perform();
	  Thread.sleep(5000);
	  
	  //doubleclick
	  WebElement doublecl = driver.findElement(By.xpath("//button[contains(text(),'Copy Text')]"));
	  a.doubleClick(doublecl).perform();
	  
	  //contextclick
	  a.contextClick(doublecl).perform();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
