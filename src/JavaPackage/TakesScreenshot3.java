package JavaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TakesScreenshot3 {

	TakesScreenshotOnFailure1 t99 = new TakesScreenshotOnFailure1();
	
	@Test(priority = 1)
	public void ShadiLogin() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Christy\\eclipse-workspace\\chromedriver.exe");
		t99.driver = new ChromeDriver();		
		t99.driver.manage().window().maximize();
		t99.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		t99.driver.get("https://www.shaadi.com/lets-begin/matrimony?gclid=EAIaIQobChMItovU_Lmb8QIVEVdgCh0vDQ3IEAAYAiAAEgIXAfD_BwE");
		t99.driver.findElement(By.xpath("//*[@type='login']")).click();
		t99.driver.findElement(By.xpath("//*[@id='login_page']")).sendKeys("9999999999");
		t99.driver.findElement(By.xpath("//*[@id='password_page']")).sendKeys("12345");
		t99.driver.findElement(By.xpath("//*[@id='login_Error']")).sendKeys("12345");
	}
	
	@Test(priority = 2)
	public void Assertioncheck() {
		System.out.println("Assertion checked");
		
	}
	
	@AfterMethod
	public void FailurescrenshotsShaadi(ITestResult result) throws Exception {
		
		t99.capturescreenshot(result);
		t99.driver.quit();
		
		
		
		
	
	
	
	
		
		
		
		
		
		
		
		
		
	}
	
}
