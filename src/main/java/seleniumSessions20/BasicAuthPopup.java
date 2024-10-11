package seleniumSessions20;

import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//1.
public class BasicAuthPopup {
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

		String username="admin";
		String password="admin";
		
		((HasAuthentication)driver).register(()->new UsernameAndPassword(username, password));
		//The driver has to be converted to HasInterface and used with the .register() by supplying the username and password
		//in the UsernameAndPassword class, that has to be imported and used with register()
		// () is a function with no name called anonymous function
		// This is a new feature added in Selenium 4.x
		
		//Or
		HasAuthentication hs=(HasAuthentication)driver;//Interface to Interface Casting
		hs.register(new UsernameAndPassword(username, password));

	}

}
