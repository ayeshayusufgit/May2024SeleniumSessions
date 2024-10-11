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
public class LoginPageTest {
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}
	
	@Test
	public void pageTitleTest() {
		String actualTitle= driver.getTitle();
		System.out.println("Actual Title="+actualTitle);
		Assert.assertEquals(actualTitle, "Account Login");//Verification(very imp step)
		
	}
	
	@Test
	public void pageUrlTest() {
		String actualUrl= driver.getCurrentUrl();
		System.out.println("Actual Urle="+actualUrl);
		Assert.assertTrue(actualUrl.contains("route=account/login"));//Verification(very imp step)
	}
	
	@Test
	public void pageLogoTest() {
		Assert.assertTrue(driver.findElement(By.cssSelector("img.img-responsive")).isDisplayed());
		
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
