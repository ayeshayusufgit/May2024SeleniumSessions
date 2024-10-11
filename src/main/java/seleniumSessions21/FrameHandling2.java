package seleniumSessions21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//1.
public class FrameHandling2 {
		
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://www.londonfreelance.org/courses/frames/index.html");//page
		
		Thread.sleep(3000);
		
		//There are 2 types of frames:
		//1.frame:as per w3c frame is deprecated(some old applications use frames)
		//2.iframe:as per w3c most of the modern applications use iframes
		//but the handling in both the cases remain the same
		//A frame has its own html dom, a frame starts with a #document which means start of the frame
	
		//To find the number of frames on a page
		int frameCount=driver.findElements(By.tagName("frame")).size();
		System.out.println(frameCount);
		
		//These methods are overloaded:
		//1.driver.switchTo().frame(frameIndex);//this is not a preferred method as the index might change
		//driver.switchTo().frame(2);//in that case this wont work
		
		//2.driver.switchTo().frame(frameName);//using the frame name
		//driver.switchTo().frame("main");
		
		//3.driver.switchTo().frame(WebElement)//using the WebElement 
		driver.switchTo().frame(driver.findElement(By.name("main")));
		
		String header=driver.findElement(By.tagName("h2")).getText();
		
		System.out.println(header);
		

	}

}
