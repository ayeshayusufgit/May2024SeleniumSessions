package seleniumSessions7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//3.
public class SendKeysWithCharSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php/?route=account/login");
		
		String name="Naveen";
		StringBuilder sb=new StringBuilder("Automation");
		StringBuffer sf=new StringBuffer("Labs");
		String lastName=null;

		//driver.findElement(By.id("input-email")).sendKeys(name,sb,sf);//sendKeys() wont only works on String but on StringBuilder and StringBuffer
		//sendKeys(CharSequence..keysToSend) , the CharSequence works on String, StringBuffer and StringBuilder and on comma separated arrays   
		
		//driver.findElement(By.id("input-email")).sendKeys(name," ",sb," ",sf);
		
		driver.findElement(By.id("input-email")).sendKeys(name," ",sb," ",sf,"Selenium",lastName);//if any one of the String is null, IllegalArgumentException is thrown
		
		//Can an array of characters be supplied?
		//No, but if converted into Strings then can be supplied
		
		//sendKeys(CharSequence... keysToSend); 
		//CharSequence is an interface available in java
		//	...(3 dots) behaves like an array
		//There are 3 classes implementing this interface are as follows:
		//1.String
		//2.StringBuffer 
		//3.StringBuilder
		
		
		String hostname="http://www.naveen.com";
		String port="8080";
		String param="/index.html";
		
		//Example of sendkeys using CharSequence overloaded method
		driver.findElement(By.id("input-email")).sendKeys(hostname,port,param);
		
		
		
		
	}

}
