package seleniumSessions10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//7.
public class SelectDropdownHandling4 {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://orangehrm.com/30-day-free-trial");

		By country = By.id("Form_getForm_Country");
		
		WebElement countryElement=driver.findElement(country);
		Select select=new Select(countryElement);

		// selectDropdownValueByVisibleText(country, "India");
		// selectDropdownValueByValue(country, "Brazil");
		// selectDropdownValueByIndex(country, 5);
		
//		List<WebElement> optionsList=select.getOptions();
//		System.out.println(optionsList.size());
		
		int count=getDropdownOptionsCount(country);
		System.out.println(count-1);//total country count is 233-1(because the first country is the default text) = 232
	}

	public static int getDropdownOptionsCount(By locator) {
		Select select=new Select(getElement(locator));
		return select.getOptions().size();
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
