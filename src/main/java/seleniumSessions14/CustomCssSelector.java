package seleniumSessions14;

import org.openqa.selenium.By;

//2.
public class CustomCssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		
		
		
	}

}
