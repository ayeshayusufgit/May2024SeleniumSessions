package seleniumSession26.mytests;

import org.testng.annotations.Test;

//2
//The execution will be on the bases of the priority from the lowest to the highest
//searchTest
//paymentTest
//cartTest

public class PriorityTest2 {
	
	@Test(priority=1)
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
}
