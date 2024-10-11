package seleniumSessions3_topcasting;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

//Major advantage
//Generic utilities work for all applications
//The code is readable an reusable

/*
 * This class is only for browser related utils
 */
public class BrowserUtil {

	WebDriver driver;

	/**
	 * This method is used to initialize the browser on the basics of browserName
	 * 
	 * @param browser
	 * @return returns driver
	 */

	public WebDriver initDriver(String browserName) {

		System.out.println("browser Name:" + browserName);

		switch (browserName.trim().toLowerCase()) {

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
			throw new BrowserException("=====INVALID BROWSER=====");
		}

		return driver;
	}
	
	public void launchURL(String url) {
		if (url.indexOf("http") != 0 || url.length() == 0) {
			throw new BrowserException("http(s) missing in the URL");
		}
		driver.get(url);
	}
	
	public void launchURL(URL url) {
		driver.navigate().to(url);
	}
	
//	how to pass value to this launchURL(url)?
//	public void launchURL(URL url) {
//		
//		try {
//			URL myUrl=new URL("https://www.abc.com");
//			launchURL(url);
//		} catch (MalformedURLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		driver.navigate().to(url);
//	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public String getPageURL() {
		return driver.getCurrentUrl();
	}

	public void quitBrowser() {
		driver.quit();
	}

	public void closeBrowser() {
		driver.close();
	}
}
