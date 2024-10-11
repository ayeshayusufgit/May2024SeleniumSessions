package seleniumSessions8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//3.
public class TotalTextFields {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		List<WebElement> textFieldList=driver.findElements(By.className("form-control"));//To get all the text fields in the Register Page
		int textFieldCount=textFieldList.size();
	
		for(WebElement element:textFieldList) {
			String placeHolderText=element.getAttribute("placeHolder");
			System.out.println(placeHolderText);
		}
		driver.quit();
	}
}
