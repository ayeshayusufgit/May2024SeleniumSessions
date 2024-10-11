package seleniumSessions16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//1.
public class ActionsMoveToElement {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		
		By addons=By.xpath("//div[text()='Add-ons']");
		By visaServices=By.xpath("//div[text()='Visa Services-ons']");
		
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(addons)).perform();
		//Its mandatory to use perform after the action ie moveToElement()
		//Without perform the action wont work
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(visaServices).click();
		
		//driver.close();
	}
	
	
	

}
