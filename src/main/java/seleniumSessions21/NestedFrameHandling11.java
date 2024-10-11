package seleniumSessions21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//3.
public class NestedFrameHandling11 {
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://selectorshub.com/iframe-scenario/");
		
		Thread.sleep(1000);
		
		//More Readable
//		driver.switchTo().frame("pact1")
//			  	.switchTo().frame("pact2")
//			   		.switchTo().frame("pact3")
//			  			.findElement(By.id("glaf")).sendKeys("Selenium");
		
		String header=
		driver.switchTo().frame("pact1")
			  	.switchTo().frame("pact2")	
			   		.switchTo().frame("pact3")
			   			.switchTo().parentFrame()
			   				.switchTo().parentFrame()
			   					.switchTo().defaultContent().findElement(By.tagName("h3")).getText();
	
		System.out.println(header);
		
		//Cypress doesn't not have any iFrame handling support unlike Selenium
		//Playwright supports iFrame handling
	}
}
