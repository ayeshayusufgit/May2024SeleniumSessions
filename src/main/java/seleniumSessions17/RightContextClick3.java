package seleniumSessions17;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//1.
public class RightContextClick3 {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

		// List<WebElement>
		// optionsList=driver.findElements(By.xpath("//ul[@class='context-menu-list
		// context-menu-root']//span"));

		By contextMenu = By.xpath("//span[text()='right click me']");
	
		
		doContextClick(contextMenu,"Copy");

		//driver.findElement(By.xpath("//span[text()='Copy']")).click();
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doClick(By locator) {
		 getElement(locator).click();
	}

	public static void doContextClick(By locator,String text) {
		Actions act = new Actions(driver);
		act.contextClick(getElement(locator)).perform();
		By menuOption=By.xpath("//*[text()='"+text+"']");
		
		doClick(menuOption);
	}
}
