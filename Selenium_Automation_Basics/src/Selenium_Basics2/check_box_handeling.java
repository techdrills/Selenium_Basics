package Selenium_Basics2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class check_box_handeling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F://selenium_setup//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.techdrills.in/practice.html"); 
		
		driver.findElement(By.id("checkBoxpython")).click();
		driver.findElement(By.id("checkBoxjava")).click();
		driver.findElement(By.id("checkBoxkotlin")).click();
		
		driver.findElement(By.id("checkBoxjava")).click();
		
	}

}
