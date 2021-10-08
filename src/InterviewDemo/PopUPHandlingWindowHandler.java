package InterviewDemo;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUPHandlingWindowHandler {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Christy\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		
		
		String mainwindow = driver.getWindowHandle();
		
		Set<String> all = driver.getWindowHandles();
		
				
		for(String one : all) {
			
			if(!one.equals(mainwindow)) {
				
				//driver.navigate().forward();
				//driver.navigate().back();
				//driver.navigate().refresh();
				
				
				driver.switchTo().window(one);
				driver.close();
				driver.switchTo().window(mainwindow);
				System.out.println(mainwindow);
									
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
