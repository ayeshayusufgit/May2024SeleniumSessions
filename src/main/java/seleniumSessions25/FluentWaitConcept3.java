package seleniumSessions25;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

//4.
public class FluentWaitConcept3 {
	public static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Wait(I){until();}->FluentWait(C){until(){} + other individual methods}
								//-->WebDriverWait(C):has no methods
		//Wait is an Interface having an abstract method "until" => level 1
		//Wait is implemented by the FluentWait class
		//FluentWait class is implementing the until method along with its individual methods => level 2 
		//WebDriverWait class is extending the FluentWait class
		//WebDriverWait is inheriting all the methods of its parent ie FluentWait
		//WebDriverWait class has no methods of its own => level 3
		
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		driver.manage().window().maximize();
		
		By firstName = By.id("Form_getForm_Name");
	
		//Which is better FluentWait or WebDriverWait?

//		1.FluentWait(topcasting with FluentWait or creating object of WebDriverWait)		
//		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
//									.withTimeout(Duration.ofSeconds(10))
//									.pollingEvery(Duration.ofSeconds(2))
//									.ignoring(NoSuchElementException.class)
//									.withMessage("========Element is not found=========:"+firstName);
//				 
//		wait.until(ExpectedConditions.visibilityOfElementLocated(firstName)).sendKeys("Naveen");

		
//		2.WebDriverWait with FluentWait features:
//		WebDriverWait has all the features of FluentWait
		
		//Both are exactly the same
		
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		//	wait.pollingEvery(Duration.ofSeconds(2))
		//		.ignoring(NoSuchElementException.class)
		//		.ignoring(StaleElementReferenceException.class)
		//		.ignoring(ElementNotInteractableException.class)
		//upto 10 secs all these Exceptions will be ignored
		//if the element is still not found after 10 secs results in TimeOutException
		
		//along with the below message:		
		//		.withMessage("==================Element is not found=============:"+firstName);
		
		//These are FluentWait features.
		//wait.until(ExpectedConditions.visibilityOfElementLocated(firstName));	

//		3.
		Wait wait=new FluentWait<WebDriver>(driver);
		//In this combination only the until method coming from the Wait Interface, is overridden in the FluentWait Class
		//the reference type check will pass thus until method can be accessed using wait reference
		//The other methods which are apart of FluentWait class cannot be accessed with wait as the
		//reference as the reference type check will fail
		//Thus withTimeout, pollingEvery, ignoring and withMessage methods cannot be accessed with wait reference
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(firstName));	
	}
	
//		2.WebDriverWait without fluent wait features:
		public static List<WebElement> waitForElementsVisible(By locator, int timeOut) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
			return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		}
	
//		
//Which is the best approach?
//1. or 2. or 3. ?
		
}
