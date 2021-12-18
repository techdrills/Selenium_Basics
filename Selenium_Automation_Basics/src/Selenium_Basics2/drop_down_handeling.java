package Selenium_Basics2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drop_down_handeling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F://selenium_setup//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.techdrills.in/practice.html"); 
		
		//Scenario 1 -  using sendkeys select value from drop down
		
		driver.findElement(By.id("dropdown-class-example")).sendKeys("HP UFT");
	
		
		// Scenario 2 - using Select class select value drop down 
		
		Select select = new Select(driver.findElement(By.id("dropdown-class-example")));
		select.selectByValue("Selenium-att"); // Approach 1 - select by value
		select.selectByVisibleText("HP UFT"); // Approach 2 - select by visible text
		select.selectByIndex(2); // Approach 3 - select by index
		
		
		
	}

}
