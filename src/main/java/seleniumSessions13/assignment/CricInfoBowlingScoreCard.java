package seleniumSessions13.assignment;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricInfoBowlingScoreCard {
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		driver=new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/the-hundred-men-s-competition-2024-1417778/manchester-originals-men-vs-oval-invincibles-men-18th-match-1417807/full-scorecard");
		driver.manage().window().maximize();
		
		
		System.out.println(getBowlerScoreCard("Fazalhaq Farooqi"));
		System.out.println(getBowlerScoreCard("Paul Walter"));
	}
	
	public static List<String> getBowlerScoreCard(String bowlerName){
		List<WebElement> scoreList=driver.findElements(By.xpath("//span[text()='"+bowlerName+"']/ancestor::td[@class='ds-flex ds-items-center']/following-sibling::td"));
		// combined scorecard xpath will be(as per naveen) =>	//span[text()='Paul Walter']/ancestor::td/following-sibling::td
		
		List<String> scoreCardList=new ArrayList<String>();
		
		for(WebElement score:scoreList) {
			String text=score.getText();
			scoreCardList.add(text);
		}
		
		return scoreCardList;
	}
}
