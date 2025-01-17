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
public class WaitForWindowTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");//parent window
		WebElement executiveProfile = driver.findElement(By.xpath("//footer//a[contains(text(),'Executive Profile')]"));
		
		Actions act = new Actions(driver);
		act.click(executiveProfile).perform();//child window opens
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		boolean flag=wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		System.out.println(flag);
		
		
		
	}

}
