package seleniumSessions14;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes {

	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//	normalize-space() 
		
		//	https://naveenautomationlabs.com/opencart/index.php?route=account/register
		
		//	//label[text()='Yes'] or //label[text()=' Yes'] or //label[contains(text(),'Yes')] 
		//  wont work as there is a space based test 'Yes', due to which if normalize-space()
		//	is used, the spaces are normalized. This function is used only for text based 
		//	elements.
		
		//	Example:
		//	//label[normalize-space()='No']
		//	//label[normalize-space()='Yes']
		
		driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();
		
		
		//parent to direct child	https://app.hubspot.com/login
		//form[@id='hs-login']//input[@id='username']
		
		//form[@id='hs-login']/div	-> 8 elements(direct child elements)
		//form[@id='hs-login']//div	-> 23 elements(direct+indirect child elements)	-> descendant child elements
		
		//	descendant
		//select[@id='Form_getForm_Country']/descendant::option	->	https://orangehrm.com/30-day-free-trial
		//	or
		//select[@id='Form_getForm_Country']//option
		
		//Under the countries dropdown the direct and indirect child(options) are the same 
		//There are only direct options and no indirect children
		//select[@id='Form_getForm_Country']/option -- direct children(233) = 233
		//select[@id='Form_getForm_Country']//option -- direct children(233) + indirect children(0) = 233
		
		//moving from child to parent:https://app.hubspot.com/login
		//when we are traversing from the child to the parent, its called backward traversing in the DOM
		//input[@id='username']/../../../../../../../../../../../..
		
		
		// Immediate parent:
		//a)	->		//input[@id='username']/..
		
		//b)	->		//input[@id='username']/parent::div  --> this is preferred as its more readable
		//	parent tag is for the immediate parent
		
		// Grand parent(using ancestor tag) ->	//input[@id='username']/ancestor::form
		
		//	traversing from child to ancestor, url	->	https://naveenautomationlabs.com/opencart/index.php?route=account/register
		//input[@id='input-firstname']/ancestor::form -> 5 grandparents are there
		//input[@id='input-firstname']/ancestor::div[@id='content']	-> 1 grandparent is there
		
		//url	->	https://naveenautomationlabs.com/opencart/index.php?route=account/login
		//	following:capture all the input tags in the forward direction
		//input[@id='input-email']/following::input 	-> 3 elements

		//	preceding:capture all the input tags in the backward direction
		//input[@id='input-password']/preceding::input 		->	4 elements
		//input[@id='input-password']/preceding::input[@id='input-email']	->	1 element
		
		//	url	->	https://naveenautomationlabs.com/opencart/index.php?route=account/login
		//input[@id='input-email']/preceding-sibling::label -> 1 element(this is preferred)
		//input[@id='input-email']/preceding::label	-> 1 element
		
			
		// url	->	https://selectorshub.com/xpath-practice-page/
		//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='checkbox']
		driver.findElement(By.xpath("//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
		
		//a[text()='Jasmine.Morgan']/parent::td/preceding-sibling::td/input[@type='checkbox']
		driver.findElement(By.xpath("//a[text()='Jasmine.Morgan']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
	
		
		// url ->	https://naveenautomationlabs.com/opencart/index.php?route=account/register
		//input[@id='input-firstname']
		//Suppose there are 100 elements in the DOM and 20 elements are input, so the input elements will be searched with @id='input-firstname'
			    
		//*[@id='input-firstname']
		//Suppose there are 100 elements in the DOM,  all the elements will be searched for @id='input-firstname'. * is avoided 

		//==========================================
		
		selectUser("Joe.Root");
		selectUser("Jasmine.Morgan");
		
		System.out.println(getUserDetails("Joe.Root"));
		System.out.println(getUserDetails("Jasmine.Morgan"));
	}
	
	//fetching the user details of the user:User role, Employee name and Status
	public static List<String> getUserDetails(String userName){
		List<WebElement> userDetailsElementsList=driver.findElements(By.xpath("//a[text()='"+userName+"']/parent::td/following-sibling::td"));
		List<String> userDetailsList=new ArrayList<String>();
		
		for(WebElement user:userDetailsElementsList) {
			String text=user.getText();
			userDetailsList.add(text);
		}
		return userDetailsList;
	}
	
	//click on the selected user 
	public static void selectUser(String userName) {
		driver.findElement(By.xpath("//a[text()='"+userName+"']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
		
		//	any one of the below xpaths can be used
		//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='checkbox']
		//or
		//a[text()='Joe.Root']/ancestor::tr//input[@type='checkbox']
	}

}
