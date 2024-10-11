package seleniumSession26.mytests;

import org.testng.annotations.Test;

//2b

//o/p=>
//Search Test
//a Test
//Payment Test
//b Test
//Cart Test
//c Test

public class PriorityTest5 {
	
	@Test(priority=-100)
	public void searchTest() {
		System.out.println("Search Test");
	}
	
	@Test(priority=3)
	public void cartTest() {
		System.out.println("Cart Test");
	}
	
	@Test(priority=1)
	public void paymentTest() {
		System.out.println("Payment Test");
	}
	
	@Test(priority=-22)
	public void aTest() {
		System.out.println("a Test");
	}
	
	@Test(priority=2)
	public void bTest() {
		System.out.println("b Test");
	}
	
	@Test(priority=4)
	public void cTest() {
		System.out.println("c Test");
	}
}
