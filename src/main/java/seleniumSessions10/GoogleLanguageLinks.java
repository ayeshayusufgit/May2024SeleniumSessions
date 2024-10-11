package seleniumSessions10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//1.
public class GoogleLanguageLinks {
	static WebDriver driver;
	//Interview Question: From a specific area fetch the google language links?
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		List<WebElement> langLinkList=driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		System.out.println(langLinkList.size());
		
		for(WebElement element:langLinkList) {
			String language=element.getText();
			System.out.println(language);
			
			if(language.contains("मराठी")) {
				element.click();
				break;
			}
		}
	}
}
