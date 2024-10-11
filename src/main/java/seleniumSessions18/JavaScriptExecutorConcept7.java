package seleniumSessions18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept7 {
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://classic.crmpro.com/");

		JavascriptUtil jsUtil=new JavascriptUtil(driver);
		WebElement element=driver.findElement(By.xpath("//h3[text()='Reports']"));
		//jsUtil.scrollIntoView(element);
		WebElement element2=driver.findElement(By.linkText("Forgot Password?"));
		//jsUtil.scrollIntoView(element2);
		
		//"element" is the parameter passed to the drawBorder method
		//"element" will be the 0th argument
		//"element" is the argument[0] which will have a red border of thickness 3px 
		jsUtil.drawBorder(element);
		
		
	}
}
