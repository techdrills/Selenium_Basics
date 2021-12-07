package Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browser_get_title_of_tab {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F://selenium_setup//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://techdrills.in"); 
		
		String title = driver.getTitle();
		System.out.println(title);
		
	}

}
