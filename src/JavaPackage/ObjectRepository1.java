package JavaPackage;


import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectRepository1 {

	public static void main(String[] args) throws Exception {
		
		File src = new File("C:\\Users\\Christy\\eclipse-workspace\\MyProject\\Repository\\Object_Reposit_FB.properties");
		
		
		FileInputStream fis = new FileInputStream(src);
		
		
		Properties prop = new Properties();
		prop.load(fis);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Christy\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://en-gb.facebook.com/r.php");
		Thread.sleep(3000);
		driver.findElement(By.xpath(prop.getProperty("Firstname"))).sendKeys("abc@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath(prop.getProperty("Surname"))).sendKeys("12345");
		Thread.sleep(2000);
		driver.findElement(By.xpath(prop.getProperty("Mobilenumber"))).sendKeys("1234567891");
		
		
		
		
	}

}
