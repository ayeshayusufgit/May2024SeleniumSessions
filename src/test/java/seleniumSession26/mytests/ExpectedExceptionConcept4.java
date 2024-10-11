package seleniumSession26.mytests;

import org.testng.annotations.Test;

//4
public class ExpectedExceptionConcept4 {
	//Can multiple expectedExceptions be provided in a test?
	
	int age;
	
	@Test(expectedExceptions = { ArithmeticException.class,NullPointerException.class})
	//There can be multiple expectedExceptions separated by a comma
	//This test results in a NPE (actual expectation) and its expectedException is AE or NPE
	//This test will pass
	public void paymentTest() {
		System.out.println("Payment Test");
		int i=9/2;
		
		ExpectedExceptionConcept4 obj=null;
		obj.age=20;//This line will result in a NullPointerException
	}
}
