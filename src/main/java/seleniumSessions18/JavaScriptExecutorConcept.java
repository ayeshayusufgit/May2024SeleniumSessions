package seleniumSessions18;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//1.
public class JavaScriptExecutorConcept {
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//The sudo elements or shadow dom elements and other complex elements can be handled through JavaScriptExecutor 
		//Suppose if javascript code has to be executed it can be done using the JavascriptExecutor Interface
		//A js code can be executed using executeScript(JS) method, in which js can be executed on the browser
		//Java-->Js code-->JavaScriptExecutor->executeScript(js)
		//The browser understands only javascript(no python or java etc)
		
		//js code		=>	document.title => gives the title of the page
		//js code		=>	document.URL => gives the url of the page
		
		//If some feature is not available in Selenium then the corresponding
		//javascript code can be written and executed using the JavaScriptExecutor
		//method executeScript
		
		//The JS Code is given to the JavaScriptExecutor method "executeScript() and 
		//the script is executed on the browser
		
		//Java->JS Code->JavascriptExecutor(I)->executeScript(JS)
		
		//JavascriptExecutor Interface has only method declarations like executeScript() etc
		//RemoteWebDriver is implementing the WebDriver,JavaScriptExecutor Interface etc
		//In java we can have n parent interfaces but only 1 parent class.
		//The executeScript() is overridden in the RemoteWebDriver Interface
		
		//Topcasting
		//driver = new ChromeDriver();
		//All the methods coming from WebDriver Interface can be accessed in this type of topcasting
		//The JavascriptExecutor Interface methods(like executeScript()) cannot be accessed in this type of topcasting 
		//due to the reference type check.
		//I want to access the JavascriptExecutor method but wo disturbing the topcasting
		//This can be done by an Interface to Interface casting called Interface Casting
		//The "driver" reference is of type WebDriver which has to be converted into of type JavascriptExecutor
		//The driver will be converted of type JavascriptExecutor(the rhs) and the reference has to be stored in the 
		//lhs of type JavascriptExecutor reference "jse"
		
		//Interface casting:
		JavascriptExecutor jse=(JavascriptExecutor)driver;//There is no changes made to the original driver because of this line
		
		//Now using the reference of "jse" the methods of JavascriptExecutor can be accessed
		//As the reference type check is passed the methods of JavascriptExecutor can be accessed
		
		String title=jse.executeScript("return document.title;").toString();
		//	Any javascript written between double quotes in the executeScript method and executed
		//	return document.title; is a code written in javascript, terminated by a ;
		//	return document.title; code will be executed on the browser
		//  the title of the page ie 'Account Login' will be returned in the form of javascript string.
		//	this needs to be converted into java string by using the toString()
		//	finally the title is stored in the title variable of type String
		
		System.out.println("Title="+title);
		
		String currentPageUrl=jse.executeScript("return document.URL;").toString();
		System.out.println("Page Url="+currentPageUrl);
		
		//jse.executeScript("javascript;").toString();
		//any javascript can be executed from here
		// semicolon is not mandatory but a good practice
		// if something has to be returned then the return javascript keyword has to be used in the script
		
		
		//The current position of the "driver" reference is that it is still pointing to the ChromeDriver object, that is not changed
		//the "driver" reference variable can continue to access all the existing WebDriver methods like
		//quit(),close(),get() etc....
		
		//driver.get("");
		
		//driver.manage().window().maximize();
		//driver.get("https://www.flipkart.com/");
		
		//Interview Question:What are the 2 ways of getting the title of a page?
		//1.driver.getTitle();
		//2.using the JavascriptExecutor ie String title=jse.executeScript("return document.title;").toString();
		
		//Interview Question:What are the 2 ways of getting the current url of a page?
		//driver.getCurrentUrl()
		//2.using the JavascriptExecutor ie String title=jse.executeScript("return document.URL;").toString();
		
		//Interview Question:What are the ways of getting the page title and the page url
		//wo using the driver.title() and driver.getCurrentUrl()?
		//using javascript snippets an execute it using the JSE.executeScript(...);
		
		

	}

}
