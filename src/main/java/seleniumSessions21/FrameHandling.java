package seleniumSessions21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//1.
public class FrameHandling {
		
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
		Thread.sleep(3000);
		
		String header=driver.findElement(By.tagName("h2")).getText();
		//Results in an Exception(below)
		//org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"tag name","selector":"h2"}
		//As this is within a frame and cannot be directly accessed
		
		System.out.println(header);
	}
}
