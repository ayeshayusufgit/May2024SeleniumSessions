package seleniumSession28;

import org.testng.Assert;
import org.testng.annotations.Test;

import seleniumSession28.base.*;

//1
public class GoogleTest extends BaseTest {
	
	
	@Test
	public void pageTitleTest() {
		//driver.get("https://google.com");// the @Parameter picks up different url from different tests 
		//instead of hardcoding it
		
		String actualTitle= driver.getTitle();
		System.out.println("Actual Title="+actualTitle);
		Assert.assertEquals(actualTitle, "Google");	
	}
	
	@Test
	public void pageUrlTest() {
		String actualUrl= driver.getCurrentUrl();
		System.out.println("Actual Url="+actualUrl);
		Assert.assertTrue(actualUrl.contains("google"));
	}
	
	//On only running 
}
