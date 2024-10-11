package seleniumSession26.mytests;

import org.testng.annotations.Test;

//3
public class InvocationCount2 {

	//paymentTest method will be executed 10 times first
	//cartTest method will be executed 10 times second
	
	@Test(invocationCount = 10, priority = 1)
	public void paymentTest() {
		System.out.println("Payment Test");
	}

	@Test(invocationCount = 10, priority = 2)
	public void cartTest() {
		System.out.println("Cart Test");
	}

}
