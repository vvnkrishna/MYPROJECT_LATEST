package JavaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG8 {

	WebDriver driver;

	@BeforeClass
	public void setEnv() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Christy\\eclipse-workspace\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://en-gb.facebook.com/r.php");

	}

	@DataProvider
	public String[][] dataset() {

		String arr[][] = new String[2][3];

		arr[0][0] = "FirstName_0";
		arr[0][1] = "SurName_0";
		arr[0][2]= "Email_0";
		
		arr[1][0] = "FirstName_1";
		arr[1][1] = "SurName_1";
		arr[1][2] = "Email_1";
		
		return arr;

	}

	@Test(dataProvider = "dataset")
	public void entercredentials(String Firstname, String Surname, String Email) throws Exception {

		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@aria-label='First name']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@aria-label='Surname']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@aria-label='Mobile number or email address']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@aria-label='First name']")).sendKeys(Firstname);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@aria-label='Surname']")).sendKeys(Surname);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@aria-label='Mobile number or email address']")).sendKeys(Email);
		
		
	}

}
