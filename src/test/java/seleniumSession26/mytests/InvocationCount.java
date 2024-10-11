package seleniumSession26.mytests;

import org.testng.annotations.Test;

//3
public class InvocationCount {
	
	@Test(invocationCount =  10)//The test will run 10 times
	//Used for performance testing, to hit an api or a usecase 
	//which involves running a test 10 times back to back
	public void paymentTest() {
		System.out.println("Payment Test");
	}
}
