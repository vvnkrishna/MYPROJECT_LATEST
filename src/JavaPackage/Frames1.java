package JavaPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames1 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Christy\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://paytm.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Log In/Sign Up']")).click();
		Thread.sleep(3000);

		
		
		List<WebElement> AllFrames = driver.findElements(By.tagName("iframe"));
		System.out.println("Total Frames: " + AllFrames.size());
		
		Thread.sleep(3000);
		for(int i = 0; i < AllFrames.size(); i++) {
			driver.switchTo().frame(i);
			driver.findElement(By.xpath("//*[@id='main-container']/div/div/div/div/div/div[1]/div/div/div[2]/span")).click();
			
			
		}

	}
	}


