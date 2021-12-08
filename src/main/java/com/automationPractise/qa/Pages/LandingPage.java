package com.automationPractise.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationPractice.qa.TestBase.TestBase;

public class LandingPage extends TestBase {
	
	public LandingPage() {

		PageFactory.initElements(wd, this);
	}

	@FindBy(id = "contact-link")
	WebElement contactUsButton;

	@FindBy(css = "div.header_user_info")
	WebElement signInButton;

	

	public void clickContactUs() {
		contactUsButton.click();
	}

	public void clickSignInButton() {
		signInButton.click();
	}

}
