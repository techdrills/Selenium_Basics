package Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class open_edge_browser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "F://selenium_setup//msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://techdrills.in");
		
		driver.close(); // to close the browser
		
		
		
		
		
	}

}
