package seleniumSessions21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//3.
public class NestedFrameHandling2 {
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://selectorshub.com/iframe-scenario/");//page
		
		Thread.sleep(1000);
		
		
		driver.switchTo().frame("pact1");//frame1
		
		driver.findElement(By.id("inp_val")).sendKeys("Testing");
		
		driver.findElement(By.id("jex")).sendKeys("Crush");
		//This line gives an Exception ie NoSuchElementException
		//As this element is within another iFrame which is the child of the first iFrame
		
		
		
	}

}
