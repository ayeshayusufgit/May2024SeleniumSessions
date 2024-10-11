package seleniumSessions15.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;


public class PrivacyPolicyLinkCheck {
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement ppTextElement=driver.findElement(By.xpath("//div[@class='pull-right' and contains(text(),'I have read and agree to the ')]"));
		//WE1
		
		WebElement continueButton=driver.findElement(By.xpath("//input[@value='Continue']"));
		//WE2
		
		WebElement privacyPolicyLink=driver.findElement(By.linkText("Privacy Policy"));
		//WE3
		
		//String ppText=driver.findElement(with(By.xpath("//div[@class='pull-right']")).toRightOf(privacyPolicyLink).toRightOf(checkbox).toRightOf(continueButton)).getText().trim();
		
		
		String ppText=driver.findElement(with(By.tagName("div")).toLeftOf(ppTextElement).toLeftOf(continueButton).toLeftOf(privacyPolicyLink)).getText().trim();
		
		if(ppText.equals("I have read and agree to the ")) {
			System.out.println("Privacy Policy text is as expected");
		}else {
			System.out.println("Privacy Policy text is not as expected");
		}
	}

}
