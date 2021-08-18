package JavaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TakesScreenshotOnFailure2 {

	TakesScreenshotOnFailure1 t1 = new TakesScreenshotOnFailure1();
	
	@Test(priority = 1)
	
	public void doingLogin() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Christy\\eclipse-workspace\\chromedriver.exe");
		t1.driver = new ChromeDriver();		
		t1.driver.manage().window().maximize();
		t1.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		t1.driver.get("https://en-gb.facebook.com/");
		t1.driver.findElement(By.xpath("//*[@id='email']")).sendKeys("abc@gmail.com");
		t1.driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("12345");
		
		t1.driver.findElement(By.xpath("//*[@id='login_text']")).sendKeys("12345");
		
		}
	@Test(priority = 2)
	public void assertionCheck() {
		System.out.println("Assertion checked");
		
	}
	
	@AfterMethod
	public void Failurescreenshots(ITestResult result) throws Exception {
		
		t1.capturescreenshot(result);
		t1.driver.quit();
		
			
	}
	
	
	
}
