package seleniumSessions22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//1.
public class SVGElementHandling2 {
	
	//SVG means Scalar Vector Graphs
	//These are special images on the webpage
	//like the search icon
	//incase of svg we do not use cssSelector but a special xpath
	//normal xpath wont work
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys("macbook pro");
		
		//xpath to find a unique element
		driver.findElement(By.xpath("//form[contains(@class,'header-form-search')]//*[local-name()='svg' and @fill='none']")).click();
		
		
	}

}
