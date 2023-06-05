package WebPages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Generics.WebElementScreenShot;

public class Tc_1_ActitimeLoginpage 
{
  WebDriver driver;
  WebDriverWait wait;
  
  @FindBy(id = "username")
  private WebElement usernamebox;
  
  @FindBy(name = "pwd")
  private WebElement passwordbox;
  
  @FindBy(xpath = "//div[.='Login ']")
  private WebElement loginbutton;
  
  public Tc_1_ActitimeLoginpage(WebDriver driver)
  {
	this.driver=driver;
	PageFactory.initElements(driver, this);
  }
  public void loginMethod()
  {
	  wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	  
	  wait.until(ExpectedConditions.visibilityOf(usernamebox));
	  usernamebox.sendKeys("admin");
	  
	  wait.until(ExpectedConditions.visibilityOf(passwordbox));
	  passwordbox.sendKeys("manager");
	  
	  wait.until(ExpectedConditions.visibilityOf(loginbutton));
	  loginbutton.click();
	  
  }
}
