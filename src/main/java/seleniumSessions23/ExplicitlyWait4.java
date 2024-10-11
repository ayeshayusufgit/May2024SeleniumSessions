package seleniumSessions23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//3.
public class ExplicitlyWait4 {
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Explicitly Wait:(Wait applied to a specific element whenever I want)
						//WebDriverWait
						//FluentWait
		
		//Wait(Interface) until(method); --implemented--> by the FluentWait(C) until(){} + individual methods(){} --> extends --> WebDriverWait(C) - no methods
	
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By emailId=By.id("input-email");
		By passwordId=By.id("input-password");
		By loginBtn = By.xpath("//input[@value='Login']");
		
		//waitForElementPresence(emailId,10).sendKeys("naveen@gmail.com");
		
		waitForElementVisible(emailId,10).sendKeys("naveen@gmail.com");
		getElement(passwordId).sendKeys("test@123");
		getElement(loginBtn).click();
		
		//implicitly and explicitly wait cannot be used together
		
		
		}
	
	/**
	 * An expectation for checking that an element is present on the DOM of a page.
	 *  This does not necessarily mean that the element is visible on the page.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public static WebElement waitForElementPresence(By locator,int timeOut) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		//presenceOfElementLocated->To check the presence of the element on the DOM of the page
		//This does not necessarily mean that the element is visible on the page
	}
	
	/**
	 * An expectation for checking that an element is present on the DOM of a page and visible on the page as well. 
	 * Visibility means that the element is not only displayed but also has a height and width that is greater than 0.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public static WebElement waitForElementVisible(By locator,int timeOut) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	
		//visibilityOfElementLocated->To check that an element is present on the DOM of a page and visible.
		//Visibility means that the element is not only displayed but also has a height and width that is greater than 0.
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
}
 