package seleniumSessions24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitleURL3 {
	public static WebDriver driver;

	// Interview Question:

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.get("https://classic.cmpro.com/");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		boolean flag = false;
		try {
			//The title will be checked for 10 secs, if found within 10 secs executes the next statement
			//ow throws TimeOutException
			
			flag = wait
					.until(ExpectedConditions.titleIs("Free CRM software for customer relationship management, sales"));
			flag = true;

		} catch (TimeoutException ex) {
			System.out.println("Title is not matched");
		}

		if (flag) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
	}

}
