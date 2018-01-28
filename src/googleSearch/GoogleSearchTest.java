package googleSearch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	public static void main(String[] args) {
		// TODO Google Search Test

		System.setProperty("webdriver.chrome.driver", "/Users/apple/Downloads/Browser_driver/chromedriver");
		// Create ChromeDrive instance
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");

		
		//Need to add input search text verification
		
		
		//Need to add separate file for title verification
		

		driver.findElement(By.name("q")).sendKeys("What is github");
		
		//some changes done

	}

}
