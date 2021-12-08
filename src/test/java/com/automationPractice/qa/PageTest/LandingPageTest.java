package com.automationPractice.qa.PageTest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationPractice.qa.TestBase.TestBase;
import com.automationPractise.qa.Pages.LandingPage;

public class LandingPageTest extends TestBase {

	LandingPage lp;

	@BeforeMethod
	public void intialise() {
		setUp();
		lp = new LandingPage();
	}

	@Test
	public void verifyTitleOfThePage() {
		String titleOfThePage = wd.getTitle();
		Assert.assertEquals(titleOfThePage, "My Store");
	}

	@AfterMethod
	public void quitDriver() {
		tearDown();
	}

}
