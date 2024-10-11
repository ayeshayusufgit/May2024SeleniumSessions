package seleniumSessions24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//1.
public class ExplicitWaitWithPollingTime {
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		By emailId = By.id("input-email111");//This element is not found in the Web PAge
		
		//1st overloaded WebDriverWait constructor with default polling time
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//default interval time(polling time) between the requests are  0.5 secs or 500 ms
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(emailId)).sendKeys("naveen@gmail.com");
		
	}
}
