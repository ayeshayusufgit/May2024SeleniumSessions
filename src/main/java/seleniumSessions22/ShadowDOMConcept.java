package seleniumSessions22;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//3.
public class ShadowDOMConcept {
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		Thread.sleep(4000);
		
		//shadow root are very light containers on the webpage
		//this provides an extra layer of element security on the page
		//shadow-root elements can be used by the developers, used only 2 out of 100 times
		//shadow-root element has its own DOM, just like how iFrame has its own DOM
		//you need to check which shadow root is associated with which element/html tag
		//the shadown dom element should always start with #shadow-root (open) state if not
		//then it cant be automated #shadow-root (closed)
		
		//		//input[@id='pizza']	-- not working
		//		input#pizza		--	wont work
		
		
		//Hierarchy of the Shadow root elements
		// browser->Main Page->Shadow DOM element->Shadow DOM element->input#pizza
		//					 2 Shadow DOM elements are there before the input#pizza element
		
		//	Steps to get the Shadow DOM Element:
		//  Inspect the element by right clicking on it.
		//	Element->Goto <input type="text" id="pizza" placeholder="Enter pizza name"> element
		//  Right click on the element->Copy Element->Copy JS Path(Below)
		//	document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")"
		//	Clear the Console, on pasting this on the Console, returns the above Shadow DOM Element
		
		//The jsPath has to be copied from the inspector tool and pasted below with return:
		String jsPath="return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")";
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		
		//Since on executing the jsPath in Console the HTML element is returned 
		//<input type="text" id="pizza" placeholder="Enter pizza name">
		//Selenium doesn't understand HTML elements
		//Whatever HTML Element is coming it has to be converted into a WebElement
		//As Selenium understands a WebElement
		
		WebElement pizzaElement=(WebElement)jse.executeScript(jsPath);
		//returns HTML element which has to be converted into WebElement
		
		//Since the pizzaElement is created so can be used as below:
		pizzaElement.sendKeys("Veg Pizza");
		
		//driver.findElement(By.id("pizza")).sendKeys("Veg Pizza");
		//Can be converted(as above) 
		
		
		//Shadow DOM Elements with Selenium:
		//Xpath is not supported
		//Only CSS Elements with JSPath is supported
		
		//SVG Element:uses a special xpath(normal xpath won't work)
		//Parent SVG->local-name()='svg'
		//Child SVG(g or path)->local-name()='svg' or name()='svg'
		
		
		//If an application is full of Shadow DOM Elements, is Selenium a good choice?
		//Its not a good choice
		
		//For example if your having 10 diff textfields in the Registration Page
		//(And all the elements are of type shadow DOM)
		//JSPath has to be created for all the 10 elements
		//Converted into WebElement and used
		//But this has to be done for all the 10 shadow dom elements
		//The normal way used in Selenium wont work
		
		
		
		//Playwright tool launches the tool
		//A check is made that if an element lies within the Shadow DOM element
		//Automatically it finds the Shadow DOM element, as an automation engineer
		//the jsPAth need not be written
		//Just need to open the browser->open the page->if an element is in the shadow dom ->Do an autopiercing and use .sendkeys or click on the element
		
		
	}

}
