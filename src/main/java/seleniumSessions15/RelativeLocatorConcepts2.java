package seleniumSessions15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;
//This is to statically import the RelativeLocator class, need not write the RelativeLocator.with
//but instead only with can be used.

//4.
public class RelativeLocatorConcepts2 {
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		WebElement label=driver.findElement(By.xpath("//label[text()='E-Mail Address']"));
		//Base Element
		
		//sendkeys() to a WE with id(mentioned) below the label WE 
		driver.findElement(with(By.id("input-email")).below(label)).sendKeys("naveen@gmail.com");
		
		
		
		
	}
}
