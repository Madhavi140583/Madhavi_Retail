package com.training.pom;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RTTC_027_POM {
	private WebDriver driver; 
	
	public RTTC_027_POM(WebDriver driver) {
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
	
	@FindBy(xpath="//*[@id='menu-report']/ul/li[3]/a")
	private WebElement Customers;
	
	@FindBy(linkText="Customers Online")
	private WebElement CustomersOnline;
	
//	@FindBy(xpath="//*[@id='input-customer']")
	@FindBy(id="input-customer")
	private WebElement CustomerField;
	
//	@FindBy(xpath = "//*[@id='input-ip']")
//	@FindBy(id="input-ip")   
	private WebElement CustomerIp;
	
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
	
	public void clickCustomers() {
		this.Customers.click();
	}
	
	public void clickCustomersOnline() {
		this.CustomersOnline.click();
	}
	
	public void sendCustomersField(String CustomerField) {
		this.CustomerField.clear();
		this.CustomerField.sendKeys(CustomerField);
	}
	
	public void sendCustomerIp(String CustomerIp) {
		this.CustomerIp.clear();
		this.CustomerIp.sendKeys(CustomerIp);
	}
	
	public void clickFilterBtn() {
		this.FilterBtn.click();
	}
}
