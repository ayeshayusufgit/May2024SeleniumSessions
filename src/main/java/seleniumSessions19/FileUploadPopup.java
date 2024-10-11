package seleniumSessions19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//3.
public class FileUploadPopup {
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		//	Whenever a "choose file" or "browse file" button etc is seen
		//	type='file' should be there in the html DOM(mandatory)
		
		//if the type='file is not there then ask the developer to add it in the code
		WebElement chooseFile=driver.findElement(By.name("upfile"));
		
		//On a button the sendkeys operation is done
		chooseFile.sendKeys("C:\\Users\\ayesh\\OneDrive\\Desktop\\accessspecifierscope.png");
		
		
		
		
		
		
		

	}

}
