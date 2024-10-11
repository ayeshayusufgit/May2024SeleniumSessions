package seleniumSessions8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//4.
public class FetchTextFieldValue {

	//Interview Question:Get the value of the email entered in a textfield?
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//		WebDriver driver=new ChromeDriver();
		//		driver.manage().window().maximize();
		//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		//All the textfields have the same class name form-control
		//The look and field of all the text fields are the same
		//The width,height, colour, borders, rounded edges are coming because of the form-control class
		//The UI Developer will develop a common class which will be applied to all the textfields on the Registration PAge
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		driver.findElement(By.id("input-email")).sendKeys("naveen@gmail.com");

		//This wont work to get the value of the text entered in the email field
		//String text=driver.findElement(By.id("input-email")).getText();
		//System.out.println(text);
	
		//There is a attribute called "value" in the <input> html tag, which can be accessed using getAttribute();
		//the html tag has to be input and the attribute "value", sometimes "value" attribute is hidden
		//<input type="text" name="email" value="" placeholder="E-Mail Address" id="input-email" class="form-control" fdprocessedid="6mf6da">
	
		String value=driver.findElement(By.id("input-email")).getAttribute("value");
		System.out.println(value);
		
		//Realtime Usecase:
		//Goto a Registration Page
		//On entering the telephone number, Example if we enter 20 digit number
		//In some applications it accepts 20 digits and in some it trims the extra digits(10 digits in this case)
		//We need to check what we enter is accepted
		//The application is accepting the data or not
		//This can be done if the "value" attribute is available
		
	}

}
