package seleniumSession28;

import org.openqa.selenium.By;
import org.testng.Assert;

import org.testng.annotations.Test;

import seleniumSession28.base.*;

//1
public class LoginPageTest extends BaseTest{
	
	@Test
	public void pageTitleTest() {
		//driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		String actualTitle= driver.getTitle();
		System.out.println("Actual Title="+actualTitle);
		Assert.assertEquals(actualTitle, "Account Login");
	}
	
	@Test
	public void pageUrlTest() {
		String actualUrl= driver.getCurrentUrl();
		System.out.println("Actual Url="+actualUrl);
		Assert.assertTrue(actualUrl.contains("route=account/login"));
	}
	
	@Test
	public void pageLogoTest() {
		Assert.assertTrue(driver.findElement(By.cssSelector("img.img-responsive")).isDisplayed());
		
	}
}
