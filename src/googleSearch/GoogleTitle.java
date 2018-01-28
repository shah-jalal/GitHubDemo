package googleSearch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/apple/Downloads/Browser_driver/chromedriver");
		// Create ChromeDrive instance
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println("Page title: " + title);
	}

}
