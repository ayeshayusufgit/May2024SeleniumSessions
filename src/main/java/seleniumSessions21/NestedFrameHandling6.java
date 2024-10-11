package seleniumSessions21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//3.
public class NestedFrameHandling6 {
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
		
		//driver.switchTo().frame("pact2");
		//Selenium has introduced a new method to switch to the parent frame from the child frame
		driver.switchTo().parentFrame();
		//changes the context to the parent frame from f3 to f2
		
		driver.findElement(By.id("jex")).sendKeys("Selenium");
		
		driver.switchTo().parentFrame();
		//changes the context to the parent frame from f2 to f1
		driver.findElement(By.id("inp_val")).sendKeys("Testing with Passion");
		
		driver.switchTo().defaultContent();//This goes to the Main Page
		String header=driver.findElement(By.tagName("h3")).getText();
		System.out.println(header);
		
	
		
		
		
		
		
		
		
		
	}
}
