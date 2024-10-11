package seleniumSessions10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//2.
public class CheckElementIsPresent {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By logo=By.className("img-responsive");
		
		int count=driver.findElements(logo).size();
		
		if(count==1) {
			System.out.println("The logo is present");
		}else {
			System.out.println("The logo is not present");
		}
		
	}
}
