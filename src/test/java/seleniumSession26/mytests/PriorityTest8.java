package seleniumSession26.mytests;

import org.testng.annotations.Test;

//2e
//When no priority is given to a testcase then priority=0 is taken by default

//o/p=>
//a Test
//b Test
//c Test
//Search Test
//Payment Test
//Cart Test


public class PriorityTest8 {
	
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
	
	@Test
	public void aTest() {
		System.out.println("a Test");
	}
	
	@Test
	public void bTest() {
		System.out.println("b Test");
	}
	
	@Test
	public void cTest() {
		System.out.println("c Test");
	}
}
