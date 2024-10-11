package seleniumSessions11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//4.
public class DropdownHandleWOSelectClass2 {
	static WebDriver driver;
	
	//Interview Question:Get all the options using Select class an wo the Select class?
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://orangehrm.com/30-day-free-trial");
		
		By countryOptionsElement = By.xpath("//select[@id='Form_getForm_Country']/option");
		
		selectDropdownValue(countryOptionsElement, "India");
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static void selectDropdownValue(By locator,String value) {
		List<WebElement> ddOptionsList=getElements(locator);
		//System.out.println(ddOptionsList.size());
		
		for(WebElement option:ddOptionsList) {
			String text=option.getText();
			if(text.equals(value)){
				option.click();
				break;
			}
		}
	}
}
