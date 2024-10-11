package seleniumSessions18;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//1.
public class JavaScriptExecutorConcept5 {
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://classic.crmpro.com/");

		JavascriptUtil jsUtil=new JavascriptUtil(driver);
		String pageText=jsUtil.getPageInnerText();
		System.out.println(pageText);
		
		//very useful in the content testing, getPageInnerText() can be used
		if(pageText.contains("Company & Contacts")) {
			System.out.println("Pass");
		}
		
		//Interview Question:How to go back,forward in a browser and refresh a page w/o using the Selenium methods?
		//go back using js=>history.go(-1);
		//go forward using js=>histore.go(1);
		//refresh a page using js=>history.go(0);
		//If the Selenium back,forward and refresh methods are not working then these can be used
	}
}
