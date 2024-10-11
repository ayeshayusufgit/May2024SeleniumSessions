package seleniumSession28;

import org.testng.Assert;
import org.testng.annotations.Test;

import seleniumSession28.base.*;

//1
public class OrangeHRMTest extends BaseTest{
	
	@Test
	public void pageTitleTest() {
		//driver.get("https://www.orangehrm.com/30-day-free-trial/");
		
		String actualTitle= driver.getTitle();
		System.out.println("Actual Title="+actualTitle);
		Assert.assertEquals(actualTitle, "30-Day Advanced Free Trial | OrangeHRM");
	}
	
	@Test
	public void pageUrlTest() {
		String actualUrl= driver.getCurrentUrl();
		System.out.println("Actual Url="+actualUrl);
		Assert.assertTrue(actualUrl.contains("30-day-free-trial"));
	}
}
