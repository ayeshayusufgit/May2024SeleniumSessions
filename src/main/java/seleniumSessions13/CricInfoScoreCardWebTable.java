package seleniumSessions13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//2.
public class CricInfoScoreCardWebTable {
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver=new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/the-hundred-men-s-competition-2024-1417778/manchester-originals-men-vs-oval-invincibles-men-18th-match-1417807/full-scorecard");
		driver.manage().window().maximize();
		
		String wicketTakerName=driver.findElement(By.xpath("//span[text()='Dawid Malan']/ancestor::td/following-sibling::td/span")).getText();
		System.out.println(wicketTakerName);
	}
}
