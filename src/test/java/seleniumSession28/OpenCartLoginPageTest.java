package seleniumSession28;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import seleniumSession28.base.*;

//1
public class OpenCartLoginPageTest extends BaseTest {
	
	//Currently the searchTest() takes hardcoded data for the search term for MacBook, click on the MacBook product and check the MacBook title in the Product Details Page
	//For the other data sets it wont work.
	
	//The data shouldn't be hardcoded in the searchTest(), so thats why we need to use the DataProvider approach
	//The data is supplied to the searchTest() to achieve the Data Driven Approach in TestNG
	
	//There is no concept of DataDriver FW but its DataDriver Approach
	//Data Driver Approach: the data is fetched from the data provider which maybe the testNG dataprovider, excel, json, csv 
	//To run a test on different sets of data is called as Parameterization of the test
	
	//Every functionality should have its own set of data
	//Never mix 2 functionality in 1 test
	
	
	//1 column data 
	@DataProvider
	public Object[][] getSearchData() {
		return new Object[][] { {"macbook","MacBook Pro"},
								{"imac","iMac"},
								{"samsung","Samsung Galaxy Tab 10.1"},
								{"samsung","Samsung SyncMaster 941BW"}
							};
		
	}
	
	@DataProvider
	public Object[][] getSearch() {
		return new Object[][] { {"macbook"},
			{"imac"},
			{"samsung"}
			};
	}	
	
	//DataProvider method(getSearchData) will pass the first row of data and map it to the searchTerm and productName
	//One by one each row data will be supplied to this method
	//so each row is taken as a set of data which is executed on the searchTest method, this happens till the last row is reached
	@Test(dataProvider = "getSearchData")
	public void searchTest(String searchTerm,String productName) {
		driver.findElement(By.name("search")).clear();
		driver.findElement(By.name("search")).sendKeys(searchTerm);
		driver.findElement(By.cssSelector("div#search button")).click();
		driver.findElement(By.linkText(productName)).click();
		String header=driver.findElement(By.tagName("h1")).getText();
		System.out.println(header);
		Assert.assertEquals(header, productName);
	}
	
	//Testcases should never be overloaded
//	public void searchTest(String searchTerm) {
//		driver.findElement(By.name("search")).clear();
//		driver.findElement(By.name("search")).sendKeys(searchTerm);
//		driver.findElement(By.cssSelector("div#search button")).click();
//	}
	
	//The data can be stored in CSV or excel or json or xml file
}