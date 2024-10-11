package seleniumSessions7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//10.
public class ElementIsEnabledIsSelected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");

		boolean f1=driver.findElement(By.id("fname")).isDisplayed();//true
		System.out.println(f1);
		
		boolean f2=driver.findElement(By.id("fname")).isEnabled();//true
		System.out.println(f2);
		
		boolean f3=driver.findElement(By.id("pass")).isEnabled();//disabled element:false
		System.out.println(f3);		
		
		boolean f4=driver.findElement(By.id("pass")).isDisplayed();//true
		System.out.println(f4);
		
		driver.quit();
		
	}
}
