package JavaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown2 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Christy\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/r.php");

		// 1st way

		List<WebElement> bday = driver.findElements(By.xpath("//*[@id='day']/option"));
		System.out.println("Total dropdown days are : " + bday.size());
		bday.get(7).click();
		bday.get(28).click();
		System.out.println(bday.get(8).isEnabled());// True
		System.out.println(bday.get(28).isSelected());// True
		System.out.println(bday.get(9).isDisplayed());// False

		// 2nd way

		WebElement days = driver.findElement(By.xpath("//*[@id='day']"));
		Select DaysBox = new Select(days);

		DaysBox.selectByValue("25");// 25

		Thread.sleep(3000);
		DaysBox.selectByIndex(15);// 15

		// 3rd way we are storing all dropvalues in list

		List<WebElement> boxes = DaysBox.getOptions();

		for (int i = 0; i < boxes.size(); i++) {

			

			if (i == 28) {

				boxes.get(i).click();

				System.out.println(i);
			}

		}

	}

}
