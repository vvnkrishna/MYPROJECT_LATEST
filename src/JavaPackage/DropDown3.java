package JavaPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DropDown3 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Christy\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(
				"https://www.shaadi.com/lets-begin/matrimony?gclid=EAIaIQobChMItovU_Lmb8QIVEVdgCh0vDQ3IEAAYAiAAEgIXAfD_BwE");
		
		 		

		WebElement signup = driver.findElement(By.xpath("//*[text()='Sign up']"));
		signup.click();
		Thread.sleep(3000);

		WebElement Ddbox = driver.findElement(By.xpath(
				"//*[@class='select2-container select_drop_m form-control form_dropdown validate select_drop']"));
		Ddbox.click();
		Thread.sleep(3000);
		
		
		
		
		  WebElement Showmore = driver.findElement(By.xpath(
		  "//body/div[@id='select2-drop']/ul[1]/li[7]/div[1]")); Showmore.click();
		  Thread.sleep(3000);
		  
		  WebElement Select = driver.findElement(By.xpath("//*[@id='select2-drop']"));
		  List<WebElement> Profile = Select.findElements(By.tagName("li"));
		 

		for (int i = 0; i < 6; i++) {
			
			

			String Relation = Profile.get(i).getText();

			String finalresult = "Relative";

			if (Relation.equalsIgnoreCase(finalresult)) {

				Profile.get(i).click();

				System.out.println("Relationship is : " + finalresult);

				break;

			}

		}

	}

}
