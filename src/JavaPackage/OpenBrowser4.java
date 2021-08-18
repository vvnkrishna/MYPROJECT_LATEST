package JavaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser4 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Christy\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/r.php");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='1']")).click();;
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='2']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='-1']")).click();
		
		
		List<WebElement> buttons = driver.findElements(By.xpath("//input[contains(@type,'radio')]"));
		System.out.println("Total radio buttons = " + buttons.size());
		
		Thread.sleep(3000);
		System.out.println(buttons.get(1).isEnabled());
		Thread.sleep(3000);
		System.out.println(buttons.get(0).isDisplayed());
		Thread.sleep(3000);
		System.out.println(buttons.get(1).isSelected());
		Thread.sleep(3000);
		buttons.get(2).click();
		System.out.println(buttons.get(1).isSelected());
		Thread.sleep(3000);
		driver.close();
		driver.quit();
		
		
		
			}

}