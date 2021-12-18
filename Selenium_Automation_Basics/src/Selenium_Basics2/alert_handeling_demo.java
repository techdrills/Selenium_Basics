package Selenium_Basics2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_handeling_demo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F://selenium_setup//chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("http://demo.automationtesting.in/Alerts.html");		
		
		// scenario 1 - just click on OK button and get the text
		
		driver.findElement(By.linkText("Alert with OK")).click();
		driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
		
		Thread.sleep(3000);
		// code to handle alerts
		
		String alertMessage = driver.switchTo().alert().getText();  // to get the text of the alert message
		System.out.println(alertMessage);
		driver.switchTo().alert().accept();   // to click on OK button on the alert
		//---------------------------------------------//
		// scenario 2 - just click on Cancel button and get the text
		
		driver.findElement(By.linkText("Alert with OK & Cancel")).click();
		driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
		
		Thread.sleep(3000);
		// code to handle alerts
		
		String alertMessage1 = driver.switchTo().alert().getText();  // to get the text of the alert message
		System.out.println(alertMessage1);
		
		driver.switchTo().alert().dismiss();   // to click on Cancel button on the alert
		
		//---------------------------------------------//
		// scenario 3 - enter the text in alert textbox
		
		driver.findElement(By.linkText("Alert with Textbox")).click();
		driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
		
		Thread.sleep(3000);
		// code to handle alerts
		driver.switchTo().alert().sendKeys("This is from Selenium Text Message");
		
		driver.switchTo().alert().accept();
		
	}

}
