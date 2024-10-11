package seleniumSessions19;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//1.
public class JSPopupHandling4 {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		Alert alert=driver.switchTo().alert();
		String text=alert.getText();
		System.out.println(text);
		
		alert.sendKeys("naveen automation labs");
		
		Thread.sleep(3000);
		
		alert.accept();
		//alert.dismiss();
		
		//Since there is no alert(no js popup) on the page on trying to switch to an Alert results in an Exception
		//NoAlertPresentException
	}

}
