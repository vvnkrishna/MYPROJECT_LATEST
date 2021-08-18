package JavaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser5 {

	public static void main(String[] args) throws Exception {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\Christy\\eclipse-workspace\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.shaadi.com/lets-begin/matrimony?gclid=EAIaIQobChMItovU_Lmb8QIVEVdgCh0vDQ3IEAAYAiAAEgIXAfD_BwE");
	
	driver.findElement(By.xpath("//a[contains(text(),'Sign up')]")).click();
	Thread.sleep(3000);
	

	
	List<WebElement> boxes = driver.findElements(By.xpath("//span[@class='select2-chosen']"));
	System.out.println("Total no of boxes = " + boxes.size());
	
	
	}

}
