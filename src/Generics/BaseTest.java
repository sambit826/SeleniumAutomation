package Generics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest implements AutoConstant {
	public static WebDriver driver;
	protected BasePage basePage;

	@BeforeSuite
	public void exicutionStart() {
		System.out.println("exicution start");
	}

	@Parameters("browser")
	@BeforeClass
	public void setup(@Optional("chrome") String browser) {
		System.out.println("Before class");
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
			driver.get(url);
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
			driver.get(url);
		} else {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
			driver.get(url);
		}
	}

	@BeforeMethod
	public void beforeMethod(ITestResult result) {
		
		if(!result.isSuccess()) {
			
		}
//    	driver = Utility.createDriver();

//    	basePage = new BasePage(driver);
//    	driver.get(url);
	}

	@AfterMethod
	public void testTeardown() {
//    	driver.close();
	}

	@AfterClass
	public void teardown() {
//       driver.quit();
	}

	@AfterSuite
	public void exicutionComplete() {
		Reporter.log("Exicution Completed");
	}

}
