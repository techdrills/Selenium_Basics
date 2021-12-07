package Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_browser_current_url {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F://selenium_setup//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com"); 
		
		String url = driver.getCurrentUrl();
		System.out.print(url);
	
	}

}
