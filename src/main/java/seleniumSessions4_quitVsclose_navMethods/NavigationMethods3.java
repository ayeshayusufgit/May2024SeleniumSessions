package seleniumSessions4_quitVsclose_navMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.net.*;

public class NavigationMethods3 {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub
		
		//The only difference between get(url) and to(url)
		//get() takes in only a String parameter whereas to() is overloaded and takes String and URL type parameter(as below)
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		Thread.sleep(1000);
		
		driver.navigate().to("https://www.amazon.com");
		
		driver.navigate().to(new URL("https://www.amazon.com"));
		//the URL that is being passed to to() is converted into String(using String.valueOf(url) in the wrapper class) and then its passed to the get(url) method
		//the main reason for the url to being converted into String is because get(url) only takes in String
		
		
		//usage of driver.navigation().to(URL)
		//In the xml file there is a URL object and the url is coming in the form of URL object, thats why to(new URL(url) is also there.
		
		
		
		
	}

}
