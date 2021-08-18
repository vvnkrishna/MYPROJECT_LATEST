package JavaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation1 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Christy\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("html/body/div[2]/div/div/button")).click();
		
		
		WebElement Electronics = driver.findElement(By.xpath("//*[@id=\'container\']/div/div[2]/div/div/div[5]/a/div[2]/div/div"));
		WebElement Fashion = driver.findElement(By.xpath("//*[@id=\'container\']/div/div[2]/div/div/div[4]/a/div[2]/div/div"));
		
		Actions act = new Actions(driver);
		
		//Mouse Hover to Electronics Webelement
		Thread.sleep(3000);
		act.moveToElement(Electronics).build().perform();
		
		//Right Click on Electronics
		Thread.sleep(3000);
		act.contextClick(Electronics).build().perform();
		
		//Release control from Electronics
		Thread.sleep(3000);
		act.release(Electronics).build().perform();
		
		//press enter to Fashion WebElemnet
		Thread.sleep(3000);
		act.sendKeys(Fashion, Keys.ENTER).build().perform();
		System.out.println("Succesfully Executed");
		
		
		
		
		
		
		
		
		
		
	}

}
