package Selenium_Basics2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class enter_text_in_textbox_2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F://selenium_setup//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.techdrills.in/contact.php"); 
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("u-firstname")).sendKeys("Albert");
		driver.findElement(By.name("u-lastname")).sendKeys("Piolute");
		driver.findElement(By.name("u-number")).sendKeys("9898989898");
		driver.findElement(By.name("u-subject")).sendKeys("this is subject");
		driver.findElement(By.name("u-email")).sendKeys("ablert@gmail.com");
		driver.findElement(By.name("u-message")).sendKeys("this is where i can send you my message....");
		
	}
}
