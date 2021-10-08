package JavaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class svgHandling1 {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Christy\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/search?q=tcs+share+price&ei=Pb1ZYbSrDpPA3LUP3aWG-AU&ved=0ahUKEwj0vb7-uK7zAhUTILcAHd2SAV8Q4dUDCA0&uact=5&oq=tcs+share+price&gs_lcp=Cgdnd3Mtd2l6EAMyBAgAEEcyBAgAEEcyBAgAEEcyBAgAEEcyBAgAEEcyBAgAEEcyBAgAEEcyBAgAEEc6BwgAEEcQsAM6BwgAELADEENKBQg6EgExSgUIPBIBMUoECEEYAEoFCEASATFQoglYoglgsw9oAXACeACAAQCIAQCSAQCYAQCgAQHIAQjAAQE&sclient=gws-wiz");
		
		WebElement src = driver.findElement(By.xpath("//*[local-name()='svg' and @class='uch-psvg']//*[name()='clipPath' and @id='range-id-tsuid7r9ZYbG7J6nB3LUPldy0qAE1']"));
		
		WebElement dst = driver.findElement(By.xpath("//*[local-name()='svg' and @class='uch-psvg']//*[name()='clipPath' and @id='mask-_7r9ZYbG7J6nB3LUPldy0qAE2']"));
		
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.dragAndDrop(src, dst).perform();
	}

}
