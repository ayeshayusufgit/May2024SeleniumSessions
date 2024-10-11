package seleniumSessions8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//2.
public class TotalImages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		List<WebElement> imagesList=driver.findElements(By.tagName("img"));
		int imagesCount=imagesList.size();
		
		System.out.println("Total Images:"+imagesCount);
		
		for(WebElement element:imagesList) {
			String imageSrcValue=element.getAttribute("src");
			System.out.println(imageSrcValue);
		}
		
		//Capture all the links 
		//Print the link text and href values
		List<WebElement> linksList=driver.findElements(By.tagName("a"));
		
		int linksCount=linksList.size();
		System.out.println("Total Links:"+linksCount);
		
		for(WebElement element:linksList) {
			String text=element.getText();
			String hrefVal=element.getAttribute("href");
			System.out.println(text+" : "+hrefVal);
		}
		
		//Getting the important text from a WebPage is called Scrapping
		//The data can be dumped into a file(excel,text etc) and given to a developer
		//Amazon can scrape all the prices from the Flipkart's site and do a price manipulation at their end
		//if flipkart is selling a MAc book for $1000, amazon can scrape this data from flipkart and price the same product at a lower cost ie $950
		//Thus amazon is attracting customers at their end
		
		driver.quit();
	}
}
