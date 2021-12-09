package com.automationPractise.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationPractice.qa.TestBase.TestBase;

public class ContactUsPage extends TestBase {

	public ContactUsPage() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(id = "message")
	WebElement messageInput;

	@FindBy(id = "email")
	WebElement emailInput;

	
	public void sendMessage(String message) {
		messageInput.sendKeys(message);
	}

}
