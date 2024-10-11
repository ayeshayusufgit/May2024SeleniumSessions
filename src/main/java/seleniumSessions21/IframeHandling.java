package seleniumSessions21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//2.
public class IframeHandling {
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//page
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");//page
		
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("div#imageTemplateContainer img")).click();
		
		driver.findElement(By.id("RESULT_TextField-1")).sendKeys("Naveen Automation");
		//This results in an Exception ie NoSuchElementException
		//As the textfield is within a frame
		
	}

	//Difference between a frame and iframe?
	//	https://in.images.search.yahoo.com/search/images;_ylt=Awrx.c6JBdRmhQQAobe7HAx.;_ylu=Y29sbwNzZzMEcG9zAzEEdnRpZAMEc2VjA3BpdnM-?p=difference+between+a+frame+and+iframe&fr2=piv-web&type=E210IN826G0&fr=mcafee#id=1&iurl=https%3A%2F%2Fi.ytimg.com%2Fvi%2Fnsq8Y0S9NiM%2Fmaxresdefault.jpg&action=click
	
	//1.
	//Frame is always within a frameset, also there can be multiple frames in a frameset
	//iFrame is always standalone
	
	//2.
	//uses the <frameset> and <frame> tags 
	//uses only the <iframe> tag
	
	
	
}
