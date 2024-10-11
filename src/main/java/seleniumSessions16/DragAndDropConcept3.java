package seleniumSessions16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//3.
public class DragAndDropConcept3 {
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
		act.moveToElement(driver.findElement(sourceElement)).clickAndHold().moveToElement(driver.findElement(targetElement)).release().perform();
		//If there is no build() then the perform() will combine all the actions(build it) and execute it all on browser

		
		//only build()	->	No
		//only perform()	->	Yes
		//build() and perform()	->	Yes
		
	}

}
