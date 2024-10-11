package seleniumSession27.UITests.assignment;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import seleniumSession27.assignment.base.BaseTest;

public class RegistrationPageTest extends BaseTest {
	
	@Test
	public void registrationTest() {
		driver.findElement(By.id("input-firstname")).sendKeys("Ayesha");
		driver.findElement(By.id("input-lastname")).sendKeys("Yusuf");
		driver.findElement(By.id("input-email")).sendKeys("test@abc99.com");
		driver.findElement(By.id("input-telephone")).sendKeys("9999999999");
		driver.findElement(By.id("input-password")).sendKeys("test@123");
		driver.findElement(By.id("input-confirm")).sendKeys("test@123");
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.cssSelector(".btn.btn-primary")).click();
		String actHeaderText=driver.findElement(By.xpath("//div[@id='content']//h1")).getText();
		Assert.assertEquals(actHeaderText, "Your Account Has Been Created!");
	}

}
