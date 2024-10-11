package seleniumSessions10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//5.
public class SelectDropdownHandling {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//A dropdown having the <html> tag using <select> only
		//Whenever a dropdown is with a Select tag then the Select class of Selenium needs to be used to handle it
		//The dropdown has the option attribute, the option attribute value an the dd text may or maynot be the same
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://orangehrm.com/30-day-free-trial");

		By country=By.id("Form_getForm_Country");
		WebElement countryElement=driver.findElement(country);
		Select select=new Select(countryElement);
		
		//select.selectByVisibleText("Brazil");//the selection is by exact text displayed in the dropdown
		//This is preferable, irrespective of any position of Andorra it will get selected or even if some countries get added before it
		
		//select.deselectByVisibleText("brazil");//will result in an Exception(as below) the selection is case sensitive
		// java.lang.UnsupportedOperationException: You may only deselect options of a multi-select
		
		//select.selectByIndex(5);//is selection by the index
		//the index starts from 0 ie for the Country option till the index of the last country
		//earlier if the index for Andorra ie 5 was provided but 2 more countries got added in then this will result in an exception
		//can be used if the options are fixed like days of the week, month
		
		//select.selectByValue("Belgium");//is selection with the value attribute text
		
		
		
		
		

	}

}
