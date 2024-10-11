package seleniumSessions16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//3.
public class ActionsClickSendKeys {
	static WebDriver driver;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		Actions act = new Actions(driver);
		
		//Actions sendKeys() first find the element, moves to the element, clicks on the element and then enters the value.
		//perform() has to be used
		
		act.sendKeys(driver.findElement(By.id("input-firstname")), "naveen").perform();
		
		act.click(driver.findElement(By.name("agree"))).perform();
		
		//with the WE sendKeys() can be performed->it doesn't move to the element but directly performs the sendKeys()
		//with the Actions sendKeys() can be performed->first it moves to the element and then clicks the element and then does sendKeys()
		//The Actions sendKeys() simulates the scenario the way in which the user is using the application
		
		//with the WE click() can be performed->it doesn't move to the element but directly performs the click()
		//with the Actions click() can be performed->first moves to the element and then clicks the element
		
		//Suddenly on opening the application a popup is seen
		//The popup(AI Bot) coming in the page which is overlapping with the registration form elements
		//In that case Selenium can see the element on the page but unable to interact, Selenium gives
		//ElementNotInteractableException because of the popup.
		//normal click() doesnt work in that case.The solution is to use Actions click()
		//internally Actions click() will move to the element and then perform .click() on it
		
		//if the normal sendKeys() doesnt work then use Actions sendKeys()
		//internally goes to the elements and does a sendKeys() on that element
		//In such cases if u are getting the ElementNotInteractableException use the Actions click() or sendKeys()
		
		
		
		//Interview Question:
		//2 ways of entering the value into a text field and also for click()
		//WE.sK()
		//Actions.sK()
		//JS.sK()
		
		//WE.click()
		//Actions.click()
		//JS.click()
		
		
	}

}
