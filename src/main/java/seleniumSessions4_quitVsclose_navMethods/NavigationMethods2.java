package seleniumSessions4_quitVsclose_navMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Do we have any support for back and forward browser simulation
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());//google
		
		Thread.sleep(1000);
		
		//driver.navigate().to("https://www.amazon.com");
		driver.get("https://www.amazon.com");
		System.out.println(driver.getTitle());//amazon
		
		Thread.sleep(1000);
		
		driver.navigate().back();//google
		System.out.println(driver.getTitle());
		
		Thread.sleep(1000);
		
		driver.navigate().forward();//amazon
		System.out.println(driver.getTitle());
		
		//driver.quit();
		
		
		//difference between driver.get(url) n driver.navigate().to()
		//both the methods are exactly the same only the method names are different or both the methods are synonyms
		//the back() and forward() also can be done when only get(url) is used
		//driver.get(url) is easier to write
		
		
		
		
	}

}
