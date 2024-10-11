package seleniumSession27.UITests.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

//3
public class BaseTest {
	//BaseTest class is not a feature of the TestNG class its a custom class written,
	//Its behaving like a Parent for all GoogleTest, LoginPageTest and the OrangeHRMTest class
	//This class contains all the common code ie every test requires opening the browser,
	//maximizing the window,deleting the cookies etc
	//The same way all the test also requires closing of browser after the test
	//This is not a feature of TestNG
	
	protected WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://google.com");
		//since this will be used for 3 applications, the url needs to be set for each application
		//currently only 1 URL was being set for all applications
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
