package com.automationPractice.qa.PageTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationPractice.qa.TestBase.TestBase;
import com.automationPractise.qa.Pages.ContactUsPage;
import com.automationPractise.qa.Pages.LandingPage;

public class ContactUsPageTest extends TestBase {

	LandingPage lp;
	ContactUsPage cp;

	@BeforeMethod
	public void intialise() {
		setUp();
		lp = new LandingPage();
		cp = lp.clickContactUs();
	}

	@Test
	public void sendTextToMessageInput() {
		cp.sendMessage("Learning Automation");

	}

}
