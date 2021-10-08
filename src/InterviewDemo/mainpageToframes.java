package InterviewDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class mainpageToframes {
	
	public static void main(String[] args) throws InterruptedException {
		
	
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Christy\\eclipse-workspace\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
	
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
	driver.findElement(By.id("name")).sendKeys("Hello World");
	
	Thread.sleep(3000);
	
	WebElement frame1 = driver.findElement(By.id("frm1"));
	//WebElement frame3 = driver.findElement(By.id("frm3"));
	
	
	driver.switchTo().frame(frame1);
	
	Thread.sleep(3000);
	WebElement course = driver.findElement(By.id("selectnav1"));
	
	Select coursedd = new Select(course);
	coursedd.selectByVisibleText("-- Selenium");
	
	Thread.sleep(3000);
	
	driver.switchTo().defaultContent();
	
	Thread.sleep(3000);
	
	driver.findElement(By.id("name")).clear();
	driver.findElement(By.id("name")).sendKeys("Bye World");
	Thread.sleep(3000);
	
	driver.close();
			
			
			
	
	
	
	
	
	
	
	}
	
	

}
