package JavaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class CheckBackgroundcolor {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Christy\\eclipse-workspace\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement e = driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']"));
		
		String backcolor = e.getCssValue("background-color");
		System.out.println(backcolor);
		
		
		
		
		String hexbackcolr = Color.fromString(backcolor).asHex();
		
		System.out.println(hexbackcolr);
		
		
		
		if(hexbackcolr.equals("#42b72a")) {
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test failed");
		}
		
	//	List<WebElement> greenbox = driver.findElements(By.cssSelector(hexbackcolr));
		
		
		
		}

	
	
	
}
