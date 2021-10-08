package JavaPackage;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class Dropdown4 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Christy\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(
				"https://www.shaadi.com/lets-begin/matrimony?gclid=EAIaIQobChMItovU_Lmb8QIVEVdgCh0vDQ3IEAAYAiAAEgIXAfD_BwE");
		
		 		

		WebElement signup = driver.findElement(By.xpath("//*[text()='Sign up']"));
		signup.click();
		Thread.sleep(3000);
		
		List<WebElement> Ddbox = driver.findElements(By.xpath("//*[@class='select_drop_m form-control form_dropdown validate select_drop select2-offscreen']/option"));
		WebElement rela = driver.findElement(By.xpath("//*[text()='Relative']"));
		
		String content = rela.getAttribute("textContent");
		
		System.out.println(content);
		
		

		//WebElement Ddbox = driver.findElement(By.xpath("//*[@class='select2-container select_drop_m form-control form_dropdown validate select_drop']"));
		//Ddbox.click();
		//Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("document.getElementById('Relative').click()");	
		String s = (String) js.executeScript("return arguments[2].value;", Ddbox);
		
		System.out.println(s);
		
		
	
		
		//String hidden = ((JavascriptExecutor)driver).executeScript("return arguments[0].value;",driver.findElement(By.xpath("//*[text()='Relative']")));
		
		//System.out.println(hidden);
	}

}
