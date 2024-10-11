package seleniumSessions7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//4.
public class SendKeysWithDisableTextField {

	//Interview Question:
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");

		driver.findElement(By.id("pass")).sendKeys("ayesha");
		//Since the element is not interactable as its disabled, the user cannot enter any text in the Password(disable) field
		//The following Exception comes:
		//Exception in thread "main" org.openqa.selenium.ElementNotInteractableException: element not interactable
		
		//Will .click() work on the disabled element(above element)
		driver.findElement(By.id("pass")).click();//no exception but it wont even click
		
		
		 
		
		

	}

}
