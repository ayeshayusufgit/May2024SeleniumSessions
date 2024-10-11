package seleniumSession28.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

//1
public class BaseTest {
	
	protected WebDriver driver;
	
	//The url can be dynamically picked up from the testng.xml instead of it being hardcoded
	//This can be done using @Paramter
	
	@Parameters({"url","browser"})//This will read the parameter value from the testng.xml
	@BeforeTest //The url and browser parameter will be passed if you run in from the .xml file
	//Only running the test classes only, the url and browser parameter will not be passed from the .xml file
	//resulting in a TestNGException
	
	//On running test classes with default datatype values @Optional annotation can be used
	//NullPointerException is coming now instead of TestNGException
	//public void setUp(@Optional String url,@Optional String browser) {
	
	//Instead of default value of the String ie null, default browser value ie "chrome" can be used
	//In this 3 application urls are being used so the default url value cannot be provided
	//Just as an example default value for url is provided
	
	//But on designing the FW only 1 application url will be there so in that case a default application "url"
	//can be provided 
	//public void setUp(@Optional("https://www.google.com/") String url, @Optional("chrome") String browser) {
	
	public void setUp(String url, String browser) {	
	System.out.println("browser is:"+browser);
		
		switch(browser) {
		case "chrome": driver=new ChromeDriver();
						break;
						
		case "firefox": driver=new FirefoxDriver();
						break;
		
		case "edge": driver=new EdgeDriver();
					 break;
					 
		case "safari": driver=new SafariDriver();
		 			   break;
		
		 default:System.out.println("Pls supply the right browser...:"+browser);
		 		 throw new IllegalArgumentException("Wrong Browser:"+browser);	
		}
		
		//driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
