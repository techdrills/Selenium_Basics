package Selenium_Basics2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exam_test_registration {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F://selenium_setup//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.techdrills.in/staging/examTest/"); 
		
		// use of findElement method and send the data into text boxes
		driver.findElement(By.id("namer")).clear();  // TO CLEAR THE TEXT BOX clear METHOD
		
		driver.findElement(By.id("namer")).sendKeys("Test Selenium User");
		driver.findElement(By.id("colleger")).sendKeys("Selenium University");
		driver.findElement(By.id("gender")).sendKeys("Male");
		driver.findElement(By.id("emailr")).sendKeys("testuser@gmail.com");
		driver.findElement(By.id("mobr")).sendKeys("9191919191");
		driver.findElement(By.id("passwordr")).sendKeys("Pass@123");
		driver.findElement(By.id("cpasswordr")).sendKeys("Pass@123");
		
		Thread.sleep(3000);		
		
	//	driver.findElement(By.id("signupbtb")).click(); // click method will click on the web element
		
	}

}
