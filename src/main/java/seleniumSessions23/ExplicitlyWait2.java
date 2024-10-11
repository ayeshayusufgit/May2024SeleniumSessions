package seleniumSessions23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//3.
public class ExplicitlyWait2 {
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
		
		waitForElementPresence(emailId,10).sendKeys("naveen@gmail.com");
		getElement(passwordId).sendKeys("test@123");
		getElement(loginBtn).click();
		
		//Explicit wait is preferred
		//In EW there is a flexibility where we can apply the wait for specific elements only
		//In IW  there is no flexibility, once its applied it applied to all the elements 
	}
	
	public static WebElement waitForElementPresence(By locator,int timeOut) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
}
 