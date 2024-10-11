package seleniumSessions6_diffLocators_click_getTextMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//1.
public class ElementClick {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//The click operation can be done on a link, button, checkbox, radio button, image
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php/?route=account/register");
		
		//To click the WebElement
		//Create the WebElement(FE) + Perform the action(in this case its click)
		
		//html tag: <a> for link
//		driver.findElement(By.linkText("Login")).click();
//		driver.findElement(By.linkText("Register")).click();
//		driver.findElement(By.name("agree")).click();
		
		//By locators
		By loginLink=By.linkText("Login");
		By registerLink=By.linkText("Register");
		By agreeCheckBox=By.name("agree");
		
		doClick(loginLink);
		doClick(registerLink);
		doClick(agreeCheckBox);
		
		//driver.quit();
	}
	
	//Step 1. Create WebElement
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	//Step 2. Action method-this can be added in ElementUtil
	public static void doClick(By locator) {
		getElement(locator).click();
	}
}
