package com.automationPractice.qa.PageTest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationPractice.qa.Pages.LandingPage;
import com.automationPractice.qa.Pages.MyAccountPage;
import com.automationPractice.qa.Pages.SignInPage;
import com.automationPractice.qa.TestBase.TestBase;

public class SignInPageTest extends TestBase {

	LandingPage lp;
	SignInPage sp;
	MyAccountPage mp;

	@BeforeMethod
	public void intialise() {
		setUp();
		lp = new LandingPage();
		sp = lp.clickSignInButton();	
	}

	@Test
	public void verifyLogin() {
		mp = sp.login("msp123@it.com", "Password1");
		String userName = mp.getUserNameText();
		Assert.assertEquals(userName, "Manvir Singh");
	}
	
	
	@Test
	public void verifyTitleOfSignInPage() {
		Assert.assertEquals(wd.getTitle(), "Login - My Store");
	}
	
	
	

	@AfterMethod
	public void quitBrowser() {
		tearDown();
	}

}
