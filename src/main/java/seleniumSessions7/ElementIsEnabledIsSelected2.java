package seleniumSessions7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//11.
public class ElementIsEnabledIsSelected2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		boolean t1=driver.findElement(By.name("agree")).isSelected();//html input: checkbox, dropdown, radio button
		//Determine whether this element is selected or not. This operation only applies to input elements such as checkboxes, 
		//options in a select and radio buttons.
		System.out.println(t1);//false
		
		driver.findElement(By.name("agree")).click();
		
		boolean t2=driver.findElement(By.name("agree")).isSelected();
		System.out.println(t2);//true
		
		driver.quit();
	}
}
