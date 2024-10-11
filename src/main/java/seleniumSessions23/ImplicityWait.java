package seleniumSessions23;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//2.
public class ImplicityWait {
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//Selenium 3.x
		//(deprecated) very soon itll be removed also
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//Selenium 4.x
		//Global Wait:
		//This type of wait is a global wait
		//It will be applied to all the WebElements by default
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		driver.findElement(By.id("input-firstname")).sendKeys("naveen@gmail.com");
		//automatically a wait of 10 seconds will be applied for this WE
		//a.if the element is found within 10 secs ie 2 secs then a timeout of 2 secs will be applied
		//and the next statement will get executed
			
		//b.if the element takes 12 seconds for a WE then after 10 secs NSE is thrown with the timeout
		
		//If the id is wrong will it throw the Exception immediately?
		//No it will not, Selenium will check for the element on the page for upto 10 secs, 
		//if it doesnt find the element within 10 secs then a NSE Exception is thrown.
		//driver.findElement(By.id("input-firstname111")).sendKeys("naveen@gmail.com");
	
		driver.findElement(By.id("input-firstname")).sendKeys("naveen@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("naveen@123");
		//The same mechanism will be applied to the 2nd element of 10 secs
		
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		//The same mechanism will be applied to the 3rd element of 10 secs
		
		//Do we really want to wait for the password field and the Login Button?
		//If the login page is loaded on the page the entire login form is loaded together
		//(the username , password n login button are visible at the same time on the page and not at different intervals)

	}

}
