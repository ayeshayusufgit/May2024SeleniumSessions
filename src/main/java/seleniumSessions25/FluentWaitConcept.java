package seleniumSessions25;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

//4.
public class FluentWaitConcept {
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
		By firstName = By.id("Form_getForm_Name");
		
		//Wait with FluentWait features:
		//(timeout,polling,ignoring exceptions and custom message on failure of not finding element)
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
									.withTimeout(Duration.ofSeconds(10))
									.pollingEvery(Duration.ofSeconds(2))
									.ignoring(NoSuchElementException.class)
				  //Upto 10 secs if getting NoSuchElementException to ignore it
									.withMessage("========Element is not found=========");
				  //This is a custom message will be displayed only after 10 secs once the time out is over
				  //and the element is not found
		
		//the until() can be accessed as wait of type Wait is referring to the object of the child implementing class FluentWait
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(firstName)).sendKeys("Naveen");
		
									
									

									
		
	}
}
