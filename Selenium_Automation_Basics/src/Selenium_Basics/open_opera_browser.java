package Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class open_opera_browser {

	public static void main(String[] args) {

		System.setProperty("webdriver.opera.driver", "F://selenium_setup//operadriver.exe");
		
		WebDriver driver = new OperaDriver();
		
		driver.get("htts://airbnb.com");
		
	}

}
