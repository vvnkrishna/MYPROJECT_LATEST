 package JavaPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class OpenBrowser3 {

	public static void main(String[] args) throws Exception{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Christy\\eclipse-workspace\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.com/");

		Thread.sleep(6000);

		driver.navigate().refresh();

		Thread.sleep(6000);

		driver.navigate().back();

		Thread.sleep(3000);

		driver.navigate().forward();
		
		Thread.sleep(3000);

		String url = driver.getCurrentUrl();
		System.out.println(url);

		System.out.println(driver.getTitle());
				
		driver.close();

		driver.quit();
		
	}

}
