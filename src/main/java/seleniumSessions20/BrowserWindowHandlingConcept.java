package seleniumSessions20;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//2.
public class BrowserWindowHandlingConcept {
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://orangehrm.com/30-day-free-trial");
		
		WebElement executiveProfile = driver.findElement(By.xpath("//footer//a[contains(text(),'Executive Profile')]"));
		//executiveProfile.click(); child window, results in an Exception
		//org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element is not clickable at point
		
		Actions act = new Actions(driver);
		act.click(executiveProfile).perform();//child window, this is working
		
		//1.fetch the window ids for parent and child windows:
		Set<String> windowHandles=driver.getWindowHandles();
		//"Set" is a non order based collection and doesn't maintain duplicate values
		//This is because the parent and child window ids will always be different
		
		//Iterator is used in fetching the values from collections which dont have an order or index.
		Iterator<String> itr=windowHandles.iterator();
		//Iterator will be pointing just above the first segment
		
		String parentWindowId=itr.next();
		//This will move the iterator to the next location in the memory location or segment
		//This will also fetch the value from the memory location
		//The return type of fetch method will be a String
		
		System.out.println("Parent Window Id="+parentWindowId);
		
		String childWindowId=itr.next();
		System.out.println("Child Window Id="+childWindowId);
		
		//Since there are only 2 windows the first entry(segment) will be the parent window id 
		//and the second entry(segment) will be the child window id
		
		//THe window ids are alphanumeric and these values are dynamic in nature
		
		//2.Switching windows:
		driver.switchTo().window(childWindowId);//switch to the child window
		System.out.println("Child Window Title:"+driver.getTitle());//gets the child window title
		driver.close();//will close the child window
		//The driver control is lost on closing the child window, it needs to be switched back to the parent window
		
		driver.switchTo().window(parentWindowId);//switches to the parent window
		System.out.println("Parent Window Title:"+driver.getTitle());
		
		driver.quit();//quits the parent window
		
		
	}
}
