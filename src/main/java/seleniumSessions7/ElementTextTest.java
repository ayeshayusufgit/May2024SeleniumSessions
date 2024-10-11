package seleniumSessions7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import seleniumSessions5_webelement_bylocator_sendkeys.ElementUtil;

//1.
public class ElementTextTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php/?route=account/login");
		
		By header=By.tagName("h2");
		By para=By.xpath("//*[@id=\"content\"]/div/div[1]/div/p[2]");
		By forgottenPwdLink=By.linkText("Forgotten Password");
		By footerHeader=By.tagName("h5");
		
		ElementUtil eUtil=new ElementUtil(driver);
		String m1=eUtil.doGetElementText(header);
		String m2=eUtil.doGetElementText(para);
		String m3=eUtil.doGetElementText(forgottenPwdLink);
		String m4=eUtil.doGetElementText(footerHeader);
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		
		driver.close();
	}
}
