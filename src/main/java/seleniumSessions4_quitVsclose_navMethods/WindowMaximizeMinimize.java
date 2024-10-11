package seleniumSessions4_quitVsclose_navMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowMaximizeMinimize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		//When the browser is launched, the window is small, the window can be maximized as follows:
		
		driver.manage().window().maximize();
		//when the window is maximized all the elements in the page are properly visible to the user, maximize is preferred
		
		driver.get("https://www.google.com");
		
		driver.quit();

	}

}
