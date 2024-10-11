package seleniumSessions20;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

//4.
public class NewWindowConcept {
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://orangehrm.com/30-day-free-trial");
		
		//This is a new feature of Selenium 4.x
		//driver.switchTo().newWindow(WindowType.TAB);//A blank new TAB opens and the driver switches to that
		driver.switchTo().newWindow(WindowType.WINDOW);//A blank new WINDOW opens and the driver switches to that
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		//This URL is opened on the new blank window
		
		System.out.println("Child Title:"+driver.getTitle());//The title of the new window (child window)is displayed
		
		driver.close();//The new window(child window) is closed
		
		System.out.println("Parent Title:"+driver.getTitle());
		//After closing the child window, the driver should be switched back to the parent window
		//ow this gives a NoSuchWindowException, as the driver control is lost
		//Automatically the switch doesn't happen
	}
	
}
