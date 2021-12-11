package Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_page_source {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F://selenium_setup//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://techdrills.in"); 
		
		String pageSource = driver.getPageSource();
		
		System.out.println(pageSource);
	}

}
