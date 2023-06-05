package WebPages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tc_1_ActitimeTypesOfWorkPage 
{
   WebDriver driver;
   WebDriverWait wait;
   
   @FindBy(xpath = "//span[.='Create Type of Work']")
   private WebElement createtypeofworkbutton;
   
   @FindBy(xpath = "(//a[.='sambit']/../following-sibling::td/a)[2]")
   private WebElement deletebutton;
   
   public Tc_1_ActitimeTypesOfWorkPage(WebDriver driver)
   {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
   }
   public void createtypeofworkMethod()
   {
	   wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	   
	   wait.until(ExpectedConditions.visibilityOf(createtypeofworkbutton));
	   createtypeofworkbutton.click();
   }
   public void deleteWorkMethod()
   {
	   wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	   
	   wait.until(ExpectedConditions.visibilityOf(deletebutton));
	   deletebutton.click();
	    
	   Alert alert=driver.switchTo().alert();
       alert.accept();

   }
   
}
