package seleniumSessions16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

//3.
public class DragAndDropConcept2a {
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
		Action dragNDropAction=	act.moveToElement(driver.findElement(sourceElement))
							.clickAndHold().moveToElement(driver.findElement(targetElement))
								.release()
									.build();
		dragNDropAction.perform();
		
		//build() returns an Action reference variable and can be reused
		//dragNDropAction reference variable can be used later
		
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		dragNDropAction.perform();
	
		
	}

}
