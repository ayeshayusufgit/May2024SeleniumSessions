package seleniumSessions17;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//1.
public class RightContextClick2 {
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		Actions act = new Actions(driver);
		
		//Right click and context click both are the same
		act.contextClick(driver.findElement(By.xpath("//span[text()='right click me']"))).perform();
		
		driver.findElement(By.xpath("//span[text()='Copy']")).click();
		
//		List<WebElement> optionsList=driver.findElements(By.cssSelector("ul.context-menu-list span"));
//		System.out.println(optionsList.size());
//		
//		for(WebElement option:optionsList) {
//			String text=option.getText();
//			System.out.println(text);
//			
//			if(text.equals("Copy")) {
//				option.click();
//				break;
//			}
//		}
		
	}
}
