package seleniumSession26.mytests;

import org.testng.annotations.Test;

//2a
//Can a -ve priority be given?
//Yes

//o/p=>
//Search Test
//a Test
//Payment Test
//Cart Test
//b Test
//c Test

public class PriorityTest4 {
	
	@Test(priority=-1)
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
	
	@Test(priority=0)
	public void aTest() {
		System.out.println("a Test");
	}
	
	@Test(priority=4)
	public void bTest() {
		System.out.println("b Test");
	}
	
	@Test(priority=5)
	public void cTest() {
		System.out.println("c Test");
	}
}
