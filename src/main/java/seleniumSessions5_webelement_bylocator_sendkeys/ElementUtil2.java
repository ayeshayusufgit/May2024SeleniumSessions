package seleniumSessions5_webelement_bylocator_sendkeys;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import seleniumSessions3_topcasting.FrameworkException;

//Every class wud have its own WebDriver reference
//Only 1 session id will be used 
public class ElementUtil2 {
	
	//parallel execution cannot be done with static 
	private WebDriver driver;
	
	
	//This class is not required to create the driver
	//When an object of this class will be created the constructor will be called
	//the driver that is passed from the constructor will be assigned to the local driver variable within the class ElementUtil
	public ElementUtil2(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getElement(By locator) {
	//the local driver will be used here(which is assigned in the constructor)
		return driver.findElement(locator);
	}
	
	public void doClick(By locator) {
		getElement(locator).click();
	}
	
	//This method is overloaded, depending on the parameters passed the appropriate method will be invoked
	public void doSendKeys(By locator,String value) {
		getElement(locator).sendKeys(value);
	}
	
	public void doSendKeys(By locator,CharSequence...value) {
		//A null check is not required as internally its already done
		getElement(locator).sendKeys(value);
	}
	
	public boolean isElementDisplayed(By locator) {
		try {
			return getElement(locator).isDisplayed();
		} catch (NoSuchElementException ex) {
			System.out.println("Element is not displayed:"+locator);
			return false;
		}
	}
	
	public String doGetElementText(By locator) {
		String elementText=getElement(locator).getText();
		if(elementText!=null) {
			return elementText;
		}else {
			System.out.println("Element text is null:"+elementText);
			return null;	
		}
	}
	
	public String doElementGetAttribute(By locator,String attributeName) {
		return getElement(locator).getAttribute(attributeName);
	}
	
	public int getElementsCount(By locator) {
		return getElements(locator).size();
	}
	
	public List<WebElement> getElements(By locator){
		return driver.findElements(locator);
	}
	
	public List<String> getElementsTextList(By locator){
		List<WebElement> elementsList=getElements(locator);
		List<String> elementsTextList=new ArrayList<String>();
		for(WebElement element:elementsList) {
			String elementText=element.getText();
			if(elementText.length()!=0) {
			elementsTextList.add(elementText);
			}
		}
		return elementsTextList;
	}
	
	public void printElementsList(By locator) {
		List<String> elementsTextList=getElementsTextList(locator);
		for(String elementText:elementsTextList) {
			System.out.print(elementText+" ");
		}
		System.out.println();
	}
	
	public void doSearch(By searchField,By suggestions,String searchTerm,String suggestionMatch ) {
		doSendKeys(searchField, searchTerm);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		List<WebElement>  suggestionElementList=getElements(suggestions);
		int totalSuggestionsCount=suggestionElementList.size();
		
		System.out.println("Total number of suggestions:"+totalSuggestionsCount);
		
		if(totalSuggestionsCount==0) {
			System.out.println("There are no suggestions");
			throw new FrameworkException("No Suggestions Found");
		}
		
		for(WebElement element:suggestionElementList) {
			String searchText=element.getText();
			
			if(searchText.contains(suggestionMatch)) {
				element.click();
				break;
			}
		}
		
	}

	//These methods are overloaded
	
	//This method is written for checking the presence of an element once
	public  boolean isElementPresent(By locator) {
		if (getElementsCount(locator) == 1) {
			return true;
		}
		return false;
	}
	
	//This method is written for checking the presence of an element "n" times 
	public  boolean isElementPresent(By locator,int expectedElementCount) {
		if (getElementsCount(locator) == expectedElementCount) {
			return true;
		}
		return false;
	}
	
	//This method is to check if an element is not present on the page
	public  boolean isElementNotPresent(By locator) {
		if (getElementsCount(locator) == 0) {
			return true;
		}
		return false;
	}
	
	//This method is used to check if an element is found 1 more times in the page
	public  boolean isElementPresentMultipleTimes(By locator) {
		if (getElementsCount(locator) >= 1) { //?
			return true;
		}
		return false;
	}
	
	//****************Select Dropdown Utils ******************//
	private Select getSelect(By locator) {
		Select select=new Select(getElement(locator));
		return select;
	}
	
	public int getDropdownOptionsCount(By locator) {
		return getSelect(locator).getOptions().size();
	}

	public void selectDropdownValueByValue(By locator, String value) {
		getSelect(locator).selectByValue(value);
	}

	public void selectDropdownValueByVisibleText(By locator, String visibleText) {
		getSelect(locator).selectByVisibleText(visibleText);
	}

	public void selectDropdownValueByIndex(By locator, int index) {
		getSelect(locator).selectByIndex(index);
	}
	
	public List<String> getDropdownOptionsTextList(By locator) {
		WebElement dropdownElement = getElement(locator);
		List<String> dropdownOptionsTextList = new ArrayList<String>();

		Select select = new Select(dropdownElement);

		List<WebElement> optionsList = select.getOptions();

		System.out.println("Total Number of Options:"+optionsList.size());

		for (WebElement element : optionsList) {
			String text = element.getText();
			dropdownOptionsTextList.add(text);
		}
		
		return dropdownOptionsTextList;
	}
	
	/*
	 * selects the dropdown value using the Select class
	 */
	public void selectDropdownValueUsingSelectClass(By locator,String value) {
		Select select=new Select(getElement(locator));
		List<WebElement> dropdownOptionsList=select.getOptions();
		selectDropdown(dropdownOptionsList,value);
	}
	
	//Coding should be done keeping the following in mind:
	//optimized code
	//reusable
	//no hardcoded values
	
	
	
	/*
	 * selects the dropdown value without using the Select class
	 */
	public void selectDropdownValue(By locator,String value) {
		List<WebElement> dropdownOptionsList=getElements(locator);
		//System.out.println(ddOptionsList.size());
		
		selectDropdown(dropdownOptionsList,value);
	}
	
	private void selectDropdown(List<WebElement> dropdownOptionsList,String value) {
		System.out.println("Total number of options:"+dropdownOptionsList.size());
		for(WebElement option:dropdownOptionsList) {
			String text=option.getText();
			if(text.equals(value)){
				option.click();
				break;
			}
		}
	}
	
	//**************************Actions methods***********************
	
	/*
	 * This method is two level of parent and child menu
	 * @param parentMenu
	 * @param childMenu
	 * @throws InterruptedException
	 */
	public  void parentChildMenu(By parentMenu,By childMenu ) throws InterruptedException  {
		Actions act=new Actions(driver);
		act.moveToElement(getElement(parentMenu)).perform();
		Thread.sleep(1500);
		//getElement(childMenu).click();
		doClick(childMenu);
	}
	
	public void parentChildMenu(String parentMenu,String childMenu ) throws InterruptedException {
		Actions act=new Actions(driver);
		By parent=By.xpath("//*[text()='"+parentMenu+"']");
		act.moveToElement(getElement(parent)).perform();
		Thread.sleep(1500);
		By child=By.xpath("//*[text()='"+childMenu+"']");
		doClick(child);
	}
	
	/*
	 * This method is used for handling four levels of parent and child menus on the basis of By locators
	 * 
	 */
	public void handleParentChildMenu(By level1Menu, By level2Menu, By level3Menu, By level4Menu) throws InterruptedException {
		doClick(level1Menu);
		Thread.sleep(1500);
		Actions act=new Actions(driver);
		act.moveToElement(getElement(level2Menu)).perform();
		Thread.sleep(1500);
		act.moveToElement(getElement(level3Menu)).perform();
		Thread.sleep(1500);
		doClick(level4Menu);
	}
	
	//to get text:getText()
	//to get attribute:getAttribute()
	//to fetch single Web Element:fe
	//to fetch multiple Web Elements:fes
	//to type something:sendKeys()
	//to click a Web Element: click()
	//to check if a Web Element is displayed: isDisplayed()
	//to check if a Web Element is enabled: isEnabled()
	//to check if an Web Element is selected: isSelected()
	
	//Chrome Dev Protocols this kind of Errors are seen in Chrome n Edge browsers
	//As CDP is applicable for chrome and edge browsers
	//Warning:Unable to find the excact match for CDP version 127 ......
	//CDP 125->supporting Selenium version 4.22(125) -> There wont be any warnings
	//CDP 126->supporting upto Selenium version 4.22(125) 
	//CDP 127(browser has upgraded)->supporting upto Selenium version 4.22(125/126)
	//To prevent the warning upgrade selenium to the version supporting CDP
	//or the warning can be avoided as its not an error
}
