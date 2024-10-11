package seleniumSessions23;

//1.
public class WaitConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//script--sync(wait)--app(browser)
		
		//wait:
		//1. static wait: Thread.sleep(10000);-->Java
		//10 secs--->if the element is found in 2 secs, it'll still wait for 10 secs
		//10 secs-->if the element is found in 15 secs, it'll wait for 10 secs
		
		//2.dynamice wait:
		//10 secs:if the element is found within 2 seconds, itll wait for only 2 secs
		//10 secs:if the element is already present,it'll wait for 0 secs
		//10 secs:if the element is found in 10 secs,it'll wait for 10 secs
		//10 secs:if the element is found in 15 secs,it'll wait  for 10 secs and throw a NSE
		//The duration of the timeout is increased to 15 secs:if the element is found in 13 secs, it'll wait for 13 secs
		
		//2.1:Implicitly Wait
		//2.2:Explicit Wait
				//2.2.a:	WebDriverWait
				//2.2.b:	FluentWait
	}

}
