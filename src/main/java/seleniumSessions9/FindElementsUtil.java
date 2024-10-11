package seleniumSessions9;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//1.
public class FindElementsUtil {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
//		Instead of writing the FEs statement repeatedly, a FEs utility can be created like we created for the FE
//		driver.findElements(By.tagName("a"));
//		driver.findElements(By.tagName("a"));
//		driver.findElements(By.tagName("a"));
//		driver.findElements(By.tagName("a"));
		
		By links=By.tagName("a");
		By images=By.tagName("img");
		
		int imagesCount=getElementsCount(images);
		System.out.println(imagesCount);
		
		List<String> eleTextList=getElementsTextList(links);
		
		System.out.println(eleTextList.contains("About Us"));
		System.out.println(eleTextList.contains("Contact Us"));
		
		printElementsList(links);
		
		driver.quit();
	}
	
	public static int getElementsCount(By locator) {
		return getElements(locator).size();
	}
	
	
	public static List<WebElement> getElements(By locator){
		return driver.findElements(locator);
	}
	
	public static List<String> getElementsTextList(By locator){
		List<WebElement> elementsList=getElements(locator);
		List<String> elementsTextList=new ArrayList<String>();
		for(WebElement element:elementsList) {
			String elementText=element.getText();
			if(elementText.length()!=0) {
			elementsTextList.add(elementText);
			}
		}
		return elementsTextList;
	}
	
	public static void printElementsList(By locator) {
		List<String> elementsTextList=getElementsTextList(locator);
		for(String elementText:elementsTextList) {
			System.out.print(elementText+" ");
		}
		System.out.println();
	}
}
