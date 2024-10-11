package seleniumSessions25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import seleniumSessions5_webelement_bylocator_sendkeys.ElementUtil9;

//2.
public class WaitForFrame {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");//page
		
		By frameLocator=By.name("main");
		
		ElementUtil9 eUtil=new ElementUtil9(driver);
		
		//This will switch to the frame named "main"
		eUtil.waitForFrameUsingLocatorAndSwitchToIt(frameLocator, 5);
		String header=driver.findElement(By.tagName("h2")).getText();
		System.out.println(header);
	}
}
