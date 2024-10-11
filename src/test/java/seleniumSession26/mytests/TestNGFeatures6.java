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

//Can 2 @BeforeSuite be used?
//Yes, in this case connectWithAPI after which connectWithDB will be executed
//(in alphabetical order) but its avoided

public class TestNGFeatures6 {
	
	//2
	@BeforeSuite
	public void connectWithDB(){
		System.out.println("Before Suite--Connect with DB!");
	}
	
	//1
	@BeforeSuite
	public void connectWithAPI(){
		System.out.println("Before Suite--Connect with API!");
	}
	
	//3
	@BeforeTest
	public void createUser() {
		System.out.println("Before Test--Create User");
	}
	
	//4
	@BeforeClass
	public void openBrowser() {
		System.out.println("Before Class--Open Browser");
	}
	
	//5 8 11
	@BeforeMethod
	public void logIntoApp() {
		System.out.println("Before Method--Log Into App");
	}
	
	//12
	@Test
	public void searchTest() {
		System.out.println("Search Test");
	}
	
	//6 the tcs run in alphabetical order
	@Test
	public void cartTest() {
		System.out.println("Cart Test");
	}
	
	//9
	@Test
	public void paymentTest() {
		System.out.println("Payment Test");
	}
	
	//7  //10  //13
	@AfterMethod
	public void logOutOfApp() {
		System.out.println("After Method--Log Out of App");
	}
	
	//14
	@AfterClass
	public void closeBrowser() {
		System.out.println("After Class--Close Browser");
	}
	
	//15
	@AfterTest
	public void deleteUser() {
		System.out.println("After Test--Delete User");
	}

	//16
	@AfterSuite
	public void disconnectWithDB(){
		System.out.println("After Suite--Disconnect DB");
	}
}
