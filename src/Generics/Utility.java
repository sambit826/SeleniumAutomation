package Generics;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utility {

	public static WebDriver driver;
	
	public static WebDriver createDriver() {
		
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		
		return driver;
		
	}
	public void highlightElement(WebElement element) throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('style',background:yellow')", element);
		Thread.sleep(3000);
		js.executeScript("arguments[0].setAttribute('style',background:white)", element);
	}
}
