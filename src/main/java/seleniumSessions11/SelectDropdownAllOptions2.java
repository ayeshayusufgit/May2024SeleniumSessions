package seleniumSessions11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//2.
public class SelectDropdownAllOptions2 {
	static WebDriver driver;

	//Interview Question//
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://orangehrm.com/30-day-free-trial");

		By country = By.id("Form_getForm_Country");
		
		//Single Country Validation
		if(getDropdownOptionsTextList(country).contains("India")) {
			System.out.println("Pass");
		}
		
		//Multiple Country Validation 
		List<String> expectedCountryList=Arrays.asList("India","Austria","Sri Lanka");

		
		if(getDropdownOptionsTextList(country).containsAll(expectedCountryList)) {
			System.out.println("Pass");
		}
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static List<String> getDropdownOptionsTextList(By locator) {
		WebElement dropdownElement = getElement(locator);
		List<String> dropdownOptionsTextList = new ArrayList<String>();

		Select select = new Select(dropdownElement);

		List<WebElement> optionsList = select.getOptions();

		System.out.println(optionsList.size());

		for (WebElement element : optionsList) {
			String text = element.getText();
			dropdownOptionsTextList.add(text);
		}
		return dropdownOptionsTextList;
	}
}
