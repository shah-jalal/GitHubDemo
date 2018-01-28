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
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("GitHub");
		String searchText = element.getAttribute("value");
		System.out.println(searchText);
		
		//Search input verification
		if(searchText.equals("GitHub")) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
		driver.quit();
		
		
		
	}

}
