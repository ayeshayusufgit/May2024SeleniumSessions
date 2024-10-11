package seleniumSessions19;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//2.
public class BasicAuthPopupHandling3 {
	static WebDriver driver;
	
	//How to check if the Basic Auth Popup is not a JS Popup?
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin:admin@123@the-internet.herokuapp.com/basic_auth");
		//if the username and password is passed with @ is passed, it assumes that the domain
		//name starts after @
		//domain name in this case is taken as 123@the-internet.herokuapp.com/basic_auth
		//This is the limitation of handling Basic Auth popup
		//Always pick a password without an @
		
		Thread.sleep(3000);
		
		Alert alert=driver.switchTo().alert();
		alert.accept();	
		
		//This will result in a NoAlertPresentException
		//Thus concluding that its not a JS Popup
		//If the Basic Auth Popup was a JS Popup then it would have switched to that
		//Hence proved that this is not a JS Popup
		
	}
}
