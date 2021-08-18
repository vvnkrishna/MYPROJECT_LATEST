package JavaPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Christy\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		
		//Create LIst of all Companies
		List<WebElement> AllCompanies = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
		System.out.println("Total Companies : " + AllCompanies.size());
		
		//Create List of All companies Current price
		List<WebElement> CurrentPrice = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		
		
		String companyName = "Adani Enterprises Lt";
		
		for(int i = 0; i < AllCompanies.size();i++) {
			
			if(AllCompanies.get(i).getText().equalsIgnoreCase(companyName)) {
				System.out.println(AllCompanies.get(i).getText() + "===========" + CurrentPrice.get(i).getText());
				break;
				
			}
		}
		
		
		
		
		
		
	
		
	}

}
