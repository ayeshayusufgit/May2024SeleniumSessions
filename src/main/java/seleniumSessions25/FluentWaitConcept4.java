package seleniumSessions25;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

//4.
public class FluentWaitConcept4 {
	public static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Wait(I){until();}->FluentWait(C){until(){} + other individual methods}
								//-->WebDriverWait(C):has no methods
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		driver.manage().window().maximize();
		
		By firstName = By.id("Form_getForm_Name");
	
		//1.FluentWait(topcasting with FluentWait or creating object of WebDriverWait)
		//Wait behavior created once an can be used multiple times
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
									.withTimeout(Duration.ofSeconds(10))
									.pollingEvery(Duration.ofSeconds(2))
									.ignoring(NoSuchElementException.class)
									.withMessage("========Element is not found=========:"+firstName);
				 
		wait.until(ExpectedConditions.visibilityOfElementLocated(firstName)).sendKeys("Naveen");
		wait.until(ExpectedConditions.visibilityOfElementLocated(firstName)).sendKeys("Naveen");
		wait.until(ExpectedConditions.visibilityOfElementLocated(firstName)).sendKeys("Naveen");
		wait.until(ExpectedConditions.visibilityOfElementLocated(firstName)).sendKeys("Naveen");
		wait.until(ExpectedConditions.visibilityOfElementLocated(firstName)).sendKeys("Naveen");
		
		//The FluentWait behavior can be defined once and can be used with until method any no of times
		//(not required to create the wait behavior again an again) 
											
		
		
		//driver.switchTo().newWindow(WindowType.WINDOW).switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.google.com");
		driver.switchTo().newWindow(WindowType.TAB);
		//moving back to the parent window and opening a new tab in the parent window(orange hrm)
		driver.get("https://www.yahoo.com");//yahoo.com tab is opened in the parent window
		
	}		
}
