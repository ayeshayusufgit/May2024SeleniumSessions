package seleniumSessions9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//2.
public class GoogleSearch {

	static WebDriver driver;
	
	//Interview Question:VV Important
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Naveen Automation Labs");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		List<WebElement>  searchOptionsElementList=driver.findElements(By.xpath("//ul/li//div[@class='wM6W7d']/span"));
		for(WebElement element:searchOptionsElementList) {
			String searchText=element.getText();
			//System.out.println(searchText);
			if(searchText.contains("training")) {
				element.click();
				break;
			}
		}	
	}
}
