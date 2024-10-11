package seleniumSessions21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//3.
public class NestedFrameHandling5 {
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://selectorshub.com/iframe-scenario/");//page
		
		Thread.sleep(1000);
		
		
		driver.switchTo().frame("pact1");//switch to frame1
		
		driver.findElement(By.id("inp_val")).sendKeys("First Crush");
		
		driver.switchTo().frame("pact2");//switch to frame2
		
		driver.findElement(By.id("jex")).sendKeys("Current Crush");
		
		driver.switchTo().frame("pact3");//switch to frame3
		
		driver.findElement(By.id("glaf")).sendKeys("Destiny");
		
		driver.switchTo().frame("pact2");//switch to frame2 from frame3
		//To move from parent frame f3 to child frame f2 is not possible this way
		
		driver.findElement(By.id("jex")).sendKeys("Selenium");
		//This results in an Exception:NoSuchFrameException
		
		
	
		
		
		
		
		
		
		
		
	}
}
