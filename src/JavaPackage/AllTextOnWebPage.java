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
		
<<<<<<< HEAD
		String st = text.get(0).getText();
		System.out.println(st);
		
=======
>>>>>>> bfddf0468e131bde54a346abef92671f1a75108e
	//String j  =	Integer.toString(text.size());
	

	
	//System.out.println("string size is :"+ j);
		
<<<<<<< HEAD
		/*int count = text.size();
=======
		int count = text.size();
>>>>>>> bfddf0468e131bde54a346abef92671f1a75108e
		
		System.out.println(count);
		
		for(int i = 0; i < count; i++) {
			
		String s =	text.get(i).getText();
		
		System.out.println(s);
<<<<<<< HEAD
			*/
=======
			
>>>>>>> bfddf0468e131bde54a346abef92671f1a75108e
			
		}
		
				
		
		
		
		
		
	}

<<<<<<< HEAD

=======
}
>>>>>>> bfddf0468e131bde54a346abef92671f1a75108e
