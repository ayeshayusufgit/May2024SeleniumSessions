package seleniumSessions19;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//2.
public class BasicAuthPopupHandling4 {
	static WebDriver driver;
	
	//How to check if the Basic Auth Popup is not a JS Popup?
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String username="admin";
		String password="admin";
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");
		
		//There are 2 issues with this:
		//The username n password is exposed to the user
		//username n password with @ cannot be used(the url cannot have 2 @)
		
		//Selenium 4.x this new feature added which is the HasAuthenticated Interface which 
		//is applied in which the @ problem is solved(This will be covered later)
		
		//This approach wont work in the login forms, this works only in the Basic Auth Popups
		
		//AutoIt/Sikuli/Robot class:works only on windows
		//In Linux/MAC/Headless/Cloud/Grid/AWS/CI-CD/Jenkins it doesnt work
		
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ESCAPE).perform();
		
		//Recaptcha cannot be automated
		//Captcha/Recaptcha this has to be disabled in the dev/qa/stage env(this this wont be seen)
		
		
		
	}
}
