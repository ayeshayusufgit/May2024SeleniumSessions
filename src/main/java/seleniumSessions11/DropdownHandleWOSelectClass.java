package seleniumSessions11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//3.
public class DropdownHandleWOSelectClass {
	static WebDriver driver;
	
	//Interview Question:Get all the options using Select class an wo the Select class?
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://orangehrm.com/30-day-free-trial");
		
		By countryOptionsElement = By.xpath("//select[@id='Form_getForm_Country']/option");
		List<WebElement> countryOptionsList=driver.findElements(countryOptionsElement);
		System.out.println(countryOptionsList.size());
		
		for(WebElement option:countryOptionsList) {
			String text=option.getText();
			if(text.equals("India")){
				option.click();
				break;
			}
		}
	}
}
