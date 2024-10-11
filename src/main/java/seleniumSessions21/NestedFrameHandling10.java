package seleniumSessions21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//3.
public class NestedFrameHandling10 {
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
		driver.findElement(By.id("inp_val")).sendKeys("With Passion");
		
		
		//switching from frame1 to frame2:
//		driver.switchTo().frame("pact2");
//		driver.findElement(By.id("jex")).sendKeys("Selenium");
		
		//switching from frame1 to frame3:wont work
		//switching can be done from the parent to the child in sequence
		driver.switchTo().frame("pact3");
		driver.findElement(By.id("glaf")).sendKeys("Good Perks");
		
		
		//Combinations:
		//Switching from Main Page to frame1:yes
		//Switching from frame1 to frame2:yes
		//Switching from frame2 to frame3:yes
		//Switching from Main Page to frame2:no(we cannot skip a sequence)
		//Switching from Main Page to frame3:no(we cannot skip a sequence)
		//Switching from Main Page to frame1 to frame2 to frame3:yes
		
		//Switching from frame3 to frame2:yes(parentFrame())
		//Switching from frame2 to frame1:yes(parentFrame())
		//Switching from frame1 to Main Page:yes(parentFrame() & defaultContent())
		
		//Switching from frame3 to frame1->frame3 to frame2 to frame1(parentFrame())
		
		//Switching from frame3 to Main Page 
		driver.switchTo().defaultContent();//either it can switch to frame1 or Main Page
		
		//frame1 or frame2 or Main Page
		//Selects either the first frame on the page, or the main document when a page contains iframes
		
		String header=driver.findElement(By.tagName("h3")).getText();
		System.out.println(header);
		
		//Note:In Selenium 3.x the parentFrame() wasn't there so first we had to goto the defaultContent() 
		//and then from frame1 to frame2
		//frame3 to defaultContent() then frame1 to frame2
		
		//In Selenium 4.x immediately we can goto the parentFrame()
		
		
	}
}
