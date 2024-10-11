package seleniumSessions15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//2.
public class CustomCssSelector {
		static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.hubspot.com/login");
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//CSS: Cascaded Style Sheet
		//CSS is used to provide the look and feel of elements on a page
		//To design the elements 
		//the colour, length, height, background colour, formatting of the element, 
		
		//CSS Selector is a type of locator
		
		//CSS Selector using id:
		//	url -> https://naveenautomationlabs.com/opencart/index.php?route=account/login
		//
		//	#id	->		#input-email ->	By.cssSelector("#input-email");
		//or
		//
		//	htmltag#id	->	input#input-email	->	By.cssSelector("input#input-email");
		
		//CSS Selector using classname:
		//	.classname	->	.form-control	->	3 elements
		//or
		//	 htmltag.classname	->	input.form-control	->	3 elements	
		
		//CSS Selector when there are multiple classes:
		//	.c1.c2.c3.....cn
		//	url	->	https://app.hubspot.com/login
		//	.form-control.private-form__control.login-email	->	1 element
		//or
		//	htmltag.c1.c2.c3.....cn
		//	input.form-control.private-form__control.login-email
		//or
		// using only 2 classnames with htmltag
		//	input.form-control.login-email	->	1 element
		//or
		//	input.private-form__control.login-email	->	1 element
		//or
		//	input.login-email	->	1 element
		
		//CSS Selector using id and class
		//	#id.classname
		//	#username.login-email 	, where login-email is a unique class
		//or
		//	.login-email#username	,	the classname and id are reversed in this case
		//or
		//	htmltag#id.classname
		//	input#username.login-email
		//or
		//	html.classname#id
		//	input.login-email#username
		
		//	CSS Selector using classname and id
		//	input.form-control.private-form__control.login-email#username
		//	or
		//	input#username.form-control.private-form__control.login-email
		//	or
		//	htmltag.c1#id.c2.c3 (the change in sequence of the classname n id
		//	input.form-control#username.private-form__control.login-email
		
		//For any attribute in CSS Selector:
		//	htmltag[attribute='value']
		// 	url	->	https://naveenautomationlabs.com/opencart/index.php?route=account/login
		//	input[name='email']		(	xpath =>	//input[@name='email']	) 
		//	or
		//	input[placeholder='E-Mail Address']
		//	or
		//	input[name='email']#nput-email
		//	or
		//	input#input-email[name='email']
		//	or
		//	input#input-email[name='email'].form-control
		
		
		//	For multiple attributes in CSS Selector(no and n or):
		//	htmltag[attr1='value1'][attr2='value2'][attr3='value3']
		//	input[name='email'][placeholder='E-Mail Address'][type='text']#input-email
		//	input[name='email'][placeholder='E-Mail Address'][type='text'][id='input-email']
		
		//	Drawbacks in CSS:
		//	CSS selector by using the text:NO support for text in CSS
		//	Backward traversing from child to parent not possible
		
		//		contains:
		//		htmltag[attr*='value']
		//		input[placeholder*='E-Mail']
		
		//		starts-with:
		//		htmltag[attr^='value']
		//		input[placeholder^='E-Mail']
		
		//		ends-with:
		//		htmltag[attr$='value']
		//		input[placeholder$='Address']
		
		//		parent to child:
		//		url ->	https://app.hubspot.com/login		
		//a)	parenthtmltag childhtmltag	->	for indirect child elements
		//		form#hs-login input#username ->	1 element
		
		
		//b)	parenthtmltag > childhtmltag	->	for direct child elements
		//		form#hs-login > input#username -> 0 element
		//		form#hs-login > div -> 8 elements
		//		form#hs-login	div	-> 23 elements
		
		//		url	->https://orangehrm.com/30-day-free-trial	
		//		select#Form_getForm_Country>option	(direct options)
		//		select#Form_getForm_Country option	(direct options)
		//		select.dropdown option
		
		//		to get all the footer links of the open cart page
		//		url	->	https://naveenautomationlabs.com/opencart/index.php?route=account/login
		//		By.cssSelector("footer a");
		
		// 		following-sibling using CSS Selector:
		//		label[for='input-email']+input ---> immediate following sibling only 
		
		//		url	->	https://orangehrm.com/30-day-free-trial
		//		select#Form_getForm_Country>option[value='Afghanistan'] + option ---> immediate following sibling only	
		//		select#Form_getForm_Country>option[value='Afghanistan'] ~ option ---> all the following siblings
		
