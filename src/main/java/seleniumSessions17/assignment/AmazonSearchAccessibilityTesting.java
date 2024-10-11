package seleniumSessions17.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class AmazonSearchAccessibilityTesting {
		static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		WebElement firstName=driver.findElement(By.id("input-firstname"));
		
		Actions act=new Actions(driver);
		
		Action action=act.sendKeys(Keys.TAB)
						 .sendKeys(Keys.TAB)
						 .sendKeys(Keys.TAB)
						 .sendKeys(Keys.TAB)
						 .sendKeys("Macbook Pro")
						 .sendKeys(Keys.ENTER)
						 .build();
		action.perform();
						 
						 
		

	}

}
