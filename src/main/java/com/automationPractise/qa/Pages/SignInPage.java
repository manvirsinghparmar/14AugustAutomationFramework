package com.automationPractise.qa.Pages;

import org.openqa.selenium.support.PageFactory;

import com.automationPractice.qa.TestBase.TestBase;

public class SignInPage extends TestBase {

	public SignInPage() {
		PageFactory.initElements(wd, this);
	}

}
