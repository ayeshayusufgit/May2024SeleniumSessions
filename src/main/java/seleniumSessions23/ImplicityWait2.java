package seleniumSessions23;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//2.
public class ImplicityWait2 {
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//Selenium 3.x
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//Selenium 4.x
		
		//Global Wait:
		//It will be applied on all the Web Elements by default
		
		//It cannot be applied on specific Web Elements
		
		//It cannot be applied on non Web Elements like title of the page, url of the page, windows(new tab),
		//javascript popups, alerts(This is a major drawback of the implicitly wait)
	
		//So thats why explicitly wait is used
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//Login Page:10 secs
		driver.findElement(By.id("input-firstname")).sendKeys("naveen@gmail.com");//10
		//10 secs: 2 secs
		//10 secs:12 secs: NSE timeout
		//10 secs: 5 secs
		
		driver.findElement(By.id("input-password")).sendKeys("naveen@123");//10
		//The same mechanism will be applied to the 2nd element of 10 secs
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();//10
		//The same mechanism will be applied to the 3rd element of 10 secs
	
		//After logging in we are landing on the Home Page
		//Home Page:20 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//20
		//e4
		//e5
		//e6
		
		//Login Page:10 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//The implicit wt is changed to 10 secs for Login Page
		
		//Register Page:5 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//The implicit wt is changed to 5 secs for Registration Page(iwt is overridden to 5 secs)
		
		//Search Page:0 secs(As no need to wait here)
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		//This is called nullify of implicitly wait
		
		//Home Page:0 secs
		//e7
		//e8
		//e9
	}

}
