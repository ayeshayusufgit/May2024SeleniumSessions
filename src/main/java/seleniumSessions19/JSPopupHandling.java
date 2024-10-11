package seleniumSessions19;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//1.
public class JSPopupHandling {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//Handling Alert Popup
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		Thread.sleep(3000);
		
		Alert alert=driver.switchTo().alert();
		String text=alert.getText();
		System.out.println(text);
		
		alert.accept();//Click on Okay, the driver switches back automatically to the page
		//alert.dismiss();//To Cancel the Popup(Press esc of the keyword for the alert to disappear)
	}

}
