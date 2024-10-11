package seleniumSessions23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//3.
public class ExplicitlyWait {
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
		
		//The explicit wait will be applied only to emailId because if emailId is available
		//then the password and loginButton also will be available.
		//Explicit wait need not be applied on the password n loginBtn
		
		
		//There are 3 options in the usage of WebDriverWait
		//1.WebDriverWait wait=new WebDriverWait(WebDriver driver,Duration timeOut);
		//2.WebDriverWait wait=new WebDriverWait(WebDriver driver,Duration timeOut,Duration sleep);
		//3.WebDriverWait wait=new WebDriverWait(WebDriver driver,Duration timeOut,Duration sleep,Clock clock,Sleeper sleeper);
		
		//1.
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement emailEle=wait.until(ExpectedConditions.presenceOfElementLocated(emailId));
		//if the element is found within 10 secs, it returns the WebElement
		
		emailEle.sendKeys("naveen@gmail.com");
		//once the emailEle is found then enter the above text on it.
		
		//Explicit wait not required for the other login page elements as all of them
		//are there already on the page
		driver.findElement(passwordId).sendKeys("test@123");
		driver.findElement(loginBtn).click();
	}
	
	public static WebElement waitForElementPresence(By locator,int timeOut) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
}
 