package seleniumSessions10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//3.
public class CheckElementIsPresent2 {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		By logo = By.className("img-responsive");
		By rightPanelLinks = By.xpath("//div[@class='list-group']/a");
		By naveen=By.id("test");
		
//		int count = driver.findElements(logo).size();
//
//		if (count == 1) {
//			System.out.println("The logo is present");
//		} else {
//			System.out.println("The logo is not present");
//		}
		
		//System.out.println(isElementPresent(logo));
		//System.out.println(isElementPresent(logo,1));
		//System.out.println(isElementPresent(rightPanelLinks, 13));
		
		System.out.println(isElementPresent(naveen, 0));//To check if the element is not present on a page
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static int getElementsCount(By locator) {
		return getElements(locator).size();
	}

	//These methods are overloaded
	
	//This method is written for checking the presence of an element once
	public static boolean isElementPresent(By locator) {
		if (getElementsCount(locator) == 1) {
			return true;
		}
		return false;
	}
	
	//This method is written for checking the presence of an element "n" times 
	public static boolean isElementPresent(By locator,int expectedElementCount) {
		if (getElementsCount(locator) == expectedElementCount) {
			return true;
		}
		return false;
	}
	
	//This method is to check if an element is not present on the page
	public static boolean isElementNotPresent(By locator) {
		if (getElementsCount(locator) == 0) {
			return true;
		}
		return false;
	}
	
	//This method is used to check if an element is found 1 more times in the page
	public static boolean isElementPresentMultipleTimes(By locator) {
		if (getElementsCount(locator) >= 1) { //?
			return true;
		}
		return false;
	}
}
