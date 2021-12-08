package com.automationPractise.qa.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.automationPractice.qa.TestBase.TestBase;

public class ContactUsPage extends TestBase {

	WebElement messageInput = wd.findElement(By.id("hdgd"));

	WebElement getTheTextFromHeader = wd.findElement(By.id("hdgd"));

	public void sendMessage(String message) {
		messageInput.sendKeys(message);
	}

	public String getTextFromHead() {
		return getTheTextFromHeader.getText();
	}

}
