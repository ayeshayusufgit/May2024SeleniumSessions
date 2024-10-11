package seleniumSessions21.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//2.
public class IframeHandling2 {
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
		driver.findElement(By.id("RESULT_TextField-3")).sendKeys("Bangalore");
		driver.findElement(By.id("RESULT_TextField-4")).sendKeys("05/10/2024");
		driver.findElement(By.id("RESULT_TextArea-5")).sendKeys("Description");
		driver.findElement(By.id("RESULT_FileUpload-6")).sendKeys("C:\\Users\\ayesh\\OneDrive\\Desktop\\accessspecifierscope.png");
		driver.findElement(By.id("RESULT_TextField-8")).sendKeys("Alisha");
		driver.findElement(By.id("RESULT_TextField-9")).sendKeys("Chinai");
		driver.findElement(By.id("RESULT_TextField-10")).sendKeys("Street Address");
		driver.findElement(By.id("RESULT_TextField-11")).sendKeys("Address Line1");
		driver.findElement(By.id("RESULT_TextField-12")).sendKeys("Bangalore");
		
		WebElement ddCountryElement=driver.findElement(By.id("RESULT_RadioButton-13"));
		Select countryDD=new Select(ddCountryElement);
		countryDD.selectByVisibleText("Hawaii");
		
		driver.findElement(By.id("RESULT_TextField-14")).sendKeys("560008");
		driver.findElement(By.id("RESULT_TextField-15")).sendKeys("9999999999");
		driver.findElement(By.id("RESULT_TextField-16")).sendKeys("test1f@gmail.com");
		driver.findElement(By.id("FSsubmit")).click();
		
		
	}

	
	
	
	
}
