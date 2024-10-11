package seleniumSession27.UITests;

import org.testng.Assert;
import org.testng.annotations.Test;

import seleniumSession27.UITests.base.BaseTest;

//3
public class OrangeHRMTest extends BaseTest{
	//WebDriver driver;
	
//	@BeforeTest
//	public void setUp() {
//		driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://www.orangehrm.com/30-day-free-trial/");
//	}
	
	@Test(priority = 1)
	public void pageTitleTest() {
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		String actualTitle= driver.getTitle();
		System.out.println("Actual Title="+actualTitle);
		Assert.assertEquals(actualTitle, "30-Day Advanced Free Trial | OrangeHRM");//Verification(very imp step)	
	}
	
	@Test(priority = 2)
	public void pageUrlTest() {
		String actualUrl= driver.getCurrentUrl();
		System.out.println("Actual Urle="+actualUrl);
		Assert.assertTrue(actualUrl.contains("30-day-free-trial"));//Verification(very imp step)
	}
	
//	@AfterTest
//	public void tearDown() {
//		driver.close();
//	}

	//Common this about OrangeHRMTest and GoogleTest is that both have the setup and teardown methods
	//The setup() and tearDown() can be moved into a BaseTest class will can be extended by the GoogleTest and OrangeHRMTest
}
