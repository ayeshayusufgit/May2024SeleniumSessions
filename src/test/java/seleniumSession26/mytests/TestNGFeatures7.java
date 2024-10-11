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

//Its better to combine the 2 @BeforeSuite methods(global preconditions) together into one
//as its confusing an unnecessarily lengthy

public class TestNGFeatures7 {
	
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
	
	//4 7 10
	@BeforeMethod
	public void logIntoApp() {
		System.out.println("Before Method--Log Into App");
	}
	
	//11
	@Test
	public void searchTest() {
		System.out.println("Search Test");
	}
	
	//5 the tcs run in alphabetical order
	@Test
	public void cartTest() {
		System.out.println("Cart Test");
	}
	
	//8
	@Test
	public void paymentTest() {
		System.out.println("Payment Test");
	}
	
	//6  //9 //12
	@AfterMethod
	public void logOutOfApp() {
		System.out.println("After Method--Log Out of App");
	}
	
	//13
	@AfterClass
	public void closeBrowser() {
		System.out.println("After Class--Close Browser");
	}
	
	//14
	@AfterTest
	public void deleteUser() {
		System.out.println("After Test--Delete User");
	}

	//15
	@AfterSuite
	public void disconnectWithDB(){
		System.out.println("After Suite--Disconnect DB");
	}
}
