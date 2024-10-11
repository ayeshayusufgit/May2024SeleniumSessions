package seleniumSessions10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//6.
public class SelectDropdownHandling3 {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://orangehrm.com/30-day-free-trial");

		By country = By.id("Form_getForm_Country");

		// selectDropdownValueByVisibleText(country, "India");
		// selectDropdownValueByValue(country, "Brazil");
		// selectDropdownValueByIndex(country, 5);

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void selectDropdownValueByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}

	public static void selectDropdownValueByVisibleText(By locator, String visibleText) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(visibleText);
	}

	public static void selectDropdownValueByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}

//This way writting the selectDD method should be avoided clubbing all the select functionality 
//	public static void selectDropdown(By locator, String selectType, String visibleText, String value, int index) {
//		Select select = new Select(getElement(locator));
//		switch (selectType.toLowerCase()) {
//		case "visibletext":
//			select.selectByVisibleText(visibleText);
//			break;
//		case "value":
//			select.selectByValue(value);
//			break;
//		case "index":
//			select.selectByIndex(index);
//			break;
//		default:
//		}
//	}

	
}
