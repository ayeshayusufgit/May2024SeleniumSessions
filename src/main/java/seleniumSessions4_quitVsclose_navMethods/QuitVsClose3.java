package seleniumSessions4_quitVsclose_navMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Case 2:close()
public class QuitVsClose3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();//sid=123
		
		//Enter the url
		driver.get("https://www.google.com");//sid=123
		
		//get the title
		String title=driver.getTitle();//sid=123
		System.out.println(title);
		
		//check actual vs expected:validation or checkpoint(Validation Steps)
		if(title.equals("Google")) {
			System.out.println("Correct title--Pass");
		}else {
			System.out.println("Incorrect title---Fail");
		}
		
		driver.quit();//quits the browser, sid=123
		//sid=123 becomes null after using quit()
		
		//driver.close();//closes the browser, sid=123
		//sid=123 becomes invalid after using close()
		
		//The browser will be opened 2 times, once in the beginning and one after quit() or close() 
		driver=new ChromeDriver();//a new session id will be created, sid=456
		//The same sid related functionality will be maintained for all browsers
		
		driver.get("https://www.google.com");//a new session id will be created ie sid=456
		
		System.out.println(driver.getTitle());//sid=456
	}
}
