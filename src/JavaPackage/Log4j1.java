package JavaPackage;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4j1 {

	public void main() {
		
		//We need to create Logger instance so we need to pass class name for which we want
		//to create log file,in this case Class name is Log4j1 
		org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger("Log4j1");
		
		//Configure log4j properties file
		PropertyConfigurator.configure("C:\\Users\\Christy\\eclipse-workspace\\MyProject\\log4j.properties");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Christy\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		logger.info("ChromeBrowser opened");
		
		driver.manage().window().maximize();
		logger.info("Window maximized");
		
		
		
		
		
		
		
		
		
		
	}

}
