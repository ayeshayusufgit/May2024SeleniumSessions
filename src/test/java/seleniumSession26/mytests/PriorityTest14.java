package seleniumSession26.mytests;

import org.testng.annotations.Test;

//2i


public class PriorityTest14 {
	//CRUD
	//CreateUserTest-t1(priority=1)
		//Fill the form and submit --> validate(using assertions)

	//RetrieveUserTest-t2(priority=2)
		//Fill the form, submit and get the user/userid(123) 
		//Get the user/userid(123) and validate

	//UpdateUserTest-t3
		//fill the form, submit and get the userid(234) 
		//get the user/userid(234)
		//update the user/userId(234)

	//DeleteUserTest-t4
		//fill the form, submit and get the userid(345) 
		//get the user/userid(345)
		//delete the user/userId(345)

	//The priorities should be removed such that the tests are independent
	//Also the hardcoding of userIds are removed since they are independent
	//(as above)

	//Run only test2, will it run?
	//Yes it will as its independent of any tests

}
