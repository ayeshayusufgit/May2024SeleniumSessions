package seleniumSessions18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept8 {
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.hubspot.com/login");

		JavascriptUtil jsUtil=new JavascriptUtil(driver);

		WebElement loginForm = driver.findElement(By.id("hs-login"));
		WebElement emailId = driver.findElement(By.id("username"));

		jsUtil.drawBorder(loginForm);
		jsUtil.drawBorder(emailId);
	}
}
