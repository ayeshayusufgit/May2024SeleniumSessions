package seleniumSessions9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import seleniumSessions3_topcasting.FrameworkException;

//4.
public class GoogleSearch3 {

	static WebDriver driver;
	
	//Interview Question:VV Important
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		By searchField=By.name("q");
		By suggestions=By.xpath("//ul/li//div[@class='wM6W7d']/span");
		
		//doSearch(searchField, suggestions, "Naveen Automation Labs", "training");
		doSearch(searchField, suggestions, "Selenium", "python");
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
		doSendKeys(searchField, searchTerm);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		List<WebElement>  suggestionElementList=getElements(suggestions);
		int totalSuggestionsCount=suggestionElementList.size();
		
		System.out.println("Total number of suggestions:"+totalSuggestionsCount);
		
		if(totalSuggestionsCount==0) {
			System.out.println("There are no suggestions");
			throw new FrameworkException("No Suggestions Found");
		}
		
		for(WebElement element:suggestionElementList) {
			String searchText=element.getText();
			
			if(searchText.contains(suggestionMatch)) {
				element.click();
				break;
			}
		}
	}
}
