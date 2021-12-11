package Selenium_Basics2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enter_text_in_text_box {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F://selenium_setup//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.techdrills.in/staging/examTest/"); 
		
		Thread.sleep(3000);
		driver.findElement(By.id("name")).sendKeys("Albert Julio Piloute"); // this will enter a name
		driver.findElement(By.id("college")).sendKeys("Sent frasisco Ebuntutu College"); // this will enter a college name
		driver.findElement(By.id("emailr")).sendKeys("email..");	
	driver.findElement(By.id("signupbtb")).click();
	
	
	}

}
