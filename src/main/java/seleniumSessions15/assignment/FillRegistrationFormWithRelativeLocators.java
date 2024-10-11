package seleniumSessions15.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;


//Fill the registration form using relative locators

public class FillRegistrationFormWithRelativeLocators {
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		
		WebElement fnameLabel=driver.findElement(By.xpath("//label[@for='input-firstname']"));
		
		WebElement lnameLabel=driver.findElement(By.xpath("//label[@for='input-lastname']"));

		WebElement emailLabel=driver.findElement(By.xpath("//label[@for='input-email']"));

		WebElement telephoneLabel=driver.findElement(By.xpath("//label[@for='input-telephone']"));

		WebElement pwdLabel=driver.findElement(By.xpath("//label[@for='input-password']"));
		
		WebElement pwdConfirmLabel=driver.findElement(By.xpath("//label[@for='input-confirm']"));
		
		//WebElement subscribeLabel=driver.findElement(By.xpath("//label[@class='col-sm-2 control-label' and contains(text(),'Subscribe')]"));

		WebElement privacyPolicyLink=driver.findElement(By.linkText("Privacy Policy"));
		
		
		driver.findElement(with(By.id("input-firstname")).toRightOf(fnameLabel)).sendKeys("Fname");
		
		driver.findElement(with(By.id("input-lastname")).toRightOf(lnameLabel)).sendKeys("Lname");
	
		driver.findElement(with(By.id("input-email")).toRightOf(emailLabel)).sendKeys("abc@test1.com");
		
		driver.findElement(with(By.id("input-telephone")).toRightOf(telephoneLabel)).sendKeys("1234567890");
		
		driver.findElement(with(By.id("input-password")).toRightOf(pwdLabel)).sendKeys("test123");
		
		driver.findElement(with(By.id("input-confirm")).toRightOf(pwdConfirmLabel)).sendKeys("test123");
		
		//driver.findElement(with(By.id("input-confirm")).toRightOf(pwdConfirmLabel)).sendKeys("test123");
		//		//input[@type='radio' and contains(text(),'Yes')]
		
		driver.findElement(with(By.tagName("input")).toRightOf(privacyPolicyLink)).click();
		driver.findElement(with(By.xpath("//input[@type='submit']")).toRightOf(privacyPolicyLink)).click();
		
	}

}
