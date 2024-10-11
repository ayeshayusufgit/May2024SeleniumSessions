package seleniumSessions17;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//3.
public class ActionsScrolling {
	static WebDriver driver;
	
	//With top panel and footer panel(not infinite scrolling)
	//On launching a page, if we want to click on a link for example a link on the footer, 
	//then i need to scroll the page and then click on the footer link.
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//Partial Scrolling:
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_UP).perform();
	}

}
