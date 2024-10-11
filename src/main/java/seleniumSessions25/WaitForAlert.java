package seleniumSessions25;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//1.
public class WaitForAlert {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		System.out.println(getAlertText(10));
		acceptAlert(10);
		
	}
	
	
	public static Alert waitForAlertAndSwitch(int timeOut) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.alertIsPresent());
		//this line automatically switches to alert		
	}
	
	public static String getAlertText(int timeOut) {
		return waitForAlertAndSwitch(timeOut).getText();
	}
	
	public static void acceptAlert(int timeOut) {
		 waitForAlertAndSwitch(timeOut).accept();
	}
	
	public static void dismissAlert(int timeOut) {
		 waitForAlertAndSwitch(timeOut).dismiss();
	}
	
	public static void enterValueOnAlert(int timeOut,String value) {
		 waitForAlertAndSwitch(timeOut).sendKeys(value);
	}
}
