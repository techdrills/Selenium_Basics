package Selenium_Basics2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switch_to_new_tab {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F://selenium_setup//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.techdrills.in/staging/examTest/"); 
		
		// login code		
		driver.findElement(By.linkText("Signin")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("testuser@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Pass@123");
		driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/button[2]")).click();
		
		// code to get the current window/tab id
		String parentWindow = driver.getWindowHandle();
		System.out.println("Original Window is "+ parentWindow);
		
		driver.findElement(By.linkText("Feedback")).click();
		
		// code to get all window id's
		
		Set <String> allWindows = driver.getWindowHandles();
		int windowSize = allWindows.size();
		System.out.println("All windows/tab is "+ windowSize);
		
		for(String childWindow : allWindows) {
			System.out.println("Child window is "+ childWindow);
			
			if(!parentWindow.equalsIgnoreCase(childWindow)) {
				driver.switchTo().window(childWindow);
				System.out.println(driver.getCurrentUrl());
				driver.findElement(By.id("name")).sendKeys("feedback name");
				driver.findElement(By.name("subject")).sendKeys("This is Subject by Selenium");
				//driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("testuser@gmail.com");
				driver.findElement(By.name("feedback")).sendKeys("This a feedback related auotmation testing using selenium and java");
				driver.findElement(By.name("submit")).click();
				
			}
			
		}
		
		
		
	}

}
