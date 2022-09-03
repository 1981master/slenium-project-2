package utils;

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

public class Util {

	Common common;

	static WebDriver driver;
	

	public void setupBrowser() throws IOException {
		String fileBath="./src/test/resources/config.properties";
		Properties pros;
		pros = new Properties();
		FileInputStream ip = new FileInputStream(fileBath);
		pros.load(ip);
		String url = pros.getProperty("url");
		String browser = pros.getProperty("browser");
		System.out.println("*****************"+url);
		
		common = new Common();
		common.setupBrowser(browser, url);
		//driver = common.getDriver();
	}

	public WebDriver getDriver() {
		try {
			return common.getDriver();
		} catch (Exception e) {
			e.printStackTrace();
		};
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		Util.driver = driver;
	}

	public void quitBrowser() {
		common.quitBrowser();
	}
	
	
}
