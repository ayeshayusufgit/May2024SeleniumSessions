package seleniumSession27.UITests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import seleniumSession27.UITests.base.BaseTest;

//3
public class GoogleTest extends BaseTest {
	//WebDriver driver;
	
//	@BeforeTest
//	public void setUp() {
//		driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://google.com");
//	}
	
	@Test(priority=1)
	public void pageTitleTest() {
		driver.get("https://google.com");//URL can be set in the first test and used in the other tests
		//as this will always run first as priority=1
		//if priority is not written then the driver.get(...) line has to be written again an again 
		String actualTitle= driver.getTitle();
		System.out.println("Actual Title="+actualTitle);
		Assert.assertEquals(actualTitle, "Google");//Verification(very imp step)
		
	}
	
	@Test(priority = 2)
	public void pageUrlTest() {
		String actualUrl= driver.getCurrentUrl();//google.com will be open for this test
		System.out.println("Actual Urle="+actualUrl);
		Assert.assertTrue(actualUrl.contains("google"));//Verification(very imp step)
	}
	//The current issue with these classes are that I need to goto each class right click 
	//n execute it but if we have like 100 classes it will not be feasible to execute like this
	//So in that case I need to have a runner with all the test classes bundled together
	//Right click and execute. ie testng.xml
	//This xml is provided by TestNG
	
	//testng.xml
	//<test>
	//	 <class="LoginPageTest"/>
	//</test>
	//<test>
	//	 <class="GoogleTest"/>
	//</test>
	//<test>
	//	 <class="OrangeHRMTest"/>
	//</test>
	
	//This file should never be created in the /main/java or the /test/java folder
	//Since this is a resource it should be created in the resource folder
	//Create a source folder, /src/test/resource and add the runner file testng.xml in that
	
	
	
	
	
	
	
//	@AfterTest
//	public void tearDown() {
//		driver.close();
//	}

	
}
