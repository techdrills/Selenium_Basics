package Selenium_Basics2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_student_quiz_details {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F://selenium_setup//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.techdrills.in/staging/examTest/"); 
		
		// login code
		
		driver.findElement(By.linkText("Signin")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("sdfsdfds");
		driver.findElement(By.id("email")).sendKeys("testuser@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Pass@123");
		driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/button[2]")).click();
		
		

		List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
		int count = rows.size();
		System.out.println("ROW COUNT : "+count);
		int testAttended = 0; // this variable will be usefull for getting the count attended tests

		for (int row = 1; row <= count; row ++) { // traversing by rows
			for(int col = 1; col <=6; col ++) { // traversing by columns
				
				String baseXpath = "/html/body/div[2]/div/div/div/div/div/table/tbody/tr[";
				String rowXpath = "]/td[";
				String colXpath = "]";
						
			String colValue = driver.findElement(By.xpath(baseXpath + row + rowXpath + col + colXpath)).getText();
				System.out.print(colValue + " | ");  // this code ->  + " | " is only for good formating
				
				// this code for check how many tests has been attended
				if(colValue.contains("Restart")) {
					testAttended++;
				}
			}
			
			System.out.println();  // this is only for good formating, you can remove this line
		}
		
		int allTestCount = count - 1;  // -1 meaning ingnored first row coz that is heading
		System.out.println("Total Tests Available = "+ allTestCount);
		System.out.println("Total Tests Attended = "+ testAttended);
		System.out.println("Tests not Attended yet = "+ (allTestCount - testAttended));
		
		// code to close browser
		Thread.sleep(2000);
		driver.close();
	}

}