		//		preceding-sibling using CSS Selector not allowed in CSS Selector
		//		input#input-email - label (wont work incase of CSS Selector)
		
		//		index in CSS:	nth-of-type(index)
		//		url	->	https://orangehrm.com/30-day-free-trial
		//		select#Form_getForm_Country>option:nth-of-type(3)	->	only the 3rd index
		//		select#Form_getForm_Country>option:nth-of-child(3)	->	only the 3rd index
		
		//		Interview Question:How to select odd n even indexed elements using CSS Selector?
		//		select#Form_getForm_Country>option:nth-child(even)	-> only the even indexed elements
		//		select#Form_getForm_Country>option:nth-child(odd)	-> only the odd indexed elements
		//		select#Form_getForm_Country>option:nth-child(n+4)	-> this starts from the 4th index
		//		select#Form_getForm_Country>option:nth-child(4n)	-> this takes the multiple of 4 index
		
		//		select#Form_getForm_Country>option:first-child	->	only the first element
		//		select#Form_getForm_Country>option:last-child	->	only the last element
	
		//		select#Form_getForm_Country>option:nth-last-child(2) -> 2nd last child from the last element
		
		//		select#Form_getForm_Country>option:nth-of-type(n)	->	all the elements
		
		//		10%2==0 -->	even
		//		9%2==1	-->	odd
		
		//	Interview Question:
		//
		//a) 	Write xpath for odd indexes for the dropdown options:
		//		//select[@id='Form_getForm_Country']/option[position() mod 2=1]
		
		//b)	Write xpath for even indexes for the dropdown options:
		//		//select[@id='Form_getForm_Country']/option[position() mod 2=0]
		
		//c)	Write css Selector for odd indexes for the dropdown options:
		//		select#Form_getForm_Country>option:nth-of-type(odd)
		
		//d)	Write css Selector for even indexes for the dropdown options:
		//		select#Form_getForm_Country>option:nth-of-type(even)
		
		//	Multiple CSS Selectors can be written separated by commas
		//	url	->	https://app.hubspot.com/login
		//	input#username,input#password	->	returns 2 elements
		//	input#username,input#password,button#loginBtn,input#remember	->	returns 4 elements
		
		//Instead of writing 4 By locators, 1 By locator can be written with 4 CSS Selectors
		//Usecase:	
		//Sanity test to check 4 login element count, can be written.
		//If the login element count is not 4, then the test fails.
		
		int loginImpElementCount=driver.findElements(By.cssSelector("input#username,input#password,button#loginBtn,input#remember")).size();
		System.out.println(loginImpElementCount);
		
		if(loginImpElementCount==4) {
			System.out.println("Login Form Elements are present");
		}
		else {
			System.out.println("All the 4 Login Form Elements are not present");
		}
		
		//	not used in CSS:
		//	url	->	https://naveenautomationlabs.com/opencart/index.php?route=account/login
		//	input.form-control:not(input[name='search'],#input-password)
		//	or
		//	input.form-control:not(input[name='search']),not(#input-password)
		
		//	url:https://www.amazon.com/
		//	CSS Selector	->	div.navFooterLinkCol.navAccessibility>div:not(div.navFooterColSpacerInner)
		//	The above CSS Selector is to select the elements with the above xpath xcluding the not CSS Selector
		
		//	xpath	->	//div[text()='Get to Know Us']//following-sibling::ul//a	
		//	The above xpath gives all the links in the "Get to Know Us" column of amazon.in
		//	The header can be replaced with the other column headers of the footer to get the links under it
		
		//									xpath			vs		css
		//1.syntax							complex					easy	
		//2.performance						good					good
		//3.text() support					yes						no(major drawback)
		//4.sibling support					yes						limited(only forward or following sibling)
		//due to text() and sibling support webtables  can be handled using xpaths instead of CSS Selectors	
		//5.child to parent traversing		yes						no
		//6.child to ancestors traversing	yes						no(major drawback)
		//7.indexing support				yes						yes(has some additional features like,odd,even,+1,multiples of certain elements)
		//8.not support						yes						yes
		//9.comma/union support				limited support			yes(good support)
		//10.space handling					yes						no
		//11.SVG element					yes						limited support(not covered)
		//12.Shadow DOM						no						yes
		//13.ends-with						no						yes($ is used)
		
		//Theres another concept in Selenium called Relative Locators added in Selenium 4.x
		
		
		
		
	}
}
