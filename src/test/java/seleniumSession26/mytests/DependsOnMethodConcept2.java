package seleniumSession26.mytests;

import org.testng.annotations.Test;

//5
public class DependsOnMethodConcept2 {
	
	@Test
	public void loginTest() {
		System.out.println("Login Test");
		int i=9/0;
	}
	
	@Test(dependsOnMethods = "loginTest")
	//if the loginTest method fails then the homePageTest method will be skipped
	public void homePageTest() {
		System.out.println("Home Page Test");
	}
	
//	@Test
//	public void searchPageTest() {
//		System.out.println("Search Page Test");
//	}
	
}
