package Generics;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class WebElementScreenShot 
{
   public void takeelementScreenshot(WebElement element , String filename)
   {
	   TakesScreenshot ts = (TakesScreenshot)element;
	   File srcfile = ts.getScreenshotAs(OutputType.FILE);
	   try {
		FileHandler.copy(srcfile, new File("./failedscreenshot/"+filename+".png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
}
