package seleniumSession27.UITests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//1
public class LoginPageTest2 {
	WebDriver driver;
	//AAA:
	//	Arrange:Arranging the testcases independaetly
	//	Act:
	//	Assert:One test as per the AAA pattern should have only 1 assert
	
	@BeforeTest
	public void setUp() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}
	
	//On combining pageTitleTest,pageUrlTest and pageLogoTest into pageTest
	//If even 1 assertion fails(title assertion) in the pageTest the whole testcase 
	//fails and is terminated(does not execute the url and logo assertion even though it may pass)
	//Thus the execution coverage is not proper
	
	//And as per AAA pattern the assertions should never be combined
	@Test
	public void pageTest() {
		String actualTitle= driver.getTitle();
		System.out.println("Actual Title="+actualTitle);
		Assert.assertEquals(actualTitle, "Account Login1");//Verification(very imp step)
		
		String actualUrl= driver.getCurrentUrl();
		System.out.println("Actual Url="+actualUrl);
		Assert.assertTrue(actualUrl.contains("route=account/login"));//Verification(very imp step)

		Assert.assertTrue(driver.findElement(By.cssSelector("img.img-responsive")).isDisplayed());

		//Assertion1
		//Assertion2
		//Assertion3
		//Assertion4
		//
		//
		//Assertion50
		
	}
	
//	@Test
//	public void pageTitleTest() {
//		String actualTitle= driver.getTitle();
//		System.out.println("Actual Title="+actualTitle);
//		Assert.assertEquals(actualTitle, "Account Login");//Verification(very imp step)
//		
//	}
//	
//	@Test
//	public void pageUrlTest() {
//		String actualUrl= driver.getCurrentUrl();
//		System.out.println("Actual Urle="+actualUrl);
//		Assert.assertTrue(actualUrl.contains("route=account/login"));//Verification(very imp step)
//	}
//	
//	@Test
//	public void pageLogoTest() {
//		Assert.assertTrue(driver.findElement(By.cssSelector("img.img-responsive")).isDisplayed());
//		
//	}
	

	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
