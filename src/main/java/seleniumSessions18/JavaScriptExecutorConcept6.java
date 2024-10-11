package seleniumSessions18;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//1.
public class JavaScriptExecutorConcept6 {
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://classic.crmpro.com/");

		JavascriptUtil jsUtil=new JavascriptUtil(driver);
		
		//There are zoom in or zoom out methods in Selenium so the below js code can be used
		//This can be used for Responsive Testing, by checking the footer links after zooming it by 400%
		//If footer links are not visible after zooming in then its a bug
		
		//Checking the UI of the application or functionality on different resolutions of 
		//the browser
		
		jsUtil.zoomChromeEdgeSafariFirefox("400%");
		//This will work in Chrome, Edge and Safari
		//In the latest FF browser works in that also
		
		//Interview Question:How to scroll down and scroll up using js?
		
		//Interview Question:How to scroll down to half the page breadth using js?
		
		
	}
}
