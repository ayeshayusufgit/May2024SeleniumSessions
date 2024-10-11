package seleniumSessions16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//1.
public class ActionsMoveToElement2 {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		
		By addons=By.xpath("//div[text()='Add-ons']");
		By visaServices=By.xpath("//div[text()='Visa Services-ons']");
		
		
		//driver.close();
	}
	
	public void parentChildMenu(By parentMenu,By childMenu ) throws InterruptedException {
		
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//div[text()='"+parentMenu+"']"))).perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[text()='"+childMenu+"']")).click();
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
}
