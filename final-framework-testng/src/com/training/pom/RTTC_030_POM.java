package com.training.pom;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RTTC_030_POM {
	private WebDriver driver; 
	
	public RTTC_030_POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
/*	@FindBy(xpath="/html/body/div/header/div/div/div[3]/div[3]/nav/ul/li[2]/a/span/span/i")
	private WebElement LoginIcon; 
	
	@FindBy(xpath="/html/body/div/header/div/div/div[3]/div[3]/nav/ul/li[2]/ul/li[1]/a/span")
	private WebElement LoginLink; */
	
	@FindBy(xpath="//*[@id='input-email']")
	private WebElement EmailAddress; 
	
	@FindBy(xpath="//*[@id='input-password']")
	private WebElement password;
	
	@FindBy(xpath="/html/body/div/section[2]/div/div/div/div/div/div/div/div[2]/div/form/div/div[2]/input")
	private WebElement loginBtn; 
	
	@FindBy(xpath="/html/body/div/header/div/div/div[3]/div[3]/nav/ul/li[2]/a/span/span/i")
	private WebElement UserIcon;
	
//	@FindBy(xpath="//*[@id='Menu_Wmt3OMY3']/nav/ul/li[2]/ul/li[4]/a/span")
	@FindBy(xpath="/html/body/div/header/div/div/div[3]/div[3]/nav/ul/li[2]/ul/li[4]/a/span")
	private WebElement LogoutLink;
	
//	@FindBy(xpath="/html/body/div/section[2]/div/div/div/div/div/div/div[1]")
	//private WebElement verifyLogoutMessage;
	
/*	public void clickLoginIcon() {
		this.LoginIcon.click(); 
	}
	public void clickLoginLink() {
		this.LoginLink.click(); 
	}
*/	
	public void sendEmailAddress(String EmailAddress) {
		this.EmailAddress.clear();
		this.EmailAddress.sendKeys(EmailAddress);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	
	public void clickUserIcon() {
		this.UserIcon.click(); 
	}
	public void clickLogoutLink() {
		this.LogoutLink.click();
	
	/*	String expectedResult = "You have been logged off your account. It is now safe to leave the computer. Message should get display in the next page";
		String actualResult = this.verifyLogoutMessage.getText();
		assertEquals(actualResult, expectedResult); */
	}
	
}
