package seleniumSessions22;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//4.
public class PseudoElementsHandling {
	public static WebDriver driver;
	
	//Any element that is having 
	//::before 
	//::after
	//::has are called pseudo classes/elements
	
	//These elements are there but there is no information about them
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		Thread.sleep(4000);
		
		//The pseudo element is associated with a label, so a label element needs to be created for the below element
		//In this case the element is *First Name, * is associated with ::before which is a pseudo element
		//* is associated with the label First Name
		//Below is the * associated with the label First Name 
		//	<label class="col-sm-2 control-label" for="input-firstname">First Name</label>
		
		//The jsPath associated with the *(pseudo element) of the First Name label:
		// querySelector is used in which the CSS Selector is to be provided for the "First Name" label
		// getComputedStyle() in which the First Name label and the "::before" (pseudo element ie for *) is passed 
		// getPropertyValue("content") which is the value associated with the First Name label is passed
		
		String jsPathForContent="return window.getComputedStyle(document.querySelector('label[for=\"input-firstname\"]'),'::before').getPropertyValue(\"content\")";
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		String content=jse.executeScript(jsPathForContent).toString();
		
		String jsPathForColor="return window.getComputedStyle(document.querySelector('label[for=\"input-firstname\"]'),'::before').getPropertyValue(\"color\")";
		String color=jse.executeScript(jsPathForColor).toString();
		
		String jsPathForFontWt="return window.getComputedStyle(document.querySelector('label[for=\"input-firstname\"]'),'::before').getPropertyValue(\"font-weight\")";
		String fontWt=jse.executeScript(jsPathForFontWt).toString();

		if(content.contains("*")) {
			System.out.println("First Name is mandatory");
		}else {
			System.out.println("First Name is not mandatory");
		}
		
		System.out.println("Content:"+content);
		System.out.println("Color:"+color);
		System.out.println("Font Wt"+fontWt);
		
	}
}
