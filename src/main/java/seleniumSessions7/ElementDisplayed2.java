package seleniumSessions7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//6.
public class ElementDisplayed2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php/?route=account/register");
		
		//Creation of WE+action
		boolean flag=driver.findElement(By.className("img-responsive111")).isDisplayed();
		//The Exception will be thrown while creating the WebElement and the program is terminated not during the action
		//Due to which the isDisplayed() is not executed
		//This code is not written properly
		
		System.out.println(flag);
		
		if(flag) {
			System.out.println("Logo is present");
		}else {
			System.out.println("Logo is not present");
		}
	}
}
