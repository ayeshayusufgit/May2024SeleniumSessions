package seleniumSessions17;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//3.
public class ActionsScrolling2 {
	static WebDriver driver;
	
	//With top panel and footer panel(not infinite scrolling)
	//On launching a page, if we want to click on a link for example a link on the footer, 
	//then i need to scroll the page and then click on the footer link.
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.freshworks.com/");
		//driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		//Static scroll
		Actions act=new Actions(driver);
		
		//Scroll to the bottom(footer) of the page in windows
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).perform();
		Thread.sleep(2000);
		
		//Scroll to the top of the page in windows
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).perform();
		
		//Scroll to the bottom(footer) of the page in MAC
//		act.sendKeys(Keys.COMMAND).sendKeys(Keys.END).perform();
//		Thread.sleep(2000);
		
		//Scroll to top of the page
//		act.sendKeys(Keys.COMMAND).sendKeys(Keys.HOME).perform();
	}
}
