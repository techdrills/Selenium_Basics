package Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class open_Chrome_Browser {

	public static void main(String[] args) {
		
		// this is setting chrome properties
		System.setProperty("webdriver.chrome.driver", "F://selenium_setup//chromedriver.exe");
		
		// opening chrome browser
		WebDriver driver = new ChromeDriver();
		
		// launching URL in chrome browser
		driver.get("http://www.techdrills.in/staging/examTest");
		
	}

}
