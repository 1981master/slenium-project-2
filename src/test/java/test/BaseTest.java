package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import utils.Common;
import utils.Util;


public class BaseTest {

	Common common;

	static WebDriver driver;
	
	@Parameters({"browser", "url"})
	@BeforeSuite
	public void beforeTest(String browser, String url) throws IOException {
		Util obj = new Util();
		obj.setupBrowser();
		driver = obj.getDriver();
		
//		common = new Common();
//		common.setupBrowser(browser, url);
//		driver = common.getDriver();
	}
	
	@AfterSuite
	public void afterTest() {
		driver.quit();
	}
	
	
}
