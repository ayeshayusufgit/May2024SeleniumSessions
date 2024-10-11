package seleniumSession27.UITests;

import org.openqa.selenium.By;
import org.testng.Assert;

import org.testng.annotations.Test;

import seleniumSession27.UITests.base.BaseTest;

//3
public class LoginPageTest4 extends BaseTest{
	//WebDriver driver;
	
//	@BeforeTest
//	public void setUp() {
//		driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//	}
	
	@Test(priority = 1)
	public void pageTitleTest() {
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		String actualTitle= driver.getTitle();
		System.out.println("Actual Title="+actualTitle);
		Assert.assertEquals(actualTitle, "Account Login");//Verification(very imp step)
	}
	
	@Test(priority = 2)
	public void pageUrlTest() {
		String actualUrl= driver.getCurrentUrl();
		System.out.println("Actual Urle="+actualUrl);
		Assert.assertTrue(actualUrl.contains("route=account/login"));//Verification(very imp step)
	}
	
	@Test(priority = 3)
	public void pageLogoTest() {
		Assert.assertTrue(driver.findElement(By.cssSelector("img.img-responsive")).isDisplayed());
		
	}
	//On running the LoginPageTest class the setUp() from the BaseTest will be executing first
	//as its extending the BaseTest.After which the LoginPageTest4 testcases will be executed in alphabetical order.
	//Finally the tearDown() from the BaseTest will be executed.TestNG will take care of this.
	//The driver(declared in BaseTest class) is coming from the BaseTest class(Parent class) which is inherited from the
	//Parent class.
	
	//THe same thing can be done for GoogleTest and OrangeHRMTest class
	
	

//	@AfterTest
//	public void tearDown() {
//		driver.close();
//	}
}
