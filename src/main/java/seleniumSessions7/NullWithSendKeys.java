package seleniumSessions7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//2.
//Interview Question
public class NullWithSendKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php/?route=account/login");
		
		//driver.findElement(By.id("input-email")).sendKeys(null);
		//We cannot enter a null value in a textbox gives an Exception
		//IllegalArgumentException: Keys to send should be a not null CharSequence

		
		//driver.findElement(By.id("input-email")).sendKeys();
		//We cannot enter a blank value in a textbox gives an Exception
		//IllegalArgumentException: Keys to send should be a not null CharSequence
		
		//driver.findElement(By.id("input-email")).sendKeys("");
		
//		String name="";
//		//System.out.println(name.length());
//		driver.findElement(By.id("input-email")).sendKeys(name);//ideally it should give an exception, but its not doing so
		
		//Observation:With blank string no exception is thrown but for null an exception is thrown
		
		
		//driver.quit();
	}

}
