package seleniumSessions4_quitVsclose_navMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Case 2:close()
public class QuitVsClose2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();//ChromeDriver: chrome on windows (24d430190df2fcaf8648ae8f81483c73) -- this is the SID
		//Everytime a new session will be created when a browser is launched
		
		//Enter the url
		driver.get("https://www.google.com");//ChromeDriver: chrome on windows (24d430190df2fcaf8648ae8f81483c73)
		
		//get the title
		String title=driver.getTitle();//ChromeDriver: chrome on windows (24d430190df2fcaf8648ae8f81483c73)
		System.out.println(title);
		
		//check actual vs expected:validation or checkpoint(Validation Steps)
		if(title.equals("Google")) {
			System.out.println("Correct title--Pass");
		}else {
			System.out.println("Incorrect title---Fail");
		}
		
		driver.close();//ChromeDriver: chrome on windows (24d430190df2fcaf8648ae8f81483c73)
		//closes the browser and the session id becomes invalid
		
		
		System.out.println(driver.getTitle());//when the invalid session id is send to the server, it responds with an Exception as follows 
		//Exception in thread "main" org.openqa.selenium.NoSuchSessionException: invalid session id
	}
}
