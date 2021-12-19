package Selenium_Basics2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_hover_actions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F://selenium_setup//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.techdrills.in/practice.html"); 
		
		Actions act = new Actions(driver);
		// move the mouse on link text example link
		act.moveToElement(driver.findElement(By.partialLinkText("TechDrills was established by team of"))).build().perform();
		
		Thread.sleep(2000);
		
		// move the mouse on mouse hover button
		act.moveToElement(driver.findElement(By.id("mousehover"))).build().perform();
	
		//act.contextClick().build().perform(); // this method will be help ful for mouse right click
		
		act.contextClick(driver.findElement(By.partialLinkText("industry requirement and learning"))).build().perform();
		
		
		//driver.findElement(By.linkText("Reload")).click();
		
		
	
	
		
		
		
		
		

	}

}
