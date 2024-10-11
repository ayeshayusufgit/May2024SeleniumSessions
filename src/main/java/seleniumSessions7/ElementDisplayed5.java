package seleniumSessions7;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//9.
public class ElementDisplayed5 {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php/?route=account/login");

		
		By logo=By.className("img-responsive111");
		if(isElementDisplayed(logo)) {
			System.out.println("This logo is present on the page");
		}else {
			System.out.println("This logo is not present on the page");
		}
		
//		driver.quit();
		
//		Creation of WE+action
//		boolean flag = driver.findElement(By.className("img-responsive111")).isDisplayed();
//		System.out.println(flag);

//		if (flag) {
//			System.out.println("Logo is present");
//		} else {
//			System.out.println("Logo is not present");
//		}
	}

	public static boolean isElementDisplayed(By locator) {
		try {
			return getElement(locator).isDisplayed();
		} catch (NoSuchElementException ex) {
			System.out.println("Element is not displayed:"+locator);
			return false;
		}
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
}
