package JavaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;


public class Test1 {
	
	public void OpenBrowser(WebDriver driver, JavascriptExecutor ele) {
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementByclass('ele').value='12345'");
		
	}
	
	public void OpenBrowser(WebDriver driver, String xpat) {
		
		driver.findElement(By.xpath(xpat)).sendKeys("abc@gmail.com");
		
		
		

	}

}
