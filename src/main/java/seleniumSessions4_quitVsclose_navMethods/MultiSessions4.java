package seleniumSessions4_quitVsclose_navMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//4.
public class MultiSessions4 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();//Everytime a new session is created sid=123 
		driver=new ChromeDriver();//sid=456
		driver=new ChromeDriver();//sid=789
		
		//driver=new FirefoxDriver();//sid=987
		driver.get("https://www.google.com");//the url will be launched in the firefox browser
		
		//driver.quit();
		driver.close();//the current driver will be pointing to the 3rd chrome browser, 3rd chrome will be closed
		
	}
}
