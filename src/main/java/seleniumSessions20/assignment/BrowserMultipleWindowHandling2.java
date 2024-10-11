package seleniumSessions20.assignment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//3.(Case 2):
//Which case is better? Case 1 or Case 2
//Case 1:Once the driver is out its handling all the windows and then finally closing them all
//Case2:So many times the switch is required(in 4 pairs)


public class BrowserMultipleWindowHandling2 {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");// parent window

		String parentWindowId = driver.getWindowHandle();// storing the parent id

		WebElement executiveProfile = driver.findElement(By.xpath("//footer//a[contains(text(),'Executive Profile')]"));
		WebElement pressReleases = driver.findElement(By.xpath("//footer//a[contains(text(),'Press Releases')]"));
		WebElement newsArticles = driver.findElement(By.xpath("//footer//a[contains(text(),'News Articles')]"));
		WebElement csSupport = driver.findElement(By.xpath("//footer//a[contains(text(),'CS & Support')]"));

		Thread.sleep(3000);
		
		Actions actions = new Actions(driver);
		actions.click(executiveProfile).perform();
		
		Set<String> windowIds = driver.getWindowHandles();
		Iterator<String> itr = windowIds.iterator();

		while (itr.hasNext()) {
			String windowId = itr.next();
			if (!parentWindowId.equals(windowId)) {
				driver.switchTo().window(windowId);
				driver.getTitle();
				driver.close();
				driver.switchTo().window(parentWindowId);
			}
		}
	}
}
