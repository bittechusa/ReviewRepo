package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Helper {
	public static void hoverOver(WebDriver driver, WebElement element) {
		Actions a=new Actions(driver);
		a.moveToElement(element).build().perform();
	}
	public static void verifyEelement(WebElement element) {
		if( element.isDisplayed())
		{
			System.out.println(element+" is displayed");
		}else
			System.out.println(element+" is not displayed");
			
	}
	
	public static void verifyTitle(WebDriver driver,String text) {
		if( driver.getTitle().contains(text))
		{
			System.out.println(" title matched");
		}else
			System.out.println(" title not matched");
			
	}

}
