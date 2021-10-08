package InterviewDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class mandatoryField {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Christy\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		
		driver.findElement(By.xpath("(//*[@class='VfPpkd-vQzf8d'])[2]")).click();
		Thread.sleep(3000);
		
		
		boolean  el = driver.getPageSource().contains("Enter first name and surname");
		
		//System.out.println(el);
		Assert.assertTrue(el);
		System.out.println("Mandatory fields");
		
		
		
	}

}
