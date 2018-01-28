package googleSearch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	public static void main(String[] args) {
		// TODO Google Search Test

		System.setProperty("webdriver.chrome.driver", "/Users/apple/Downloads/Browser_driver/chromedriver");
		// Create ChromeDrive instance
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		//Need to add input search text verification
		
		
		//Need to add separate file for title verification
		
		
		
	}

}
