package seleniumSessions17;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

//4.
public class ActionsMethodChainingRegisterPage {
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		WebElement firstName=driver.findElement(By.id("input-firstname"));
		
		Actions act=new Actions(driver);
		
		Action action=act.sendKeys(firstName, "Firstname")
		   .sendKeys(Keys.TAB)
		   .sendKeys("Lastname")
		   .pause(2000)
		   .sendKeys(Keys.TAB)
		   .sendKeys("test@gmail1.com")
		   .pause(2000)
		   .sendKeys(Keys.TAB)
		   .sendKeys("9999999999")
		   .pause(2000)
		   .sendKeys(Keys.TAB)
		   .sendKeys("test123")
		   .pause(2000)
		   .sendKeys(Keys.TAB)
		   .sendKeys("test123")
		   .pause(2000)
		   .sendKeys(Keys.TAB)
		   .pause(2000)
		   .sendKeys(Keys.TAB)
		   .pause(2000)
		   .sendKeys(Keys.TAB)
		   .pause(2000)
		   .sendKeys(Keys.SPACE)
		   .pause(2000)
		   .sendKeys(Keys.TAB)
		   .pause(2000)
		   .sendKeys(Keys.ENTER)// to register 
		   .build();
		
		   action.perform();
		
	}
}
