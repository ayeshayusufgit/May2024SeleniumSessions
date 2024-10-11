package seleniumSessions18;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//1.
public class JavaScriptExecutorConcept4 {
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
	
		JavascriptUtil jsUtil=new JavascriptUtil(driver);
		String title=jsUtil.getPageTitle();
		System.out.println("Title="+title);
		
		String url=jsUtil.getPageURL();
		System.out.println("Page URL="+url);
		
		jsUtil.generateJsAlert("I am on the Login Page");
	}
	
}
