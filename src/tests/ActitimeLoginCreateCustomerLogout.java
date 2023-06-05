package tests;

import java.sql.Driver;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generics.BaseTest;
@Listeners(Generics.MultipleScreenshot.class)
public class ActitimeLoginCreateCustomerLogout extends BaseTest
{
//	WebDriver driver;
	@Test
	public void loginCreateCustomerLogout()
	{
		System.out.println("This test name");
		Assert.assertEquals(true, false);
//		BaseTest base = new BaseTest();
//		base.setup("chrome");
		WebPages.Tc_1_ActitimeLoginpage loginpage=new WebPages.Tc_1_ActitimeLoginpage(driver);
    	loginpage.loginMethod();
    	WebPages.Tc_1_ActitimeHomepage homepage=new WebPages.Tc_1_ActitimeHomepage(driver);
    	homepage.settingsMethod();
    	
    	WebPages.Tc_1_ActimeSettingsPage settingspage=new WebPages.Tc_1_ActimeSettingsPage(driver);
    	settingspage.typesofworkMethod();
    	
    	WebPages.Tc_1_ActitimeTypesOfWorkPage typesofwork=new WebPages.Tc_1_ActitimeTypesOfWorkPage(driver);
    	typesofwork.createtypeofworkMethod();
    	
    	WebPages.Tc_1_ActitimeCreateWorkpage creatework=new WebPages.Tc_1_ActitimeCreateWorkpage(driver);
    	creatework.createWorkMethod();
//    	WebPages.Tc_1_ActitimeTypesOfWorkPage typesofwork=new WebPages.Tc_1_ActitimeTypesOfWorkPage(driver);
    	typesofwork.deleteWorkMethod();
    	WebPages.Tc_1_ActitimeHomepage home =new WebPages.Tc_1_ActitimeHomepage(driver);
    	home.logoutmethod();
	}
}
