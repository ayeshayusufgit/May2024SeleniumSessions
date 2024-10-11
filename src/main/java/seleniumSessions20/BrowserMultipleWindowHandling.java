package seleniumSessions20;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//3.(Case 1)
public class BrowserMultipleWindowHandling {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");// parent window

		String parentWindowId = driver.getWindowHandle();//storing the parent window id

		// target="_blank" -- new window/tab

		WebElement executiveProfile = driver.findElement(By.xpath("//footer//a[contains(text(),'Executive Profile')]"));
		WebElement pressReleases = driver.findElement(By.xpath("//footer//a[contains(text(),'Press Releases')]"));
		WebElement newsArticles = driver.findElement(By.xpath("//footer//a[contains(text(),'News Articles')]"));
		WebElement csSupport = driver.findElement(By.xpath("//footer//a[contains(text(),'CS & Support')]"));

		//4 child windows + 1 parent window is open
		//In Selenium a new window and a new tab is the same
		

		Actions act = new Actions(driver);
		act.click(executiveProfile).perform();
		act.click(pressReleases).perform();
		act.click(newsArticles).perform();
		act.click(csSupport).perform();

		
		Set<String> windowIds=driver.getWindowHandles();
		Iterator<String> itr=windowIds.iterator();
		while(itr.hasNext()) {
			String windowId=itr.next();
			driver.switchTo().window(parentWindowId);
			if(!parentWindowId.equals(windowIds)) {
			System.out.println(driver.getTitle());
			driver.close();
			}
			Thread.sleep(3000);
		}
		driver.switchTo().window(parentWindowId);
		System.out.println("Parent Window Title:"+driver.getTitle());
	}

}
