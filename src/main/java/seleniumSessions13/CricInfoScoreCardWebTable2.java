package seleniumSessions13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//2.
public class CricInfoScoreCardWebTable2 {
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver=new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/the-hundred-men-s-competition-2024-1417778/manchester-originals-men-vs-oval-invincibles-men-18th-match-1417807/full-scorecard");
		driver.manage().window().maximize();
		
		System.out.println(getWicketTakerName("Dawid Malan"));
		System.out.println(getWicketTakerName("Jordan Cox"));
		
		List<WebElement> scoreList=driver.findElements(By.xpath("//span[text()='Dawid Malan']/ancestor::td/following-sibling::td[contains(@class,'ds-text-right')]"));
		for(WebElement score:scoreList) {
			System.out.print(score.getText()+" ");
		}
		System.out.println();
	}
	
	
	public static String getWicketTakerName(String batsmanName) {
		return driver.findElement(By.xpath("//span[text()='"+batsmanName+"']/ancestor::td/following-sibling::td/span")).getText();
	}
}
