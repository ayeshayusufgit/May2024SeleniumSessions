package seleniumSessions24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitleURL4 {
	public static WebDriver driver;

	// Interview Question:

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.get("https://classic.cmpro.com/");
		
		waitForTitle("Naveen", 10);//Wrong PAge title
		
		//waitForTitle("Naveen", 10);//Right Page title

		
	}
	
	
	public static boolean waitForTitle(String expectedTitle,int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		boolean flag = false;
		
		try {
			wait.until(ExpectedConditions.titleIs(expectedTitle));
			//if the title is not matched will give TimeOutException
			flag=true;
			return flag;

		} catch (TimeoutException ex) {
			System.out.println("Title is not matched");
			return flag;//returns false if the title is not matched
		}
	}
}
