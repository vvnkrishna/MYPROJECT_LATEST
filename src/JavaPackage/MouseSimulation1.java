package JavaPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class MouseSimulation1 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Christy\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("html/body/div[2]/div/div/button")).click();
		
		Thread.sleep(2000);
		
		String parent = driver.getWindowHandle();

		Actions act = new Actions(driver);

		WebElement Electronics = driver.findElement(By.xpath("//div[contains(text(),'Electronics')]"));
		
		act.moveToElement(Electronics).build().perform();
		
		
		
		
		
	}}
		
	