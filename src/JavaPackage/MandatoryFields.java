package JavaPackage;


import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MandatoryFields {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Christy\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://admissions.aud.ac.in/admission21/");	
		
		
		
		
		  StringBuffer verificationErrors = new StringBuffer();
		  
		  try { assertTrue(driver.findElement(By.cssSelector("*")).getText().matches("^[\\s\\S]*Value is required and can't be empty[\\s\\S]*$")); 
		  } 
		  catch
		  (Error e) { verificationErrors.append(e.toString());
		  
		  e.getMessage();
		
		  
		  }
		  
		  List<String> def = new ArrayList<String>();
		  
		// String abcd =driver.findElements(By.cssSelector("*")).getCssValue(".control-label");
		  
		  
		  
		  System.out.println(abcd);
		 
		 
		
	String b = driver.manage().toString();
	
	//System.out.println(b);
		  }

	}


