package seleniumSessions24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitleURL8 {
	public static WebDriver driver;

	// Interview Question:

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.get("https://classic.cmpro.com/");
		
		String title=getPageTitle("Naveen", 5);
		System.out.println(title);
		
	}
	
	
	//this method will wait for 5 secs for the title then do the remaining steps after that
	public static String getPageTitle(String expectedTitle,int timeOut) {
		if(waitForTitleIs(expectedTitle, timeOut)) {
			return driver.getTitle();
		}else {
			return "-1";
		}
	}
	
	public static boolean waitForTitleIs(String expectedTitle,int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		boolean flag = false;
		
		try {
			return wait.until(ExpectedConditions.titleIs(expectedTitle));//return true if title is matched
		} catch (TimeoutException ex) {
			System.out.println("Title is not matched");
			return flag;//returns false if the title is not matched
		}
	}
	
	
	public static boolean waitForTitleContains(String partTitle,int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		boolean flag = false;
		
		try {
			return wait.until(ExpectedConditions.titleContains(partTitle));//return true if title is matched
		} catch (TimeoutException ex) {
			System.out.println("Title is not matched");
			return flag;//returns false if the title is not matched
		}
	}
}
