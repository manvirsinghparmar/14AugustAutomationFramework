package com.automationPractice.qa.Pages;

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

	@FindBy(id = "header_logo")
	WebElement logo;

	@FindBy(id = "search_query_top")
	WebElement searchQueryInput;

	@FindBy(css = "button[type='submit']")
	WebElement searchBtn;

	@FindBy(css = "#center_column p")
	WebElement errorMessage;

	public ContactUsPage clickContactUs() {
		contactUsButton.click();
		return new ContactUsPage();
	}

	public SignInPage clickSignInButton() {
		signInButton.click();
		return new SignInPage();
	}

	public boolean isLogoDisplayed() {
		return logo.isDisplayed();
	}

	public void enterTextInSearchField(String query) {
		searchQueryInput.sendKeys(query);
	}

	public void clickOnSearchButton() {
		searchBtn.submit();
	}

	public String getErrorMessageText() {
		return errorMessage.getText();
	}

}
