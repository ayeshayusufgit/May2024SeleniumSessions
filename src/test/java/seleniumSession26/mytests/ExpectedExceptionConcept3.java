package seleniumSession26.mytests;

import org.testng.annotations.Test;

//4
public class ExpectedExceptionConcept3 {
	//Can multiple expectedExceptions be provided in a test?
	
	int age;
	
	@Test(expectedExceptions = ArithmeticException.class)
	//But we are expecting an AE but the test throws a NPE
	//The test in this case fails due to the NPE as the expectedException is AE
	//The expectedExceptions is not matched
	public void paymentTest() {
		System.out.println("Payment Test");
		int i=9/2;
		
		ExpectedExceptionConcept3 obj=null;
		obj.age=20;//This line will result in a NullPointerException
	}
}
