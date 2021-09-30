package JavaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class AllTextOnWebPage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Christy\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://admissions.aud.ac.in/admission21/");
	   
		
		List<WebElement> text = driver.findElements(By.xpath("*"));
		
	//String j  =	Integer.toString(text.size());
	

	
	//System.out.println("string size is :"+ j);
		
		int count = text.size();
		
		System.out.println(count);
		
		for(int i = 0; i < count; i++) {
			
		String s =	text.get(i).getText();
		
		System.out.println(s);
			
			
		}
		
				
		
		
		
		
		
	}

}
