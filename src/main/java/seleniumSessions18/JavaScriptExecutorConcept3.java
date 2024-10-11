package seleniumSessions18;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//1.
public class JavaScriptExecutorConcept3 {
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

//		JavascriptExecutor jse=(JavascriptExecutor)driver;
//		String title=jse.executeScript("return document.title;").toString();
//		System.out.println("Title="+title);
//		
//		String currentPageUrl=jse.executeScript("return document.URL;").toString();
//		System.out.println("Page Url="+currentPageUrl);
	
		
		
		
		String title=getPageTitle();
		System.out.println("Title="+title);
		
		String url=getPageURL();
		System.out.println("Page URL="+url);
	}
	
	public static String getPageTitle() {
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		return jse.executeScript("return document.title;").toString();
	}

	public static String getPageURL() {
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		return jse.executeScript("return document.URL;").toString();
	}
}
