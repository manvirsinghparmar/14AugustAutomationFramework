package com.automationPractice.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationPractice.qa.TestBase.TestBase;

public class OrderSlipPage extends TestBase {

	public OrderSlipPage() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(id = "block-history")
	WebElement creditBanner;

	public String getBannerText() {
		String textFromBanner = creditBanner.getText();
		return textFromBanner;
	}

}
