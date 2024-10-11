package seleniumSessions;

import javax.print.attribute.standard.Chromaticity;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Automation Steps
		
		
		//1.Open Edge browser
		//To launch the EdgeDriver browser, FirefoxDriver line needs to be commented and the EdgeDriver line needs to be added
		//ChromeDriver driver=new ChromeDriver();
		//FirefoxDriver driver=new FirefoxDriver();
		EdgeDriver driver=new EdgeDriver();
		
		//will the url(get(URL)) be launched  wo the https protocol?
		//It results in an InvalidArgumentException, the http or https has to be passed while launching the application
		
		//2.enter url
		driver.get("https://www.google.com");
		
		//Can the application be launched wo the www?
		 //The application is launched wo the www
		
		//3.get the title
		String title=driver.getTitle();
		System.out.println(title);//o/p=> Google
		
		//4.check actual vs expected:validation or checkpoint(Validation Steps)
		if(title.equals("Google")) {
			System.out.println("Correct title--Pass");
		}else {
			System.out.println("Incorrect title---Fail");
		}
		
		//Automation Steps + validation point ==>	Automation testing
		
		//5.close the browser
		driver.quit();
		
		//This will be called a testcase
		
		
		
		

	}

}
