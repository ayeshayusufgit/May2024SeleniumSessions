package seleniumSessions24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitleURL2 {
	public static WebDriver driver;
	
	//Interview Question:
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.get("https://classic.cmpro.com/");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//This fails as the title is wrong, results in TimeOutException 
		if(wait.until(ExpectedConditions.titleIs("Free CRM software for customer relationship management, sales"))) {
			System.out.println(driver.getTitle());
		}	else {
			System.out.println("Title is not matched");
		}
	}
}
