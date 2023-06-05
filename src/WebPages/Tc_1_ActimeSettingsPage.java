package WebPages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tc_1_ActimeSettingsPage 
{
   WebDriver driver;
   WebDriverWait wait;
   
   @FindBy(xpath = "//a[.='Types of Work']")
   private WebElement typesofworkbutton;
   
   public Tc_1_ActimeSettingsPage(WebDriver driver)
   {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
   }
   public void typesofworkMethod()
   {
	   wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	   
	   wait.until(ExpectedConditions.visibilityOf(typesofworkbutton));
	   typesofworkbutton.click();
   }
}
