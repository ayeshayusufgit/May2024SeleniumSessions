package seleniumSessions16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//2.
public class BigBasketMultiMenuHandling {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bigbasket.com/");

//		By level1Menu = By.xpath("(//span[text()='Shop by'])[2]");
//		By level2Menu = By.linkText("Beverages");
//		By level3Menu = By.linkText("Tea");
//		By level4Menu = By.linkText("Green Tea");
//		handleParentChildMenu(level1Menu, level2Menu, level3Menu, level4Menu);
		
		By level1Menu = By.xpath("(//span[text()='Shop by'])[2]");
		By level2Menu = By.linkText("Apparel");
		By level3Menu = By.linkText("Men's Apparel");
		By level4Menu = By.linkText("Men's Top Wear");
		handleParentChildMenu(level1Menu, level2Menu, level3Menu, level4Menu);
		
	}

	public static WebElement getElement(By locator) {
		// the local driver will be used here(which is assigned in the constructor)
		return driver.findElement(locator);
	}

	public static void doClick(By locator) {
		getElement(locator).click();
	}

	public static void handleParentChildMenu(By level1Menu, By level2Menu, By level3Menu, By level4Menu) throws InterruptedException {
		doClick(level1Menu);
		Thread.sleep(1500);
		Actions act=new Actions(driver);
		act.moveToElement(getElement(level2Menu)).perform();
		Thread.sleep(1500);
		act.moveToElement(getElement(level3Menu)).perform();
		Thread.sleep(1500);
		doClick(level4Menu);
	}
}