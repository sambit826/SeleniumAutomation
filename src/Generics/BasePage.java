package Generics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage {
	static WebDriver driver;
	public BasePage(WebDriver driver) {
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}
	public void waitForElement(WebElement ele) {
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	   wait.until(ExpectedConditions.visibilityOf(ele) );
	}

	// WebDriver Interface
	public void validateTitle(String expectedTitle) {
		String ActualTitel = driver.getTitle();
		Assert.assertEquals(ActualTitel, expectedTitle, "Both Titles are not matching");
		Reporter.log("Both Title Are Matching");
	}

	// Select Class
	public void selectBytext(WebElement element, String text) {
		waitForElement(element);
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	// Action class
	public void movetoElement(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}
	//Robot class
    public void robotEnter() throws AWTException, InterruptedException
    {
    	Robot robot = new Robot();
    	robot.keyPress(KeyEvent.VK_ENTER);
    	Thread.sleep(2000);
    	robot.keyRelease(KeyEvent.VK_ENTER);
    }
   public void javascriptClick(WebElement element)
   {
	   JavascriptExecutor js = (JavascriptExecutor)driver;
	   js.executeScript("arguments[0].click()", element);
   }
    public void javascriptEnter(String value ,WebElement element)
    {
    	JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript(value, element);	
    }
    public void alertAccept()
    {
    	driver.switchTo().alert().accept();
    }
	

}
