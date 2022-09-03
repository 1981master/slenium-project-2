package test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pom.Login;
import utils.Util;

public class TestClass1 extends BaseTest{

	

	
	@Parameters({"url"})	
	@Test
	public void validURL(String url) {
		Login obj = new Login(driver);
		url = obj.validURL(url);
		//String title = driver.getCurrentUrl();
		String title = driver.getTitle();
		System.out.println(title+" title");
		System.out.println(url);
		assertEquals(title, url, "the titels validation fail...");
	}
	
	
	
}
