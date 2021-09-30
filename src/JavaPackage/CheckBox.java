package JavaPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class CheckBox {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Christy\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");

		Thread.sleep(3000);
		driver.findElement(By.xpath("html/body/div[2]/div/div/button")).click();

		Thread.sleep(2000);
		
		Actions act = new Actions(driver);

		WebElement Electrionics = driver.findElement(By.xpath("//*[text()='Electronics']"));

		act.moveToElement(Electrionics).build().perform();
		
		act.moveToElement(Electrionics).clickAndHold().build().perform();
		
		//act.contextClick(Electrionics).build().perform();
		
		Thread.sleep(3000);
		
		WebElement Camera = driver.findElement(By.xpath("//*[text()='Cameras & Accessories']"));

	   Camera.click();
	   
	   driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);  
	   
	   List<WebElement> content = driver.findElements(By.xpath("//*[@class='_2d0we9']/div"));
	   
	   driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	   
		  int count = content.size();
		  
		  System.out.println(count);
		 
		
		for (int i = 0; i < count; i++) {
			
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			
			String four = "2? & above";
			
			if(content.get(i).getText().equals(four)) {				
				content.get(i).click();				
				break;
			}
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);			
			String ratings = content.get(i).getText();
			System.out.println(ratings);

		}
		
		

	}

}
