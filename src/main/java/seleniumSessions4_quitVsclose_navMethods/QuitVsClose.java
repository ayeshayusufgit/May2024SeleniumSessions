package seleniumSessions4_quitVsclose_navMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Case 1: quit() 
public class QuitVsClose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();//ChromeDriver: chrome on windows (e73cfee66d5ef1aa3e6966ddf6991e74) -- this is the SID
		//Everytime a new session will be created when a browser is launched
		
		//Enter the url
		driver.get("https://www.google.com");////ChromeDriver: chrome on windows (e73cfee66d5ef1aa3e6966ddf6991e74)
		
		//get the title
		String title=driver.getTitle();//ChromeDriver: chrome on windows (e73cfee66d5ef1aa3e6966ddf6991e74)
		System.out.println(title);
		
		//check actual vs expected:validation or checkpoint(Validation Steps)
		if(title.equals("Google")) {
			System.out.println("Correct title--Pass");
		}else {
			System.out.println("Incorrect title---Fail");
		}
		
		driver.quit();//ChromeDriver: chrome on windows (e73cfee66d5ef1aa3e6966ddf6991e74)
		//closes the browser, the session id becomes null
		
		
		System.out.println(driver.getTitle());//when the null session id is send to the server, it responds with an Exception as follows:
		//Exception in thread "main" org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
	}
}
