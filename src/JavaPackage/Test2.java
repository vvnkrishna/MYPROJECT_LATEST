package JavaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 extends Test1 {

	
	
	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Christy\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://en-gb.facebook.com/");

		Test2 t2 = new Test2();
		t2.OpenBrowser(driver, "//*[@id='email']");
		Thread.sleep(5000);
		t2.OpenBrowser(driver,"inputtext _55r1 _6luy _9npi");
	}
}
