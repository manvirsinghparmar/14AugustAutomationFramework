package com.automationPractice.qa.PageTest;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.automationPractice.qa.TestBase.TestBase;
import com.automationPractise.qa.Pages.ContactUsPage;
import com.automationPractise.qa.Pages.LandingPage;
import com.automationPractise.qa.Utils.ExcelUtils;

public class ContactUsPageTest extends TestBase {

	ContactUsPage cp;
	LandingPage lp;

	@BeforeMethod
	public void intialise() {

		setUp();
		lp=new LandingPage();
		cp = lp.clickContactUs();

	}

	@Test(dataProvider = "contactUs")
	public void sendConatctUsMessage(String email, String message) {
		cp.selectHeading();
		cp.sendEmail(email);
		cp.sendMessage(message);
		cp.clickSub();

	}

	@AfterMethod
	public void quit() {
		tearDown();
	}

	@DataProvider(name = "contactUs")
	public String[][] dataProviderForContactUs() throws Exception {
		String path = "C:\\Users\\Owner\\Desktop\\Selenium Training\\Contact Us.xlsx";
		int rowsCount = ExcelUtils.getRowCount(path, "Sheet1");
		int cellCount = ExcelUtils.getCellCount(path, "Sheet1", rowsCount);

		String[][] data = new String[rowsCount][cellCount];

		for (int i = 1; i <= rowsCount; i++) {
			for (int j = 0; j < cellCount; j++) {
				data[i - 1][j] = ExcelUtils.getCellData(path, "Sheet1", i, j);

			}

		}

		return data;

	}

}
