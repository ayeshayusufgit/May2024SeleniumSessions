package seleniumSessions11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//1.
public class SelectDropdownAllOptions {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://orangehrm.com/30-day-free-trial");

		By country = By.id("Form_getForm_Country");

		WebElement countryElement = driver.findElement(country);
		Select select = new Select(countryElement);

		List<WebElement> optionsList = select.getOptions();

		System.out.println(optionsList.size());

		for (WebElement element : optionsList) {
			String text=element.getText();
			System.out.println(text);
		}
	}
}
