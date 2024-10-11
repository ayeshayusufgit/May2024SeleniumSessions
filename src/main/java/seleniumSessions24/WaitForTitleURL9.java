package seleniumSessions24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitleURL9 {
	public static WebDriver driver;

	// Interview Question:

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.get("https://classic.cmpro.com/");

		String title = getPageTitleIs("Free CRM software for customer relationship management, sales, and support.", 5);
		System.out.println(title);

		String partTitle = getPageTitleContains("Free CRM software for customer relationship management", 5);
		System.out.println(partTitle);
	}

	// this method will wait for the complete page title
	public static String getPageTitleIs(String expectedTitle, int timeOut) {
		if (waitForTitleIs(expectedTitle, timeOut)) {
			return driver.getTitle();
		} else {
			return "-1";
		}
	}

	// this method will wait for the part page title
	public static String getPageTitleContains(String partTitle, int timeOut) {
		if (waitForTitleContains(partTitle, timeOut)) {
			return driver.getTitle();
		} else {
			return "-1";
		}
	}

	public static boolean waitForTitleIs(String expectedTitle, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		boolean flag = false;

		try {
			return wait.until(ExpectedConditions.titleIs(expectedTitle));// return true if title is matched
		} catch (TimeoutException ex) {
			System.out.println("Title is not matched");
			return flag;// returns false if the title is not matched
		}
	}

	public static boolean waitForTitleContains(String partTitle, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		boolean flag = false;

		try {
			return wait.until(ExpectedConditions.titleContains(partTitle));// return true if the part title is contained in the title
		} catch (TimeoutException ex) {
			System.out.println("Part Title is not matched");
			return flag;// returns false if the part title is not present in the title
		}
	}
}
