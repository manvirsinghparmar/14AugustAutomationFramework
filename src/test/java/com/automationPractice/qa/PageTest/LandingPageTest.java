package com.automationPractice.qa.PageTest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationPractice.qa.Pages.LandingPage;
import com.automationPractice.qa.TestBase.TestBase;

public class LandingPageTest extends TestBase {

	LandingPage lp;

	@BeforeMethod
	public void intialise() {
		setUp();
		lp = new LandingPage();
	}

	@Test(priority = 1)
	public void verifyTitleOfThePage() {
		String titleOfThePage = wd.getTitle();
		Assert.assertEquals(titleOfThePage, "My Store");
	}

	@Test(priority = 2)
	public void verifyIsLogoDisplayed() {
		boolean isDisplayed = lp.isLogoDisplayed();
		Assert.assertTrue(isDisplayed);
	}

	@Test(priority = 3)
	public void verifySearchFunctionality() {
		lp.enterTextInSearchField("Tops");
		lp.clickOnSearchButton();
		String actualMessageText = lp.getErrorMessageText();
		Assert.assertTrue(actualMessageText.contains("No results were found for your search"));
	}
	
	
	

	@AfterMethod
	public void quitDriver() {
		tearDown();
	}

}
