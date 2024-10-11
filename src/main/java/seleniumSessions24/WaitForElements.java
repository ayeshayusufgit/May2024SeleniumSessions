package seleniumSessions24;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//2.
//To wait for all the elements in the footer of the Login Page
public class WaitForElements {
	public static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		By footerLinks = By.cssSelector("footer a");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//A check will be made if all the elements are visible only then it'll return the list of WebElements
		List<WebElement> footerList=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(footerLinks));
		
		/*
		 * An expectation for checking that all elements present on the web page that match 
		 * the locator are visible. Visibility means that the elements are not only displayed\
		 * but also have a height and width that is greater than 0.
		 */
		
		System.out.println(footerList.size());
	}
}
