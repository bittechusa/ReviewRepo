package com.bit.test;

import org.junit.Test;

import bussinessapplication.CoreStep;

public class SmokeTest extends BaseTest{

	@Test
	public void test1() {
		CoreStep c=new CoreStep();
		c.verifyHomePageTitle();
		c.verifyHomePage();
		c.hoverOverOnMortgage();
		
		
		CoreStep c1=new CoreStep(driver);
		c1.verifyHomePageTitle();
		c1.verifyHomePage();
		c1.hoverOverOnMortgage();
	}
}
