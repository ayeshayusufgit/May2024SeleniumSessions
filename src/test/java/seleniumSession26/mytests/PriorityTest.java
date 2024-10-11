package seleniumSession26.mytests;

import org.testng.annotations.Test;

//2
//The execution will be in alphabetical order of the testcases
public class PriorityTest {
	
	@Test
	public void searchTest() {
		System.out.println("Search Test");
	}
	
	@Test
	public void cartTest() {
		System.out.println("Cart Test");
	}
	
	@Test
	public void paymentTest() {
		System.out.println("Payment Test");
	}
}
