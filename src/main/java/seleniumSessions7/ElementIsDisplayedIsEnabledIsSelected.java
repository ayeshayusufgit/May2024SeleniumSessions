package seleniumSessions7;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//12.
public class ElementIsDisplayedIsEnabledIsSelected {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php/?route=account/register");
	}

	public static boolean isElementDisplayed(By locator) {
		try {
			return getElement(locator).isDisplayed();
		} catch (NoSuchElementException ex) {
			System.out.println("Element is not displayed:" + locator);
			return false;
		}
	}

	public static boolean isElementSelected(By locator) {
		try {
			return getElement(locator).isSelected();
		} catch (NoSuchElementException ex) {
			System.out.println("Element is not selected:" + locator);
			return false;
		}
	}

	public static boolean isElementEnabled(By locator) {
		try {
			return getElement(locator).isEnabled();
		} catch (NoSuchElementException ex) {
			System.out.println("Element is not enabled:" + locator);
			return false;
		}
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
