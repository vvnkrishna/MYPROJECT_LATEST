package JavaPackage;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupHandling2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Christy\\eclipse-workspace\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();		
        driver.manage().window().maximize();
        driver.get("https://www.naukri.com");
        
        String mainwindow = driver.getWindowHandle();
        System.out.println("This is mainwindow:" + mainwindow);
           
        Set<String> all = driver.getWindowHandles();
        
        for(String one: all) {
        	
        	if(!one.equals(mainwindow)) {
        		
        		driver.switchTo().window(one);
        		System.out.println(one);
        		driver.close();
        		driver.switchTo().window(mainwindow);
        	}
        	
        
        }
        
		
	}

}
