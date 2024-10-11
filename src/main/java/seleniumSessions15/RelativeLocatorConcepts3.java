package seleniumSessions15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;
//This is to statically import the RelativeLocator class, need not write the RelativeLocator.with
//but instead only with can be used.

//5.
public class RelativeLocatorConcepts3 {
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		WebElement emailLabel=driver.findElement(By.xpath("//label[text()='E-Mail Address']"));
		//Base WE1
		
		WebElement pwdLabel=driver.findElement(By.xpath("//label[text()='Password']"));
		//Base WE2
		
		//sendkeys() to in the email TB WE by checking the presence of 2 WEs:
		//1.should be below the emailLabel
		//2.should be above the pwdLabel
		
		driver.findElement(with(By.id("input-email")).below(emailLabel).above(pwdLabel)).sendKeys("naveen@gmail.com");
		
		
		
		
		
	}
}
