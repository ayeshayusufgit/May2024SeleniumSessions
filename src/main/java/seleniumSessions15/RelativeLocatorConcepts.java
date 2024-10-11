package seleniumSessions15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;
//This is to statically import the RelativeLocator class, need not write the RelativeLocator.with
//but instead only with can be used.

//3.
public class RelativeLocatorConcepts {
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//These are the 4 relative locator functions added in selenium 4.x
//				above
//				|
//		left<--ele-->right
//				|
//		near	below	
		
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://aqi.in/dashboard/canada");
		
		WebElement element=driver.findElement(By.linkText("Cold Lake, Canada"));//Base Element
		String rank=driver.findElement(with(By.tagName("p")).toLeftOf(element)).getText();
		System.out.println(rank);
		
		String aqi=driver.findElement(with(By.tagName("p")).toRightOf(element)).getText();
		System.out.println(aqi);
		
		String cityAbove=driver.findElement(with(By.tagName("p")).above(element)).getText();
		System.out.println(cityAbove);
		
		String cityBelow=driver.findElement(with(By.tagName("p")).below(element)).getText();
		System.out.println(cityBelow);
		
		String near=driver.findElement(with(By.tagName("p")).near(element)).getText();
		System.out.println(near);
		
		//Interview Question:What is the distance between the nearest element? 50 pixels
		
		
		String near1=driver.findElement(with(By.tagName("a")).near(element)).getText();
		System.out.println(near1);
		
		
	}
}
