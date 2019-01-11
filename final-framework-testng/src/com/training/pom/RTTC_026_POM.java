package com.training.pom;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RTTC_026_POM {
	private WebDriver driver; 
	
	public RTTC_026_POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="input-username")
	private WebElement UserName; 
	@FindBy(id="input-password")
	private WebElement Password;
	@FindBy(xpath="//*[@id='content']/div/div/div/div/div[2]/form/div[3]/button")
	private WebElement LoginBtn; 
	@FindBy(xpath="//*[@id='button-menu']/i")
	private WebElement ButtonMenu;
	@FindBy(linkText="Reports")
	private WebElement Reports;
	@FindBy(linkText="Products")
	private WebElement Products;
	
	@FindBy(linkText="Purchased")
	private WebElement Purchased;
	
	@FindBy(id="input-status")
	private WebElement OrderStatus;
	
	@FindBy(id="button-filter")
	private WebElement FilterBtn;

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
	
	public void clickButtonMenu() {
		this.ButtonMenu.click(); 
	}
	
	public void clickReports() {
		this.Reports.click();
	}

	public void clickProducts() {
		this.Products.click();
	}
	
	public void clickPurchased() {
		this.Purchased.click();
	}
	
	public void clickOrderStatus() {
		this.OrderStatus.click();
		Select orderStatus = new Select(OrderStatus);
		orderStatus.selectByVisibleText("Complete");
	}
	
	public void clickFilterBtn() {
		this.FilterBtn.click();
	}
}
