package seleniumSessions10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//4.
public class ElementExceptionWithFEAndFEs {
	static WebDriver driver;
	
	//Interview:Difference between FE andFEs?
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By logo=By.className("img-responsive1");
		
		//driver.findElement(logo).click();//throws a NSE if the element is not found
		
		List<WebElement> logoList=driver.findElements(logo);//returns an empty list(of size 0) if the element is not found
		System.out.println(logoList.size());// returns 0	
	}
}
