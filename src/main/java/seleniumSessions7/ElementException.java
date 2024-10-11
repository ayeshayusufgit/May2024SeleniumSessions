package seleniumSessions7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//6.
public class ElementException {

	
	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php/?route=account/login");

		//driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");//this will work as the locator is valid
		
		
		//create the webelement + perform the action on the element(sendKeys)
		driver.findElement(By.id("input-email11")).sendKeys("test@gmail.com");//this wont work as the wrong id of the locator is passed
		
		//this will result in the following exception:
		//Exception in thread "main" org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":"#input\-email11"}
		//NoSuchElementException is coming while creating the WebElement
		
	}
}
