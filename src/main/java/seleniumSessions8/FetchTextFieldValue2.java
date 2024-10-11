package seleniumSessions8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//5.
public class FetchTextFieldValue2 {

	//Interview Question:Get the value of the email entered in a textfield?
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://thinking-tester-contact-list.herokuapp.com/");
		driver.findElement(By.id("email")).sendKeys("naveen@gmail.com");
		driver.findElement(By.id("password")).sendKeys("naveen@123");
		
		//The "value" attribute is not available as it is hidden
		//The element after the email is entered:
		//<input id="email" placeholder="Email" fdprocessedid="juwv2n">
		
		String email=driver.findElement(By.id("email")).getAttribute("value");
		String password=driver.findElement(By.id("password")).getAttribute("value");
		
		//Once the text is entered in the text field then it is stored in the "value" attribute, using the "value" attribute the value entered can be retrieved
		//works only for input text fields and not dropdowns
		
		System.out.println("Email Entered:"+email);
		System.out.println("Password Entered:"+password);
	}
}
