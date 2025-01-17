package seleniumSessions22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//2.
public class SVGElement {
	static WebDriver driver;
	
	//svg all elements under svg are svg elements itself, including elements with <g> tag
	//parent svg element has to have "local-name()" in the xpath
	//child svg element has to have "local-name()" or "name()" in the xpath
	
	//Page Hierachy
	//Browser->Page->iFrame->svg elements->g->path
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://petdiseasealerts.org/forecast-map");
		Thread.sleep(3000);

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));

		String svgXpath = "//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='g' and @class='region']//*[name()='path']";

		List<WebElement> statesList = driver.findElements(By.xpath(svgXpath));
		System.out.println(statesList.size());

		Actions act = new Actions(driver);
		for (WebElement e : statesList) {
			act.moveToElement(e).perform();
			String nameAttr = e.getAttribute("name");
			System.out.println(nameAttr);
			Thread.sleep(1000);
		}
		
		//SVG: special xpath
		//parent svg: local-name()
		//child: g,path : name()
	}
}
