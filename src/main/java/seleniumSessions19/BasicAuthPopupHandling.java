package seleniumSessions19;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//2.
public class BasicAuthPopupHandling {
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		//The username and password will have to be supplied with the auth url
		
		//The basic auth popup will not come as it will be handled automatically
		//The login with automatically wo showing the Basic Auth Popup
		
		//After logging in the username and password is not seen in the url, 
		//thus its not exposing the username and password
		
		//Auth Popups are not JS Alerts
		//We can never switch on the Auth Popup
		
		
		//Limitation
		

	}

}
