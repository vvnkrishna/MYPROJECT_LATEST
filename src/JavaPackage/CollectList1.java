package JavaPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CollectList1 {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Christy\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");

		Thread.sleep(3000);
		driver.findElement(By.xpath("html/body/div[2]/div/div/button")).click();

		Thread.sleep(2000);

		List<WebElement> contain1 = driver.findElements(By.xpath("//div[@class='_37M3Pb']/div"));

		int blocks = contain1.size();

		System.out.println(blocks);

	

		for (int i = 0; i < blocks; i++) {
			
			List<WebElement> contain = driver.findElements(By.xpath("//div[@class='_37M3Pb']/div"));

			String name = contain.get(i).getText();
			
			System.out.println(name);
			
			contain.get(i).click();

			Thread.sleep(2000);

			driver.navigate().back();

			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

			driver.switchTo().defaultContent();
			
			Thread.sleep(3000);

		}

		Thread.sleep(2000);

		// driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); }

	}

}
