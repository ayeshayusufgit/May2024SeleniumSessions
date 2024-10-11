package seleniumSessions26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Headless:no browser activity
		//no browser is visible 
		//testing is done behind the scene
		//faster
		
		//chrome:ChromeOptions
		//firefox:FirefoxOptions
		//edge:EdgeOptions
		
		//When to use headless mode?
		//In the cloud machine, when unable to install the browser, 
		//tests are to be executed in jenkins server(linux)
		//in this case headless mode can be used, however not a recommended practice
		
		//ChromeOptions
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--headless");
		co.addArguments("--incognito");
		// --headless or --incognito are called as browser switches
		
		WebDriver driver=new ChromeDriver(co);
		
		//FirefoxOptions
//		FirefoxOptions fo=new FirefoxOptions();
//		fo.addArguments("--headless");
//		fo.addArguments("--incognito");
//		WebDriver driver=new FirefoxDriver(fo);
		
		
		//EdgeOptions
//		EdgeOptions eo=new EdgeOptions();
//		eo.addArguments("--headless");
//		eo.addArguments("--Inprivate");
//		WebDriver driver=new EdgeDriver(eo);
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		System.out.println("title:"+driver.getTitle());
		driver.findElement(By.linkText("Forgotten Password")).click();
		System.out.println("title:"+driver.getTitle());
		driver.quit();
		
		
		//Incognito means the history is removed
		//In google chrome its called a private window
		
	}

}
