package JavaPackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopHandling1 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Christy\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com");
		
		//Here we create to find how many windows aare opened
		Thread.sleep(3000);
		Set<String> PopupID = driver.getWindowHandles();
		System.out.println(PopupID);
		System.out.println(PopupID.size());
		
		//Here we create list of windows in line wise such as which is first,second,third ....etc				
		Iterator<String> Ittt = PopupID.iterator();
		String mainwindow = Ittt.next();
		String pop1 = Ittt.next();
		String pop2 = Ittt.next();
		String pop3 = Ittt.next();
		
		//Here we switch to window,get id, get title and close the window		
		Thread.sleep(3000);
		driver.switchTo().window(pop1);
		System.out.println(pop1);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.close();
		
		//Here we switch to window,get id, get title and close the window	
		Thread.sleep(3000);
		driver.switchTo().window(pop2);
		System.out.println(pop2);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.close();
		
		//Here we switch to window,get id, get title and close the window	
		Thread.sleep(3000);
		driver.switchTo().window(pop3);
		System.out.println(pop3);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.close();
		
		//Here we switch to window,get id, get title and quit the window i.e Close entire browser....	
		Thread.sleep(3000);
		driver.switchTo().window(mainwindow);
		System.out.println(mainwindow);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.quit();
		
	}

}
