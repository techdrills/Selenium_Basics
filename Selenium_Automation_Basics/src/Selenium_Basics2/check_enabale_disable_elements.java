package Selenium_Basics2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class check_enabale_disable_elements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F://selenium_setup//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.techdrills.in/practice.html"); 
		
		driver.findElement(By.id("hide-textbox")).click();
		
		// check element is enable or not
		
		boolean b = driver.findElement(By.id("displayed-text")).isEnabled(); // will check the element is available or not on the web page
		System.out.println(b);
		
		boolean c = driver.findElement(By.id("displayed-text")).isDisplayed(); // will check the element is showing or not on the web page
		System.out.println(c);
		
		driver.findElement(By.id("show-textbox")).click();
		
		boolean b1 = driver.findElement(By.id("displayed-text")).isEnabled();
		System.out.println(b1);
		
		boolean c1 = driver.findElement(By.id("displayed-text")).isDisplayed();
		System.out.println(c1);
		
		
	//	driver.findElement(By.id("displayed-text")).sendKeys("selenium test");
		
	}

}
