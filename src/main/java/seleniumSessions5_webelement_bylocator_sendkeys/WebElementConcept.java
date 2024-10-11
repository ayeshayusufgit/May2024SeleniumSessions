package seleniumSessions5_webelement_bylocator_sendkeys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//1.
public class WebElementConcept {

	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//https://naveenautomationlabs.com/opencart/index.php/?route=account/login
		//Everything that you see on the page is called the WebElement
		//Button, textfield, radio button, checkbox, dropdown,a link or an image are WebElements
		//We need to start interacting with the WebElement
		//Title, URL is not called a WebElement
		//The back,forward and refresh button is not called a WebElement, they are chrome browser function
		
		//There are 2 methods coming from the SearchContext->findElement n findElements
		//To interact with single element it is findElement
		//To interact with multiple element it is findElements
	
		//The entire element section is the DOM(Document Object Model)
		//The html elements of a page in an application is the DOM
		//Whenever the page is launched the DOM loads first
		
		//Every browser will have its own DOM Apis, the DOM Api will read the entire html DOM and will start placing your elements as per the HTML
		
		//HTML Tag
		//<input type="text" name="email" value="" placeholder="E-Mail Address" id="input-email" class="form-control" fdprocessedid="gzda6m">
		//input is the html tag
		//the following key=value, type="text", name="email" ie "type" or "name" or "value" or "placeholder" etc are the attributes
		
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php/?route=account/login");
		
		//We need todo 2 things
		//We need to create a WebElement(using FE) + perform action on that element(click() or sendKeys() or getText() or check element is displayed ie isDisplayed())
		
		
		//WebElement creation
		//1st approach
		//driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");//The WebDriver will try to find these elements
		//suppose if we want to enter different texts in the same WebElement then the whole line has to be written multiple number of times
		//No reuseability in the code
		//The server will be getting hit
		
		//driver.findElement(By.id("input-password")).sendKeys("test@123");
		
//		driver.findElement(By.id("input-email")).sendKeys("tom@gmail.com");
//		driver.findElement(By.id("input-email")).sendKeys("sunil@gmail.com");
	
		//Cons:
		//Suppose if we are to interact with 50 elements on a page then we need to write driver.findElement(By.id("input-email")) 50 times
		//All the elements are created irrespective of the elements being used or not
		//50 times a request to the server will be sent, which will in turn search for the element in the browser, when only 10 elements are being used
		//The load on the server will be very high
		
		//This approach is not recommended
		
		//2nd approach
		//This approach is better as its more reusable, as only the WebElements can be reused multiple times by just using the WebElement
		//Cons:
		//All the elements are created irrespective of the elements being used or not
//		WebElement email=driver.findElement(By.id("input-email"));
//		WebElement password=driver.findElement(By.id("input-password"));
//		
//		email.sendKeys("test@gmail.com");
//		password.sendKeys("test@123");
		
		//email.sendKeys("tom@gmail.com");
		//email.sendKeys("tom@gmail.com");
		
		//3rd approach, is the By locator approach
		//Here we are maintaining 50 By locators but we are not hitting the server(as there are no drivers)
		//The client will be sending a request to the server when driver is written
		//So even if 50 By locators are maintained there wont be any load on the server
		
		//Cons:
		//6 lines of code are written in the 3rd approach, 4 lines in the 2nd and 2 lines in the 1st approach
		//THe number of lines of code are getting increased, actually the number of lines should decrease
		
//		By emailId=By.id("input-email");
//		By passwordId=By.id("input-password");
//		
//		WebElement emailElement=driver.findElement(emailId);
//		WebElement passwordElement=driver.findElement(passwordId);
//		
//		emailElement.sendKeys("tom@gmail.com");
//		passwordElement.sendKeys("tom@123");
		
		//4th approach By locator + generic method
		//Pros:
		//50 By locators are created the server is not hit, only when the elements are to be used the server is hit
		//Code is reusable, less load on the server
		//Better maintainence of code
		
		//Cons:
		//sendKeys() keeps getting repeated
//		By emailId=By.id("input-email");
//		By passwordId=By.id("input-password");
//		
//		getElement(emailId).sendKeys("tom@gmail.com");
//		getElement(passwordId).sendKeys("tom@123");
//		
		
		//5th approach By locator + generic method for WebElement and action
		//Pros:
		//the code is drastically reduced, not required to write lengthy code, just need to maintain the By locators and call the methods
		//These functions can be used in all the applications
		//sendKeys() have been written only once and can be reused n number of times 
//		By emailId=By.id("input-email");
//		By passwordId=By.id("input-password");
//		
//		doSendKeys(emailId, "tom@gmail.com");
//		doSendKeys(passwordId, "tom@123");
		
		//6. By locator + generic method for WebElement in ElementUtil class
		//This is the best approach as only the Utils are being used
		//THis approach can be used in all applications
		//In this approach since it is generic as it can be used in every application
		By emailId=By.id("input-email");
		By passwordId=By.id("input-password");
		
		ElementUtil eUtil=new ElementUtil(driver);
		eUtil.doSendKeys(emailId, "test@gmail.com");
		eUtil.doSendKeys(passwordId, "test@123");
		
	}
	
	//A selenium wrapper is created  
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator,String value) {
		getElement(locator).sendKeys(value);
	}

}
