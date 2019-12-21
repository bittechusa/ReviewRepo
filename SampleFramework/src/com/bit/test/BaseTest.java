package com.bit.test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import bussinessapplication.BrowserConfig;

public class BaseTest {
	WebDriver driver;
	@Before
	public void start() {
		 driver=BrowserConfig.openBrowser();
	}
	@After
	public void end() {
		driver.quit();
	}

}
