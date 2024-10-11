package seleniumSessions4_quitVsclose_navMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowMaximizeMinimize2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		//When the browser is launched, the window is small, the window can be maximized as follows:
		
		driver.manage().window().fullscreen();//this will try to adjust the browser as per the screen size
		
		driver.get("https://www.google.com");
		
		//driver.quit();

	}

}
