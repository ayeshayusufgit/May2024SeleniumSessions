package seleniumSessions19;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//1.
public class JSPopupHandling3 {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//Handling Prompt Popup
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		Thread.sleep(3000);
		
		Alert alert=driver.switchTo().alert();
		String text=alert.getText();
		System.out.println(text);
		
		alert.sendKeys("naveen automation labs");
		//manually on entering the text in the textbox, the entered text is seen in the textbox.
		//but while using selenium the entered text is not seen even though its being entered.
		
		
		alert.accept();//Click on Okay, the driver switches back automatically to the page
		//alert.dismiss();//To Cancel the Popup(Press esc of the keyword for the alert to disappear)
	}

}
