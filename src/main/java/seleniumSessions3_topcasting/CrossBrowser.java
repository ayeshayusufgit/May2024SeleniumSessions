package seleniumSessions3_topcasting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String browser = "chrome";// assume "chrome" is coming from an xml or properties or excel file
		String browser="opera";
		WebDriver driver = null;//local variable should be initialized with its default value an in the case of Non Primitive its null

		switch (browser.trim().toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;

		case "firefox":
			driver = new FirefoxDriver();
			break;

		case "edge":
			driver = new EdgeDriver();
			break;

		case "safari":
			driver = new SafariDriver();
			break;

		default:
			System.out.println("Pls pass a valid browser...");
			//break; if break is used will give NPE if browser value is not proper, thats why commented
			throw new BrowserException("=====INVALID BROWSER=====");
		}
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php/?route=account/login");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}

}
