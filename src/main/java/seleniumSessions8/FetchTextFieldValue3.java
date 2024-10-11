package seleniumSessions8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//6
public class FetchTextFieldValue3 {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://thinking-tester-contact-list.herokuapp.com/");
		
//		driver.findElement(By.id("email")).sendKeys("naveen@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("naveen@123");
//		
//		String email=driver.findElement(By.id("email")).getAttribute("value");
//		String password=driver.findElement(By.id("password")).getAttribute("value");
		
		By emailId=By.id("email");
		By passwordId=By.id("password");
		By hereLink=By.linkText("here");
		
		doSendKeys(emailId,"naveen@gmail.com");
		doSendKeys(passwordId,"naveen@123");
		
		String emailValue=doElementGetAttribute(emailId, "value");
		String passwordValue=doElementGetAttribute(passwordId, "value");
		
		System.out.println("Email Entered:"+emailValue);
		System.out.println("Password Entered:"+passwordValue);
		
		//To fetch the placeholder attribute
		String passwordPlaceholder=doElementGetAttribute(passwordId,"placeholder");
		System.out.println(passwordPlaceholder);
		
		String hrefValue=doElementGetAttribute(hereLink, "href");
		System.out.println(hrefValue);
		
		//Whatever attributes are available can be fetched by getAttribute()
		
		driver.quit();
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator,String value) {
		getElement(locator).sendKeys(value);
	}
	
	public static String doElementGetAttribute(By locator,String attributeName) {
		return getElement(locator).getAttribute(attributeName);
	}
}
