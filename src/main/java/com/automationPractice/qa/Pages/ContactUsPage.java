package com.automationPractice.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.automationPractice.qa.TestBase.TestBase;

public class ContactUsPage extends TestBase {

	public ContactUsPage() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(id = "message")
	WebElement messageInput;

	@FindBy(id = "email")
	WebElement emailInput;

	@FindBy(id = "id_contact")
	WebElement selectHeading;

	@FindBy(id = "submitMessage")
	WebElement submitBtn;

	public void sendMessage(String message) {
		messageInput.sendKeys(message);
	}

	public void sendEmail(String email) {
		emailInput.sendKeys(email);
	}

	public void selectHeading() {
		Select select = new Select(selectHeading);

		select.selectByIndex(1);
	}

	public void clickSub() {
		submitBtn.click();
	}

}
