package JavaPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class checkBox001 {

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

		// act.contextClick(Electrionics).build().perform();

		Thread.sleep(3000);

		WebElement Camera = driver.findElement(By.xpath("//*[text()='Cameras & Accessories']"));

		Camera.click();

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		List<WebElement> checkboxes = driver.findElements(By.xpath("//*[@type='checkbox']"));

		int value = checkboxes.size();

		System.out.println(value);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(0,400)");
		

		for (int i = 0; i < 4; i++) {

			//List<WebElement> boxescheck = driver.findElements(By.xpath("//*[@class='_2iDkf8 t0pPfW']/input"));
			
			List<WebElement> boxescheck = driver.findElements(By.xpath("//*[@class='_2d0we9']/div"));

			
			
			 Thread.sleep(2000);
			
			String name = boxescheck.get(i).getText();
			
			System.out.println(name);
			

			boxescheck.get(i).click();

			Thread.sleep(2000);

		}

		// how many checkboxes are selected

		List<WebElement> boxes = driver.findElements(By.xpath("//*[@class='_2d0we9']/div"));

		for (WebElement ticked : boxes) {
			
			
			
			boolean mark = ticked.isSelected();
			

			int NoOfChecked = 0;

			if (mark == true) {

				NoOfChecked++;
								
			}
			
			System.out.println(NoOfChecked);

		}

	}

}
