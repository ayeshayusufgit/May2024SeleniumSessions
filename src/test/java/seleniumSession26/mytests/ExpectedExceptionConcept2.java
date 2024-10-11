package seleniumSession26.mytests;

import org.testng.annotations.Test;

//4
public class ExpectedExceptionConcept2 {

	@Test(expectedExceptions = ArithmeticException.class)
	//There is an expectation from this test that it will result in an ArithmeticException
	//The ArithmeticException that is thrown in this test gets handled, resulting in the test passing
	public void paymentTest() {
		System.out.println("Payment Test");
		int i=9/0;
	}
	//This can be used for -ve scenarios
}
