package seleniumSessions23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//3.
public class ExplicitlyWait3 {
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Explicitly Wait:(Wait applied to a specific element whenever I want)
						//WebDriverWait
						//FluentWait
		
		//Wait(Interface) until(method); --implemented--> by the FluentWait(C) until(){} + individual methods(){} --> extends --> WebDriverWait(C) - no methods
	
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By emailId=By.id("input-email111");
		By passwordId=By.id("input-password");
		By loginBtn = By.xpath("//input[@value='Login']");
		
		waitForElementPresence(emailId,10).sendKeys("naveen@gmail.com");
		//This will wait for the element for 10 secs after 10 secs a NSE is thrown
		
		
		getElement(passwordId).sendKeys("test@123");
		getElement(loginBtn).click();
		
		//When a url is hit, first the DOM is loaded and the elements are arranged
		//then the browser will read all the elements of the DOM and will be visible on the page
		
		//if there are 100 elements on the page, will all the elements be visible on the page?
		//Out of 100 not all elements will be displayed, 90 will be displayed 
		
		
		
		}
	
	public static WebElement waitForElementPresence(By locator,int timeOut) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		//presenceOfElementLocated->To check the presence of the element on the DOM of the page
		//This does not necessarily mean that the element is visible on the page
		
		//There is a possibility that the email element is there is the DOM but no visible to the user
		//so in that case the condition will fail
		//There is no guarantee that the element will be visible on the page
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
}
 