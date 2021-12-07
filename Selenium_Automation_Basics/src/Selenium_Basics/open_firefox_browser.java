package Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class open_firefox_browser {

	public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver", "F://selenium_setup//geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://techdrills.in");
		
		//driver.close(); // to close the browser
	}

}
