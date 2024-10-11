package seleniumSessions13;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//2.
public class CricInfoScoreCardWebTable3 {
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver=new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/the-hundred-men-s-competition-2024-1417778/manchester-originals-men-vs-oval-invincibles-men-18th-match-1417807/full-scorecard");
		driver.manage().window().maximize();
		
		
		System.out.println(getWicketTakerName("Dawid Malan"));
		System.out.println(getWicketTakerName("Jordan Cox"));
		
		System.out.println(getPlayerScoreCard("Dawid Malan"));
		System.out.println(getPlayerScoreCard("Jordan Cox"));
	}
	
	public static List<String> getPlayerScoreCard(String playerName){
		List<WebElement> scoreList=driver.findElements(By.xpath("//span[text()='"+playerName+"']/ancestor::td/following-sibling::td[contains(@class,'ds-text-right')]"));
		List<String> scoreCardList=new ArrayList<String>();
		
		for(WebElement score:scoreList) {
			String text=score.getText();
			scoreCardList.add(text);
		}
		return scoreCardList;
	}
	
	public static String getWicketTakerName(String playerName) {
		return driver.findElement(By.xpath("//span[text()='"+playerName+"']/ancestor::td/following-sibling::td/span")).getText();
	}
}

//Revision of xpath axis

//parent to direct child:/
//parent to indirect child://
//form[@id='hs-login']//child::input[@id='username']  ->	https://app.hubspot.com/login

//child to parent:parent:: or /..
//child to ancestor:ancestor:: or ../..

//To traverse to the siblings
//preceding-sibling:	preceding-sibling
//following-sibling: 	following-sibling
//to 