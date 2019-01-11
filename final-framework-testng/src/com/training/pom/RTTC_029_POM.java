package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RTTC_029_POM {
	private WebDriver driver; 
	
	public RTTC_029_POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="input-username")
	private WebElement UserName; 
	@FindBy(id="input-password")
	private WebElement Password;
	@FindBy(xpath="//*[@id='content']/div/div/div/div/div[2]/form/div[3]/button")
	private WebElement LoginBtn; 
	@FindBy(xpath="//*[@id='header']/ul/li[4]/a/span")
	private WebElement LogoutBtn;

	public void sendUserName(String UserName) {
		this.UserName.clear();
		this.UserName.sendKeys(UserName);
	}
	
	public void sendPassword(String Password) {
		this.Password.clear(); 
		this.Password.sendKeys(Password); 
	}
	
	public void clickLoginBtn() {
		this.LoginBtn.click(); 
	}
	
	public void clickLogoutBtn() {
		this.LogoutBtn.click();
	}
}
