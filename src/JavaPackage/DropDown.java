package JavaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Christy\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/r.php");

		//1st way 
		
		List<WebElement> bm = driver.findElements(By.xpath("//*[@id='month']/option"));
		System.out.println("Total dropdown values are : "+bm.size());
		bm.get(7).click();
		System.out.println(bm.get(2).isEnabled());
		System.out.println(bm.get(7).isDisplayed());
		
		//2nd Way
		WebElement birthmonth = driver.findElement(By.xpath("//*[@id='month']"));
		Select monbox = new Select(birthmonth);
		
		monbox.selectByVisibleText("Apr");//Apr
	    Thread.sleep(3000);
	    monbox.selectByValue("12");//Dec
		Thread.sleep(3000);
		monbox.selectByIndex(7);//Jul
		
		System.out.println(monbox.getFirstSelectedOption().getText());
		
		//3rd way We are storing all drop values in list 
		
		List<WebElement> boxes = monbox.getOptions();
		
		
		for(int i=0;i<boxes.size();i++) {
					
			String facebookmonth = boxes.get(i).getText();
			
			
			if(facebookmonth.equalsIgnoreCase("Jul")) {
				
				boxes.get(i).click();
				//or
				//monbox.selectByVisibleText(facebookmonth);
				System.out.println(i);
			}
			
		
			
		}
		
		
		
		
		
		
		
		
		
		
	    
		
		
		
		
		
		
	}
	

}
