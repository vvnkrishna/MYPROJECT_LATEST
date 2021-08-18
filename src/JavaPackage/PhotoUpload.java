package JavaPackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PhotoUpload {

	public static void main(String[] args) throws Exception {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Christy\\eclipse-workspace\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.findElement(By.xpath("//*[@name='txtUsername']")).sendKeys("Aravind");
		driver.findElement(By.xpath("//*[@name='txtPassword']")).sendKeys("abcdef@123");
		driver.findElement(By.xpath("//*[@name='Submit']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='menu_pim_viewMyDetails']")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@class='tiptip']")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('photofile').click()");
		
		//driver.findElement(By.xpath("//input[@type='file']")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("D:\\Manual Testing\\Images\\PhotoUpload_004.exe");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='btnSave']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='btnDelete']")).click();
		
		

	}

}
