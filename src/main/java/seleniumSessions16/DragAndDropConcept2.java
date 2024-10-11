package seleniumSessions16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

//3.
public class DragAndDropConcept2 {
	static WebDriver driver;
	
	//Only WebElement to WebElement drag and drop is supported here.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		//drag and drop
		//element to element
		
		By sourceElement = By.id("draggable");
		By targetElement = By.id("droppable");

		//a1.a2.a3 --> build.perform
		Actions act = new Actions(driver);
				act.moveToElement(driver.findElement(sourceElement))
						.clickAndHold().moveToElement(driver.findElement(targetElement))
							.release()
								.build();
		
		//If there is no perform() the combined actions wont be performed on the browser
		
		//Difference between Actions and Action
		//Actions is a class whereas Action is an interface
		
		//Actions class provided methods for mouse and keyboard related functions
		//Action represents a single user interaction interface
		
		//build() returns an Action reference variable
				
		//==============================================================================
		//all the methods from the Actions class is returns of type Actions
		//since all the methods returns of type Actions its a builder pattern
		//till the release() the builder pattern is applied
		//build() returns of type Action
		//perform() returns of type void
		//==============================================================================
		//Actions=> is a class=>is used to achieve the builder pattern using method chaining to perform various actions in a sequence
		//Action=>is an interface=>build() will return Action(single or composite) which can used later to perform
				
		
	}

}
