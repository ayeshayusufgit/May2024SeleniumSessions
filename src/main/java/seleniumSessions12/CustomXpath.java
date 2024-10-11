package seleniumSessions12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {
	static WebDriver driver;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.hubspot.com/login");
		

		//xpath:is the address of the element in the html DOM
		//DOM: is represented in the form of 
		
		//There are 2 types of xpaths:
		
		//1.absolute xpath:
		//first start from the root element ie <html> tag
		//then to the <body> tag 
		//then to  the other elements and finally to the Login input button
		///html/body/div[2]/div/div/div/div[2]/div/form/input
		//if there is any change in the hierarchy of the element the xpath wont work
		//They take a longer time when compared to relative xpaths
		//These xpaths are very fragile and are not recommended
		//These xpaths start with / single forward slash
		
		//2.relative(custom) xpath:
		//there xpaths are using some relatives attributes of the element like id or class or name or type or text
		//These xpaths start with // double forward slash
		//Pros: these xpaths are robust
		
		//html[@attr='value']
		//input[@id='input-email']-->gives 1 element
		//or
		//input[@name='email'] --> gives 1 element
		
		//input[@name='email'] --> gives 2 elements
		
		//tag[@attr1='value' and @attr2='value'] 
		//input[@name='email'] --> gives 1
		//input[@name='email' and @id='input-email'] --> gives 1
		//input[@name='email' and @id='input-email' and @type='text'] --> gives 1
		//input[@name='email' and @id='input-email' and @type='text' and @placeholder='E-Mail Address'] --> gives 1
		
		//input[@type='text' and @name='email']
		
		//input[@type='text' or @name='password']
		
		//text():this is a function in xpath
		//htmltag[text()='value']
		
		//a[text()='Register'] gives 2 elements
		//h2[text()='New Customer'] gives 1 element
		//label[text()='E-Mail Address'] gives 1 element
		
		
		//To find the total number of links in a page - Interview Question	=>	//a
		//Total input fields in a page => //input
		//Total number of images in a page => //img
		//Total number of h1 tags in a page => //h1
		//Total number of links with href properties => //a[@href]
		
		// amazon
		//a	=>	364 elements 
		//a[@href]	=>	355 elements (to get links having the href attributes)
		//a[not(@href)] => 4 elements (to get links which do not have the href attributes)
		
		//https://naveenautomationlabs.com/opencart/index.php?route=account/register
		//input[@id]
		
		//both are the same(links on a page)
		//		driver.findElements(By.xpath("//a"));
		//		driver.findElements(By.tagName("a"));
		
		//links having href attributes(below):
		//		driver.findElements(By.xpath("//a[@href]"));
		
		//Cannot be done with By.tagName
		//		driver.findElements(By.tagName("a"));
		
		//	contains():
		//htmlTag[contains(@attr,'value')]
		//htmlTag[contains(@attr1,'value1') and (contains(@attr2,'value2')]
		
		//input[contains(@id,'firstname')]
		//input[contains(@id,'firstname') and contains(@placeholder,'First')]
		//input[contains(@id,'firstname') and @placeholder='First Name']
		//input[@placeholder='First Name' and contains(@id,'firstname')]
		//input[@placeholder='First Name' and contains(@id,'firstname') and @type='text']
		
		// contains() with text():
		//htmltag[contains(text(),'value')]
		
		//	https://naveenautomationlabs.com/opencart/index.php?route=account/register
		//h1[contains(text(),'Register')]
		//legend[contains(text(),'Personal')]
		//p[contains(text(),'creating an account')] using partial text to search from a paragraph
		
		//dynamic IDs/attributes
		//input[@id='firstname_123']
		//input[@id='firstname_456']		
		//input[@id='firstname_789']
		
		//input[contains(@id,'firstname_')]
		
		//	<span type='text'>your transaction id is 123</span>
		By mesg=By.xpath("//span[contains(text(),'your transaction id is')]");
		String transactionText=driver.findElement(mesg).getText();
		
		//contains() with attribute and no contains with text():
		//htmltag[contains(@attr,'value') and text()='value']
		
		//contains() with attribute and contains with text():
		//htmltag[contains(@attr,'value') and contains(text(),'value')]
		//a[contains(@href,'/wishlist') and contains(text(),'Wish List')]

		//==============
		
		//	starts-with():should start with the string
		//htmltag[starts-with(@attr,'value')]
		
		//https://naveenautomationlabs.com/opencart/index.php?route=account/register
		//input[starts-with(@placeholder,'first')] ==> gives 1 element
		//input[starts-with(@placeholder,'Name')] ==> doesnt work
		
		//h1[starts-with(text(),'Register')]
		//h1[starts-with(text(),'Account')] ==> doesnt work
		//h1[contains(text(),'Account')] ==> works
		
		//	ends-with():should end with the string
		// this function is deprecated(Not available)
		
		// class:
		//Only one class name should be used
		//driver.findElement(By.className("form-control private-form__control login-email")).sendKeys("test@gmail.com");
		//Compund class wont work in By.className("...") , reults in an Exception ie InvalidSelectorException
		
		//	https://app.hubspot.com/login
	
		//driver.findElement(By.xpath("//input[@class='form-control private-form__control login-email']")).sendKeys("test@gmail.com");
		//valid
		
		//driver.findElement(By.xpath("//input[contains(@class,'login-email')]")).sendKeys("test@gmail.com");
		//valid
		
		//driver.findElement(By.className("login-email")).sendKeys("test@gmail.com");
		//valid
		
		//driver.findElement(By.xpath("//input[@@@@id,testing/test]/option")).sendKeys("test@gmail.com");
		//the xpath format is wrong which results in an Exception(if the locator syntax is invalid)
		//this exception comes even when the css syntax is also invalid
		//InvalidSelectorException:Invalid Selector
		
		//If the xpath is correct but Selenium is not able to find the locator it results in a NoSuchElementException
		
		//Selenium checks on the page for the element, if it doesn't find the element it throws an Exception
		driver.findElement(By.xpath("//input[@id='username11']")).sendKeys("test@gmail.com");
		
		//indexing in xpaths:
		//Whenever we are getting more than 1 elements we need to use a capture group
		//Combine all of them together in a bracket,called as capture group
		
		//	https://naveenautomationlabs.com/opencart/index.php?route=account/login
		//	(//a[text()='Forgotten Password']) is called capture group or collection group
		//	(//a[text()='Forgotten Password'])[1] -> this points to the first Forgotten Password link
		//	(//a[text()='Forgotten Password'])[2] -> this points to the second Forgotten Password link
		// 	The xpath indexes start from 1 onwards depending on the number of elements which need to be pointed to
		driver.findElement(By.xpath("(//a[text()='Forgotten Password'])[2]")).click();
		
		// (//a[text()='Forgotten Password'])[last()] -> last() can be used to point to the last element
		// (//a[text()='Forgotten Password'])[last()-1] -> can be used to point to the second last element etc
		
		// (//a[text()='Forgotten Password'])[position()=1] -> points to the first element
		// (//a[text()='Forgotten Password'])[1] -> first index
		
		// (//a[text()='Forgotten Password'])[position()=last()] -> points to the last element
		
		//	Usecases with last() or index()
		//	index we usually avoid that but for like especially for the Forgotten Password
		//	pointing to the second Forgotten Password link (//a[text()='Forgotten Password'])[2]
		//  if I dont know the id for the last element, we can collect the last element and fill it
		
		//	https://www.amazon.com/
		
		//  below is the xpath of the "Help" link in the Amazon footer(the xpath should work even if another div is added)
		// Help is the last element in the last coloumn
		//	((//div[@class='navFooterVerticalRow navAccessibility']/div[@class='navFooterLinkCol navAccessibility'])[last()]//a)[last()]
		driver.findElement(By.xpath("((//div[@class='navFooterVerticalRow navAccessibility']/div[@class='navFooterLinkCol navAccessibility'])[last()]//a)[last()]")).getText();
		
		
		//	https://naveenautomationlabs.com/opencart/index.php?route=account/register
		
	}

}
