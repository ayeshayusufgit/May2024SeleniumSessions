package seleniumSession26.mytests;

import org.testng.annotations.Test;

//5
public class DependsOnMethodConcept4 {
	
	@Test
	public void loginTest() {
		System.out.println("Login Test");
		int i=9/0;
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void homePageTest() {
		System.out.println("Home Page Test");
	}
	
	@Test(dependsOnMethods = "homePageTest")
	public void searchPageTest() {
		System.out.println("Search Page Test");
	}
	
	//loginTest fails becoz of NPE, homePageTest and searchPageTest gets skipped
}

//This is a very bad design especially in UI Automation if there are dependencies

//The tests are dependent on each other:
//1.Suppose if loginTest fails then all the depending tests will be skipped(won't get executed)

//2.Parallel execution
//Suppose there are 3 independent threads executing 3 testcases,
//thread1 running test1, thread2 running test2 and thread3 running test3
//Suppose thread3 gets activated and runs test3(searchPageTest),thread3 wont be able to execute
//test3 as its dependent on test2(homePageTest) which is taking care of it.In parallel execution
//its in complete mess with Parallel Execution

//This is the antipattern
//We should not have dependsOnMethods and priority while creating tests
