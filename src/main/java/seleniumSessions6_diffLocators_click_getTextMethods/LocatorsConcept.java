package seleniumSessions6_diffLocators_click_getTextMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//2.
public class LocatorsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Locators: are used to identify a specific element on a Web Page
		
		//There are 8 locators in Selenium and those locators are defined in the form of methods in the By class
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//1. "id" (this is unique in a web page) - 1st preference
		driver.findElement(By.id("input-firstname")).sendKeys("Surya");
		driver.findElement(By.id("input-lastname")).sendKeys("Automation");
		
		
		//2. "name" (use only if id is not available), it is an attribute and can be duplicate - 2nd preference
		driver.findElement(By.name("firstname")).sendKeys("surya");
		
		//3. "className" is an attribute, can be duplicated in the Web Page - 3rd preference(usually avoided)
		driver.findElement(By.className("form-control")).sendKeys("Surya");
		By.className("naveen test");
		//Find elements based on the value of the "class" attribute. Only one class name should be used.If an element has multiple classes(compound classes),
		//please use By.cssSelector(String).
		
		
		//4. "xpath" is the address of the element in the DOM(this is not an attribute)
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Surya");
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("Automation");
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
		
		//xpaths are used in web tables, paginations, sibling concept
		//css cannot be used to traverse from child to parent
		
		
		
		//5. "cssSelector"
		//CSS full form is Cascading Style Sheet
		//The backward traversing cannot be done with CSS selector
		//The sibling concept is not applicable with CSS Selector
		
		driver.findElement(By.cssSelector("#input-firstname")).sendKeys("Surya");
		driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary")).click();
		
		//In the realtime framework xpaths/css selectors are used depending on the scenario
		
		//6. "linkText" only used for links ie html tag <a>
		driver.findElement(By.linkText("Forgotten Password")).click();
		
		//7. "partialLinkText" only used for links 
		driver.findElement(By.linkText("Forgotten")).click();
		driver.findElement(By.linkText("Password")).click();
		
		//In the dom there can be multiple texts using Forgotten so in this case the first Forgotten will be clicked
		//Forgotten Username
		//Forgotten Password
		
		//The usage of Partial LinkText is very rare, when there is a paragraph we identify an important string from and use it with partial link text locator
		//this prevents the usage of the entire paragraph to the imp words using partial link Text
		
		
		//8. "tagName"
		String header=driver.findElement(By.tagName("h1")).getText();
		System.out.println(header);
		if(header.equals("Register Account")) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
		driver.findElement(By.tagName("a")).click();
		//This will click on the first link on the page
		
		
		
		//linkText is used for links "a"
		//xpath an css used for dynamic and complex elements
		
		
	}
	
	
}
