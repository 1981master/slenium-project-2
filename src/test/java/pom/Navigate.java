package pom;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import test.BaseTest;

public class Navigate extends BaseTest{


//	private WebDriver driver;
	
	
	@CacheLookup
	@FindBy(id = "nav-link-accountList")
	WebElement wishList;	
	
	
	@CacheLookup
	@FindBy(xpath = "//span[text()=\"Create a Wish List\"]")
	WebElement createWList;

	
	@CacheLookup
	@FindBy(id = "nav_cs_9")
	WebElement newReleses;
	
	
	@CacheLookup
	@FindBy(xpath = "//span[text()=\"Sign in\"]")
	WebElement signIn;
	
	
	@CacheLookup
	@FindBy(id = "ap_email")
	WebElement email;
	
	//change Iframe
	@CacheLookup
	@FindBy(id = "ap_password")
	WebElement passwordField;
	
	
	
	//main entry for the website Amazon, search field.
	@CacheLookup
	@FindBy(id = "twotabsearchtextbox")
	WebElement searchField;
	
	//this text may change due to number or search result
	@CacheLookup
	@FindBy(xpath = "//span[text()=\"1-16 of 77 results for\"]")
	WebElement validateSearchResult;
	
	
	//select 4 stars and up review.
	@CacheLookup
	@FindBy(xpath = "//i[@class=\"a-icon a-icon-star-medium a-star-medium-4\"]")
	WebElement select4StarandUp;
	
//	@CacheLookup
//	@FindBy(tagName = "button")
//	WebElement loginBtn;
//	
//	@CacheLookup
//	@FindBy(partialLinkText = "Forgotten password?")
//	WebElement forgotPasswordLink;
//	
//	@CacheLookup
//	@FindBy(partialLinkText = "Forgotten password?")
//	WebElement validURL;
//	
	
//	public Login(WebDriver driver){
//		this.driver = driver;
//		PageFactory.initElements(driver, this);
//	}
	
	public void navigate_to_Create_a_Wish_List(String username, String password) {

//		
//		Reporter.log("username = " + username);
//		Reporter.log("password = " + password);
//		email.clear();
//		email.sendKeys(username);
//		
//		passwd.clear();
//		passwd.sendKeys(password);
		wishList.click();
		createWList.click();
//		loginBtn.click(); 
	}
//	
//	public String validURL(String url) {
//		
//		return driver.getTitle();
//	}
	
//	public void validURL(String username) {
//		forgotPasswordLink.click();
//	}
	

	
	
	
	
	
	
	
	
	
}
