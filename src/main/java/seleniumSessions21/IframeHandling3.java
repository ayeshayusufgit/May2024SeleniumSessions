package seleniumSessions21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//2.
public class IframeHandling3 {
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//page
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");//page
		
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("div#imageTemplateContainer img")).click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));
		
		driver.findElement(By.id("RESULT_TextField-1")).sendKeys("Naveen Automation");
		
		//need to come out of iframe, or come to main page:
		driver.switchTo().defaultContent();
		
		String header=driver.findElement(By.xpath("h3.details__form-preview-title")).getText();
		System.out.println(header); 
	}
}
