package seleniumSessions17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSendKeyWithPause2 {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By firstName=By.id("input-firstname");
		
		doActionsSendkeysWithPause(firstName, "Naveen Automation" , 200);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doActionsSendkeysWithPause(By locator,String value,long pauseTime) {	
		Actions act=new Actions(driver);
		char chArray[]=value.toCharArray();
		
		for(char ch:chArray ) {
			act.sendKeys(getElement(locator), String.valueOf(ch)).pause(pauseTime).perform();		
		}
	}
}
