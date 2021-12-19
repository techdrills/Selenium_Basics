package Selenium_Basics2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe_handeling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F://selenium_setup//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.techdrills.in/practice.html"); 
		
	//	driver.switchTo().frame(0); // switching on iframe using iframe index
		
		driver.switchTo().frame("courses-iframe"); // switching on iframe using id
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("I want to enter text here");
		
		
		
	}

}
