package seleniumSessions19;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//2.
public class BasicAuthPopupHandling2 {
	static WebDriver driver;
	
	//How to check if the Basic Auth Popup is not a JS Popup?
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		Thread.sleep(3000);
		
		Alert alert=driver.switchTo().alert();
		alert.accept();	
		
		//This will result in a NoAlertPresentException
		//Thus concluding that its not a JS Popup
		//If the Basic Auth Popup was a JS Popup then it would have switched to that
		//Hence proved that this is not a JS Popup
		
	}
}
