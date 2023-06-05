package Generics;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;

public class Screenshot implements ITestListener
{
   public void onTestFailure(ITestListener result)
   {
	   TakesScreenshot ts = (TakesScreenshot)new BaseTest().driver;
	   File src = ts.getScreenshotAs(OutputType.FILE);
	   File destfile = new File("./failedscreenshot/failed1.png");
	   try {
		FileHandler.copy(src, destfile);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
   }
}
