package bussinessapplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import db.ObjectRepo;
import db.TestData;
import utility.Helper;

public class CoreStep {

	WebDriver driver;
	public CoreStep(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public CoreStep() {
		System.out.println("default");
	}
	public void verifyHomePage() {
		Helper.verifyEelement(driver.findElement(ObjectRepo.logo));
	}
	
	public void verifyHomePageTitle() {
		Helper.verifyTitle(driver, TestData.Htitle);
	}
	public void hoverOverOnMortgage() {
		Helper.hoverOver(driver, driver.findElement(ObjectRepo.mortgagemenu));
	}
}
