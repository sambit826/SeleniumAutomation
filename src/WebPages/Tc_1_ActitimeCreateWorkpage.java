package WebPages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tc_1_ActitimeCreateWorkpage 
{
   WebDriver driver;
   WebDriverWait wait;
   
   @FindBy(id = "name")
   private WebElement namebox;
   
   @FindBy(xpath = "//input[@type=\"submit\"]")
   private WebElement submitbutton;
   
   public Tc_1_ActitimeCreateWorkpage(WebDriver driver)
   {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
   }
   public void createWorkMethod()
   {
	   wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	   
	   wait.until(ExpectedConditions.visibilityOf(namebox));
	   namebox.sendKeys("sambit");
	   
	   wait.until(ExpectedConditions.visibilityOf(submitbutton));
	   submitbutton.click();
   }
  
}
