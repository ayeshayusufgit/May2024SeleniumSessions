package seleniumSessions3_topcasting;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class TopcastingOptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//This program will have all the topcasting options
		
		//1.Local used only for chrome or ff or safari or edge
		//ChromeDriver driver=new ChromeDriver();
		
		//2.The grand child object is being referred by the parent interface reference variable
		//recommended and valid topcasting, most frequently used
		//This option of topcasting is used for writing automation code locally
		WebDriver driver=new ChromeDriver();//remommended and valid
		driver=new EdgeDriver();//The same driver is pointing to Edge driver
		driver=new FirefoxDriver();//The same driver is pointing to Firefox driver
		driver=new SafariDriver();//The same driver is pointing to Safari driver
		driver=new InternetExplorerDriver(); //the same driver is pointing to InternetExplorer driver
		
		//3.The Child class is being referred by the Parent Interface reference variable, this topcasting is valid
		WebDriver driver=new RemoteWebDriver(remoteAddress, capabilities);
		//When Selenium Grid is setup then the Selenium Grid remote address is put along with the capabilities
		//remote machine(can be on the cloud, AWS, server, machine) - GRID
		//This option is for executing on the remote machine using Selenium GRID
		
		//4.ChromeDriver is the grandchild of the SearchContext Interface reference variable
		//This topcasting is valid but as per the hierarchy only 2 methods fe or fes can be accessed as those are the only 2 methods 
		//declaration in the SearchContext Interface 
		//valid topcasting but not recommended
		SearchContext driver=new ChromeDriver();
		//The following methods are not available
		//driver.getTitle()
		//driver.quit()
		//driver.close()
		
		//5.
		RemoteWebDriver driver=new ChromeDriver();//Recommended and valid
		driver=new FirefoxDriver();//this can also be done as FirefoxDriver is the child of RemoteWebDriver
		driver=new EdgeDriver();
		
		//All the methods of RemoteDriver can be accessed but not the individual methods of the ChromeDriver()
		//(there are no individual methods of the ChromeDriver())
		driver.getTitle();
		driver.getCurrentUrl();
		driver.get(null);
		driver.findElement(null);
		driver.findElements(null);
		
		//6.
		ChromiumDriver driver=new ChromeDriver();
		//Since Chromium is the parent of EdgeDriver and ChromeDriver, it will work only for Chrome n Edge browser
		//tomorrow if ff is required to used then the below statement is not proper as FirefoxDriver is not a child of ChromiumDriver
		ChromiumDriver driver=new FirefoxDriver();//not valid
		
		//SearchContext driver=new WebDriver();//Interface to interface topcasting cannot be done, cannot create object of an interface
		
		//7.Child class object can be referred by parent class Interface variable,
		//topcasting is valid, but not recommended
		//only the fe n fes method can be accessed as those are getting overrriden by the RWD
		//get(),getTitle() etc cant be used
		SearchContext driver=new RemoteWebDriver(remoteAddress, capabilities);
		driver.findElement(null);
		driver.findElements(null);
		
		//Of all the 7 topcasting option 
	}

}
