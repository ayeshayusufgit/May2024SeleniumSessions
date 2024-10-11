package seleniumSessions5_webelement_bylocator_sendkeys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import seleniumSessions3_topcasting.BrowserUtil;

public class LoginPageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BrowserUtil brUtil=new BrowserUtil();
		WebDriver driver=brUtil.initDriver("chrome");//this can be tested with firefox also
		
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php/?route=account/login");
		System.out.println(brUtil.getPageTitle());
		
		By emailId=By.id("input-email");
		By passwordId=By.id("input-password");
		
		ElementUtil eUtil=new ElementUtil(driver);
		eUtil.doSendKeys(emailId, "test@gmail.com");
		eUtil.doSendKeys(passwordId, "test123");
		
		brUtil.quitBrowser();
	}
}
