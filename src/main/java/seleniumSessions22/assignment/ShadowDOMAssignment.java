package seleniumSessions22.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMAssignment {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		driver.manage().window().maximize();
		
		Thread.sleep(8000);
		
		int count=driver.findElements(By.tagName("iframe")).size();
		System.out.println(count);
		
		//Hierachy of shadow DOM Elements in the Page:
		//Browser-->Page-->IFrame-->Shadow DOM-->input#pizza
		
		//driver.switchTo().frame("pact1");
		String jsPath="return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")";
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		WebElement pizzaElement=(WebElement)jse.executeScript(jsPath);
		pizzaElement.sendKeys("Supremo Pizza");
		
	}

}
