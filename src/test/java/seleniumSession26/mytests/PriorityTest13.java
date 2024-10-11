package seleniumSession26.mytests;

import org.testng.annotations.Test;

//2i

//CRUD
//CreateUserTest-t1(priority=1) [ suppose the CreateUserTest couldnt be created ]
	//Fill the form and submit --> validate(using assertions)

//RetrieveUserTest-t2(priority=2) [ the RetrieveUserTest will fail ] 
	//Get the user/userid and validate

//In the t1 n t2 both have to communicate with each other, they are actually dependent

//UpdateUserTest-t3
	//get the user/userid(234)
	//update the user/userId(234)

//DeleteUserTest-t4
	//get the user/userid(234)
	//delete the user/userId(234)

//The priority shouldnt be given
//What if I want to just run 1 test(RetrieveUserTest) if the priorities are given, will it work?
//It wont run as we should get the userId from CreateUserTest


public class PriorityTest13 {
	
	@Test(priority=Integer.MIN_VALUE)
	public void searchTest() {
		System.out.println("Search Test");
	}
	
	@Test(priority=3)
	public void cartTest() {
		System.out.println("Cart Test");
	}
	
	@Test(priority=2)
	public void paymentTest() {
		System.out.println("Payment Test");
	}
	
	@Test(priority=5)
	public void aTest() {
		System.out.println("a Test");
	}
	
	@Test(priority=5)
	public void bTest() {
		System.out.println("b Test");
	}
	
	@Test(priority=Integer.MAX_VALUE)
	public void cTest() {
		System.out.println("c Test");
	}
}
