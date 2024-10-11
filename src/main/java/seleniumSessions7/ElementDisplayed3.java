package seleniumSessions7;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//7.
public class ElementDisplayed3 {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php/?route=account/login");

		
		By logo=By.className("img-responsive");//When the logo is found
		boolean flag=isElementIsDisplayed(logo);
		System.out.println(flag);
		
		driver.quit();
		
//		Creation of WE+action
//		boolean flag = driver.findElement(By.className("img-responsive111")).isDisplayed();
//		System.out.println(flag);

//		if (flag) {
//			System.out.println("Logo is present");
//		} else {
//			System.out.println("Logo is not present");
//		}
	}
	

	//Classic Example of Exception Handling in the Selenium Code
	public static boolean isElementIsDisplayed(By locator) {
		try {
			return getElement(locator).isDisplayed();// Since this line results in an Exception it has to be surrounded by try----catch
		} catch (NoSuchElementException ex) {
			System.out.println("Element is not displayed:"+locator);
			return false;
		}
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
}
