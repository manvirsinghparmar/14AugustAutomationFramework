package com.automationPractice.qa.TestBase;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.BeforeClass;

import com.automationPractise.qa.Utils.WebDriverFiringEventListener;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver wd;
	public static Properties prop;
	public static Logger logger;
	public static EventFiringWebDriver e_driver;
	public static WebDriverFiringEventListener eventlistner;

	public TestBase() {

		prop = new Properties();

		try {
			FileInputStream fs = new FileInputStream(
					"C:\\Users\\Owner\\eclipse-workspace\\14AugBatch\\src\\main\\java\\com\\automationPractise\\qa\\Properties\\config.properties");

			prop.load(fs);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@BeforeClass
	public void loggerSetup() {
		logger = Logger.getLogger(TestBase.class);
		PropertyConfigurator.configure("log4j.properties");
		BasicConfigurator.configure();

		logger.setLevel(Level.INFO);
	}

	public void setUp() {
		String browserName = prop.getProperty("browser");

		// Intialising the webdriver
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			wd = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			wd = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			wd = new EdgeDriver();
		} else {
			System.out.println("Browser name is not correct");
		}

		e_driver = new EventFiringWebDriver(wd);

		eventlistner = new WebDriverFiringEventListener();
		e_driver.register(eventlistner);

		wd = e_driver;

		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// opening the webpage
		wd.get(prop.getProperty("url"));

	}

	public void tearDown() {
		wd.quit();

	}

}
