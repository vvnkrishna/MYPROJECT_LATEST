package JavaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion1 {
	
	WebDriver driver;
	
	@Test
	public void testcase1() throws Exception {
		
		String Expected = "The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
				
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Christy\\eclipse-workspace\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://en-gb.facebook.com/");
						
		driver.findElement(By.xpath("//*[@name='login']")).click();
        Thread.sleep(3000);
        String actual = driver.findElement(By.xpath("//*[@class='_9ay7']")).getText();
        
        Assert.assertEquals(actual, Expected);
        System.out.println("Assertion Verified Successfully");
        Assert.assertTrue(driver.findElement(By.xpath("//*[@class='_9ay7']")).isDisplayed());
        System.out.println("WebElement is displayed");
        Assert.assertFalse(driver.findElement(By.xpath("//*[@class='_9ay7']")).isSelected());
        System.out.println("WebElement i not selected");
        
        
        
        
        
        
        
        
        
        
        
		
		Thread.sleep(3000);
		
		
		
	}

}
