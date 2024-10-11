package seleniumSessions21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//3.
public class NestedFrameHandling3 {
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://selectorshub.com/iframe-scenario/");//page
		
		Thread.sleep(1000);
		
		
		driver.switchTo().frame("pact1");//frame1
		
		driver.findElement(By.id("inp_val")).sendKeys("First Crush");
		
		driver.switchTo().frame("pact2");//frame2
		
		driver.findElement(By.id("jex")).sendKeys("Current Crush");
		
		driver.switchTo().frame("pact3");//frame3
		
		driver.findElement(By.id("glaf")).sendKeys("Destiny");
		
		
	}
}
