package seleniumSessions8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//1.
public class MultipleElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//To handle single element -- findElement is used -- returns WebElement
		
		//To handle multiple elements -- findElements is used -- returns List<WebElement>
		//FEs are used as below:
		//To capture all the links in a Web Page
		//To capture 10 text fields in a Web Page
		//To capture images in a Web Page
		//To capture all the options in the country dropdown
		
		
		//Interview Question:Give the total number of links on a page,print the text of each link and ignore the blank links?
		
		//To get the total links and extract/print only the text from these links
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		List<WebElement> linksList=driver.findElements(By.tagName("a"));
		
		int totalLinks=linksList.size();
		System.out.println("Total Links:"+totalLinks);
		
		//Using the index based for--loop
		for(int i=0;i<totalLinks;i++) {
			String text=linksList.get(i).getText();
			if(text.length()!=0) {
			System.out.println(i+":"+text);
			}
		}
		
		System.out.println("================================================================");
		
		//Using the for--each loop
		int count=0;
		for(WebElement element:linksList) {
			String text=element.getText();
			if(text.length()!=0) {
			System.out.println(count+":"+text);
			}
			count++;
		}
		driver.quit();
		
		//write a program to find out the total links with blank text and with some text
		
	}
}
