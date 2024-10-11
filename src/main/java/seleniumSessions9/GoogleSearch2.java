package seleniumSessions9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//3.
public class GoogleSearch2 {

	static WebDriver driver;
	
	//Interview Question:VV Important
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		By searchField=By.name("q");
		By suggestions=By.xpath("//ul/li//div[@class='wM6W7d']/span");
		
		doSearch(searchField, suggestions, "Naveen Automation Labs", "training");
	}
	
	public static WebElement getElement(By locator) {
		//the local driver will be used here(which is assigned in the constructor)
		return driver.findElement(locator);
	}
		
	public static void doClick(By locator) {
		getElement(locator).click();
	}
		
	//This method is overloaded, depending on the parameters passed the appropriate method will be invoked
	public static void doSendKeys(By locator,String value) {
		getElement(locator).sendKeys(value);
	}
		
	public static int getElementsCount(By locator) {
		return getElements(locator).size();
	}
	
	public static List<WebElement> getElements(By locator){
		return driver.findElements(locator);
	}
	
	
	public static void doSearch(By searchField,By suggestions,String searchTerm,String suggestionMatch ) {
		driver.findElement(searchField).sendKeys(searchTerm);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		List<WebElement>  suggestionElementList=driver.findElements(suggestions);
		System.out.println(suggestionElementList.size());
		
		for(WebElement element:suggestionElementList) {
			String searchText=element.getText();
			
			if(searchText.contains(suggestionMatch)) {
				element.click();
				break;
			}
		}
	}
}
