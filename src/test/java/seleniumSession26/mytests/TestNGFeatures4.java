package seleniumSession26.mytests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

//On commenting all except @BeforeSuite and @AfterSuite, wo any testcases and executing
//The @BeforeSuite and @AfterSuite gets executed but gives the below error:
//[TestNG]No tests found. Nothing was run.
//WO any report
//WO @Test its not a TestNG class


public class TestNGFeatures4 {
	
	//1
	@BeforeSuite
	public void connectWithDB(){
		System.out.println("Before Suite--Connect with DB!");
	}
	
	//2
//	@BeforeTest
//	public void createUser() {
//		System.out.println("Before Test--Create User");
//	}
//	
//	//3
//	@BeforeClass
//	public void openBrowser() {
//		System.out.println("Before Class--Open Browser");
//	}
	
	//4  //7  //10
//	@BeforeMethod
//	public void logIntoApp() {
//		System.out.println("Before Method--Log Into App");
//	}
	
	//11
//	@Test
//	public void searchTest() {
//		System.out.println("Search Test");
//	}
//	
//	//5 the tcs run in alphabetical order
//	@Test
//	public void cartTest() {
//		System.out.println("Cart Test");
//	}
//	
//	//8
//	@Test
//	public void paymentTest() {
//		System.out.println("Payment Test");
//	}
	
//	//6  //9  //12
//	@AfterMethod
//	public void logOutOfApp() {
//		System.out.println("After Method--Log Out of App");
//	}
//	
//	//13
//	@AfterClass
//	public void closeBrowser() {
//		System.out.println("After Class--Close Browser");
//	}
//	
//	//14
//	@AfterTest
//	public void deleteUser() {
//		System.out.println("After Test--Delete User");
//	}
//
	//15
	@AfterSuite
	public void disconnectWithDB(){
		System.out.println("After Suite--Disconnect DB");
	}
}