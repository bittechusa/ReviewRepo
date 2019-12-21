package bussinessapplication;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserConfig {
	static WebDriver driver;
	
	public static WebDriver openBrowser()
	{
		if(driver==null)
		{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.bankrate.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		return driver;
	}

}
