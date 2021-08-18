package JavaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class JavaScriptExecutor2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Christy\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://en-gb.facebook.com/");

	//Locate Webelement using Javascript	
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	jse.executeScript("document.getElementById('email').value='abc@gmail.com'");
	jse.executeScript("document.getElementById('pass').value='12345'");
	
	//Clicking on webElement by using Javascript
	jse.executeScript("document.getElementById('u_0_2_Aq').click()");
	//jse.executeScript("document.getElementById('u_0_2_Aq').checked=true");
	
	
	
	
	


}
}