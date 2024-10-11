package seleniumSessions7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//5.
public class ElementDisplayed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php/?route=account/register");
		
		//This class is uniquely available in the Login Page so can be used as follows:
		boolean flag=driver.findElement(By.className("img-responsive")).isDisplayed();
		System.out.println(flag);
		
		if(flag) {
			System.out.println("Logo is present");
		}else {
			System.out.println("Logo is not present");
		}
	}
}
