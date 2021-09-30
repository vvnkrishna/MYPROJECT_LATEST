package JavaPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CollectionList2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Christy\\eclipse-workspace\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		driver.switchTo().activeElement();
		
		Thread.sleep(3000);
		
		List <WebElement>days = driver.findElements(By.xpath("//select[@id='day']/option"));
		
		int v = days.size();
		
		System.out.println(v);
		
		
		for(int i = 0 ; i < v; i++ ) {
			
			
			
			String date = days.get(i).getText();
			
			if(date.equals("5")) { 
			days.get(i).click();
			
			break;
			}
			
					
			
			driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			
			System.out.println(date);
		}
		
		
		
		
		
		
	}

}
