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
public class WaitForElements2 {
	public static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		By footerLinks = By.cssSelector("footer a");
		
		System.out.println(waitForElementsVisible(footerLinks,10).size());
	}
	
	
	/*
	 * An expectation for checking that all elements present on the web page that match 
	 * the locator are visible. Visibility means that the elements are not only displayed\
	 * but also have a height and width that is greater than 0.
	 */
	public static List<WebElement> waitForElementsVisible(By locator,int timeOut){
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	
	//What are the different ways of returning WEs?
	//1.findElements
	//2.WebDriverWait
	//3.
	
	
	//What is the difference between presence of element and presence of All Elements present?
	//1.presenceOfElement means the presence of element in the DOM, may or may not be there on the Web Page.
	//2.presenceOfAllElements means the presence of 1 element on the Web Page, if yes then it'll return the full List<WE>.
}
