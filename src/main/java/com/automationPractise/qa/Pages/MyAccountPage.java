package com.automationPractise.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationPractice.qa.TestBase.TestBase;

public class MyAccountPage extends TestBase {

	public MyAccountPage() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(css = "div.header_user_info a span")
	WebElement userName;

	@FindBy(css = "ul.myaccount-link-list li:nth-of-type(3)")
	WebElement myCreditBtn;

	public String getUserNameText() {
		String userNameText = userName.getText();
		return userNameText;
	}

	public OrderSlipPage clickMyCreditButton() {
		myCreditBtn.click();
		return new OrderSlipPage();
	}

}
