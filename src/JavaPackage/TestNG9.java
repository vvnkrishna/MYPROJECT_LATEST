package JavaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG9 {
	
	WebDriver driver;
	
	@BeforeTest
	public void setEnv() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Christy\\eclipse-workspace\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
				
	}
	
	@DataProvider
	public String[][] dataset(){
		
		String arr[][] = new String[4][2];
		
		arr[0][0] = "FirstName_0";
		arr[0][1] = "SurName_0";
		
		arr[1][0] = "FirstName_1";
		arr[1][1] = "SurName_1";
		
		arr[2][0] = "FirstName_2";
		arr[2][1] = "SurName_2";
		
		arr[3][0] = "FirstName_3";
		arr[3][1] = "SurName_3";
			
		return arr;
		
	}
	
	@Test(dataProvider = "dataset")
	
	public void entercredentials(String EMAIL, String PASSWORD) throws Exception {

		Thread.sleep(1000);
		driver.findElement(By.id("email")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys(EMAIL);
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).sendKeys(PASSWORD);
		Thread.sleep(1000);
		
	}
	

}
