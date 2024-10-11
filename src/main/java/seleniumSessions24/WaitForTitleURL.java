package seleniumSessions24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitleURL {
	public static WebDriver driver;
	
	//Interview Question:
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.get("https://classic.cmpro.com/");
		driver.getTitle();
		//Some times when the application is not completely loaded 
		//in that case "loading... or checking... or null" will be returned  
		//never use driver.getTitle() directly
		//The same thing is applicable for driver.getCurrentUrl();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		if(wait.until(ExpectedConditions.titleIs("Free CRM software for customer relationship management, sales, and support."))) {
			System.out.println(driver.getTitle());
		}
		

	}

}
