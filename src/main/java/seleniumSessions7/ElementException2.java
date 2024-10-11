package seleniumSessions7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//6.
public class ElementException2 {

	
	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php/?route=account/login");

		//driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");//this will work as the locator is valid
		
		
		//create the webelement + perform the action on the element(sendKeys)
		WebElement element=driver.findElement(By.id("input-email11"));
		//Exception will be thrown in this line during the creation of the WebElement
		
		element.sendKeys("test@gmail.com");
		
		
	}
}
