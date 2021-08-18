package JavaPackage;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class TakesScreenshotOnFailure1 {
	
	WebDriver driver;
	
	public void capturescreenshot(ITestResult result) throws Exception {
		
		if(ITestResult.FAILURE == result.getStatus()) {
			
			
			TakesScreenshot ts = (TakesScreenshot) driver;
			
			File source = ts.getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(source, new File("./ScreenShotssssss/" + result.getName()  + ".png" ));
			System.out.println( result.getName() + "method() ScreenShots Captured");
			
			
		}
		
		
	}
	
	
	
	

}
