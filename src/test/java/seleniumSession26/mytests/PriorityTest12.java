package seleniumSession26.mytests;

import org.testng.annotations.Test;

//2i
//Is it a good practice to define the priorities?
//Not a good practice
//AAA pattern:Arrange Act Assert 

//There should be 
//Very minimal usage of priorities should be there in the FW
//if the priority is given then the AAA pattern is not followed
//All the testcases should be independent of each other



public class PriorityTest12 {
	
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
