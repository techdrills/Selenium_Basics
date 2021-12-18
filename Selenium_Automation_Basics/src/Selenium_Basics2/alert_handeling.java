package Selenium_Basics2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_handeling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F://selenium_setup//chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("http://www.techdrills.in/staging/examTest/");		
		driver.findElement(By.id("signupbtb")).click();
		
		Thread.sleep(3000);
		// code to handle alerts
		
		String alertMessage = driver.switchTo().alert().getText();  // to get the text of the alert message
		System.out.println(alertMessage);
		
		driver.switchTo().alert().accept();   // to click on OK button on the alert
		
		
		
		
	}

}
