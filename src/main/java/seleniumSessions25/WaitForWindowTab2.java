package seleniumSessions25;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import seleniumSessions5_webelement_bylocator_sendkeys.ElementUtil9;

//3.
public class WaitForWindowTab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");//parent window
//		WebElement executiveProfile = driver.findElement(By.xpath("//footer//a[contains(text(),'Executive Profile')]"));
//	
//		Actions act = new Actions(driver);
//		act.click(executiveProfile).perform();//child window opens
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//The driver waits for 10 secs for the number of windows to be 2 with 
		//polling time as 2 since it doesn't find total window count of 2 it throws 
		//a TimeOutException and not false, if 2 windows would be found then it would 
		//return true
		boolean flag=wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		System.out.println(flag);
	}
}
