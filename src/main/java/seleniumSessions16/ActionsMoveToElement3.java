package seleniumSessions16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//1.
public class ActionsMoveToElement3 {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		
//		By addons=By.xpath("//div[text()='Add-ons']");
//		By visaServices=By.xpath("//div[text()='Visa Services-ons']");
		//parentChildMenu("Add-ons", "Visa Services-ons");
		parentChildMenu("SpiceClub", "Benefits");
		
		//driver.close();
	}
	
	public static void parentChildMenu(String parentMenu,String childMenu ) {
		
		Actions act=new Actions(driver);
		
		act.moveToElement(getElement(By.xpath("//div[text()='"+parentMenu+"']"))).perform();
		
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		getElement(By.xpath("//div[text()='"+childMenu+"']")).click();
		
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
}
