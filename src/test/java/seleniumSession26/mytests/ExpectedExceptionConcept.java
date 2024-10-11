package seleniumSession26.mytests;

import org.testng.annotations.Test;

//4
public class ExpectedExceptionConcept {

	@Test//The moment any exception comes in the test it fails
	public void paymentTest() {
		System.out.println("Payment Test");
		int i=9/0;
	}
}
