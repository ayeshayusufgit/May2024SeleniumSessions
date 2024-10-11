package seleniumSessions4_quitVsclose_navMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowMaximizeMinimize3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();

		driver.manage().window().minimize();//when the page is minimized then the page has to be maximized
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		//viewport -- window size
		//or
		//responsive testing
		//In this different window size is supplied and the behavior of the application is checked
		
	}
}
