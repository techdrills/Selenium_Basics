package Selenium_Basics2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radio_button_handeling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F://selenium_setup//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.techdrills.in/practice.html"); 
		
		driver.findElement(By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[1]/input")).click(); // this will click on male radio button
		driver.findElement(By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[2]/input")).click(); // this will click on female radio button
		driver.findElement(By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[3]/input")).click(); // this will click on other radio button
	}

}
