package seleniumSession26.mytests;

import org.testng.annotations.Test;

//2f

//o/p=>
//Search Test
//Payment Test
//Cart Test
//a Test
//b Test
//c Test

public class PriorityTest9 {
	
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
	
	@Test(priority=5)
	public void aTest() {
		System.out.println("a Test");
	}
	
	@Test(priority=5)
	public void bTest() {
		System.out.println("b Test");
	}
	
	@Test(priority=5)
	public void cTest() {
		System.out.println("c Test");
	}
}
