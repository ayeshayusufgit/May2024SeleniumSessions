package seleniumSessions4_quitVsclose_navMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.net.*;

public class NavigationMethods4 {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub
		
		//The only difference between get(url) and to(url)
		//get() takes in only a String parameter whereas to() is overloaded and takes String and URL type parameter(as below)
		
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://www.google.com");
		
		driver.navigate().refresh();
		//the dom is reloaded resulting in a StaleElementReferenceException
		

		
		
		
		
	}

}
