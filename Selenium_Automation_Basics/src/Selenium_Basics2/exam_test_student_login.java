package Selenium_Basics2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class exam_test_student_login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F://selenium_setup//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.techdrills.in/staging/examTest/"); 
		
		
		// get current url before login
		
		String beforeLoginURL = driver.getCurrentUrl();
		System.out.println("URL before Login " + beforeLoginURL);
		
		// login code
		
		driver.findElement(By.linkText("Signin")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("sdfsdfds");
		driver.findElement(By.id("email")).sendKeys("testuser@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Pass@123");
		driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/button[2]")).click();
		
		// get current url after login
		
		String afterLoginURL = driver.getCurrentUrl();
		System.out.println("URL after Login " + afterLoginURL);
		
		if(afterLoginURL.contains("account.php?q=1")) {
			System.out.println("Login Test Cases is Passed........");
		}
		else {
			System.out.println("Login Test Case is Failed.......");
		}
		//driver.close();
		
		List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
		int count = rows.size();
		System.out.println("ROW COUNT : "+count);
		
		
	}

}
