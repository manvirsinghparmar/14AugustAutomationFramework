package com.automationPractice.qa.PageTest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationPractice.qa.Pages.LandingPage;
import com.automationPractice.qa.Pages.MyAccountPage;
import com.automationPractice.qa.Pages.OrderSlipPage;
import com.automationPractice.qa.Pages.SignInPage;
import com.automationPractice.qa.TestBase.TestBase;

public class OrdeSlipPageTest extends TestBase {

	LandingPage lp;
	SignInPage sp;
	MyAccountPage mp;
	OrderSlipPage op;

	@BeforeMethod
	public void intialise() {
		setUp();
		lp = new LandingPage();
		sp = lp.clickSignInButton();
		mp = sp.login("msp123@it.com", "Password1");
		op = mp.clickMyCreditButton();

	}

	@Test
	public void verifyBannerText() {

		String bannerText = op.getBannerText();
		Assert.assertEquals(bannerText, "You have not received any credit slips.");

	}

	@Test
	public void verifyTitleOfOrderListPage() {
		Assert.assertEquals(wd.getTitle(), "Order slip - My Store");
	}

	@AfterMethod
	public void quit() {
		tearDown();
	}

}
