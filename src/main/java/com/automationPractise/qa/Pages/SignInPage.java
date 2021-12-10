package com.automationPractise.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationPractice.qa.TestBase.TestBase;

public class SignInPage extends TestBase {

	public SignInPage() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(id = "email")
	WebElement emailInputField;

	@FindBy(id = "passwd")
	WebElement passwordInput;

	@FindBy(id = "SubmitLogin")
	WebElement submitButton;

	public MyAccountPage login(String email, String password) {
		emailInputField.sendKeys(email);
		passwordInput.sendKeys(password);
		submitButton.click();

		return new MyAccountPage();
	}

}
