package seleniumSession26.mytests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//Can there be 2 @BeforeMethod?
//Yes, will be taken on the bases of alphabetical order
//TestNG is handling the execution sequence on the bases on annotations, no main method is required


public class TestNGFeatures8 {
	
	//1
	@BeforeSuite
	public void connectWithDB(){
		System.out.println("Before Suite--Connect with DB!");
		System.out.println("Before Suite--Connect with API!");
	}
	
	//2
	@BeforeTest
	public void createUser() {
		System.out.println("Before Test--Create User");
	}
	
	//3
	@BeforeClass
	public void openBrowser() {
		System.out.println("Before Class--Open Browser");
	}
	
	//5 9 13
	@BeforeMethod
	public void logIntoApp() {
		System.out.println("Before Method--Log Into App");
	}
	
	//4 8 12
	@BeforeMethod
	public void clearCache() {
		System.out.println("Before Method--Clear Cache");
	}
	
	//14
	@Test
	public void searchTest() {
		System.out.println("Search Test");
	}
	
	//6 the tcs run in alphabetical order
	@Test
	public void cartTest() {
		System.out.println("Cart Test");
	}
	
	//8
	@Test
	public void paymentTest() {
		System.out.println("Payment Test");
	}
	
	//7 //11 //15
	@AfterMethod
	public void logOutOfApp() {
		System.out.println("After Method--Log Out of App");
	}
	
	//16
	@AfterClass
	public void closeBrowser() {
		System.out.println("After Class--Close Browser");
	}
	
	//17
	@AfterTest
	public void deleteUser() {
		System.out.println("After Test--Delete User");
	}

	//18
	@AfterSuite
	public void disconnectWithDB(){
		System.out.println("After Suite--Disconnect DB");
	}
}
