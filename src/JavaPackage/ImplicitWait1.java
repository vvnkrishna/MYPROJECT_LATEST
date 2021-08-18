package JavaPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Christy\\eclipse-workspace\\.chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Introducing Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("how selenium works");

		// How to handle auto suggestion
		WebElement Allsuggestions = driver.findElement(By.xpath("//*[@role='listbox']"));

		List<WebElement> Allsearch = Allsuggestions.findElements(By.tagName("li"));

		for (int i = 0; i < Allsearch.size(); i++) {

			String AllsuggestionsList = Allsearch.get(i).getText();

			String finalresult = "how selenium works with jenkins";

			if (AllsuggestionsList.equalsIgnoreCase(finalresult)) {
				Allsearch.get(i).click();
				System.out.println("You are selected : " + finalresult);
				break;

			}

		}

	}

}
