package WebPages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tc_1_ActitimeHomepage 
{
   WebDriver driver;
   WebDriverWait wait;
   
   @FindBy(xpath = "(//div[@class=\"popup_menu_icon\"])[2]")
   private WebElement settingsbutton;
   
   @FindBy(id = "logoutLink")
   private WebElement logoutbutton;
   
   public Tc_1_ActitimeHomepage(WebDriver driver)
   {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
   }
   public void settingsMethod()
   {
	    wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	   
	   wait.until(ExpectedConditions.visibilityOf(settingsbutton));
	   settingsbutton.click();
   }
   public void logoutmethod()
   {
	  wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	 
	  wait.until(ExpectedConditions.visibilityOf(logoutbutton));
	  logoutbutton.click();
   }
}
