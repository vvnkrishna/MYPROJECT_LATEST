package JavaPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation3 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Christy\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/draggable/");

		Thread.sleep(3000);

		// Switch frame
		List<WebElement> AllFrames = driver.findElements(By.tagName("iframe"));
		System.out.println("Total number of frames : " + AllFrames.size());
		driver.switchTo().frame(0);

		// Drag and droppable Webelement
		WebElement source = driver.findElement(By.xpath("//*[@id='draggable']"));

		// Using Actions Class
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.dragAndDropBy(source, 10, 10).build().perform();

		// Dragging the webElement and click and hold using coordinates
		Thread.sleep(3000);
		act.clickAndHold(source).dragAndDropBy(source, 10, 10).build().perform();

		
	}

	
	 // Mouse scroll( horizontally,vertically)
	  (JavascriptExecutor)driver.executescript("scroll(0,400)"):
	 
		
	
}
