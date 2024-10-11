package seleniumSessions17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSendKeyWithPause {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By firstName=By.id("input-firstname");
		WebElement firstNameEle=driver.findElement(firstName);
		
		Actions act=new Actions(driver);
		String myName="Naveen Automation";
		char chArray[]=myName.toCharArray();
		
		
		for(char ch:chArray ) {
			//Actions sendKeys takes 2 parameters of type WebElement and CharSequence
			//CharSequence is an interface which is a parent of class String,StringBuffer and StringBuilder
			act.sendKeys(firstNameEle, String.valueOf(ch)).pause(200).perform();//Accessibility Testing
			
			//String.valueOf(ch);	=>	converts the character to a String
		}
	}
}
