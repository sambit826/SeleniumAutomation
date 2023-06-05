package Generics;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class WebTableScreenshot 
{
  @Test
  public void screenshotWebtable() throws IOException
  {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://omayo.blogspot.com");
	  WebElement table = driver.findElement(By.id("table1"));
	  
	  File srcfile =table.getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(srcfile, new File("./failedscreenshot/webtable.png"));
  }
}
