package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RTTC_059_POM {
	private WebDriver driver; 
	
	public RTTC_059_POM(WebDriver driver) {
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
	
	@FindBy(linkText="Marketing")
	private WebElement Marketing;
		
	@FindBy(linkText="Affiliates")
	private WebElement Affiliates;
	
	@FindBy(xpath="//*[@id='content']/div[1]/div/div/a")
	private WebElement AddNewIcon;
	
	@FindBy(id="input-firstname")
	private WebElement FirstName;

	@FindBy(id="input-lastname")
	private WebElement LastName;
	
	@FindBy(id="input-email")
	private WebElement Email;
	
	@FindBy(id="input-telephone")
	private WebElement Telephone;
	
	@FindBy(id="input-password")
	private WebElement Password1;
	
	@FindBy(id="input-confirm")
	private WebElement Confirm;
	
	@FindBy(id="input-address-1")
	private WebElement Address1;
	
	@FindBy(id="input-address-2")
	private WebElement Address2;
	
	@FindBy(id="input-city")
	private WebElement City;
	
	@FindBy(id="input-postcode")
	private WebElement Postcode;
	
	@FindBy(id="input-country")
	private WebElement Country;
	
	@FindBy(id="input-zone")
	private WebElement State;
		
	@FindBy(linkText="Payment Details")
	private WebElement paymentDetails;
	
	@FindBy(id="input-cheque")
	private WebElement ChequeName;
	
	@FindBy(xpath="//*[@id='content']/div[1]/div/div/button")
	private WebElement SaveIcon;
	
	@FindBy(xpath="//*[@id='content']/div[2]/div[1]")
	private WebElement successmessage;
	
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
	
	public void clickMarketing() {
		this.Marketing.click();
	}
		
	public void clickAffiliates() {
		this.Affiliates.click();
	}
	
	public void clickAddNewIcon() {
		this.AddNewIcon.click();
	}
	
	public void sendFirstName(String FirstName) {
		this.FirstName.clear();
		this.FirstName.sendKeys(FirstName);
	}
	
	public void sendLastName(String LastName) {
		this.LastName.clear();
		this.LastName.sendKeys(LastName);
	}
	
	public void sendEmail(String Email) {
		this.Email.clear();
		this.Email.sendKeys(Email);
	}
	
	public void sendTelephone(String Telephone) {
		this.Telephone.clear();
		this.Telephone.sendKeys(Telephone);
	}
	
	public void sendPassword1(String Password1) {
		this.Password1.clear();
		this.Password1.sendKeys(Password1);
	}
	
	public void sendConfirm(String Confirm) {
		this.Confirm.clear();
		this.Confirm.sendKeys(Confirm);
	}
	
	public void sendAddress1(String Address1) {
		this.Address1.clear();
		this.Address1.sendKeys(Address1);
	}

	public void sendAddress2(String Address2) {
		this.Address2.clear();
		this.Address2.sendKeys(Address2);
	}

	public void sendCity(String City) {
		this.City.clear();
		this.City.sendKeys(City);
	}

	public void sendPostcode(String Postcode) {
		this.Postcode.clear();
		this.Postcode.sendKeys(Postcode);
	}

	public void clickCountry() {
		this.Country.click();
		Select country = new Select(Country);
		country.selectByVisibleText("India");
	}
	
	public void clickState() {
		this.State.click();
		Select state = new Select(State);
		state.selectByVisibleText("Telangana");
	}
	
	public void clickPaymentDetails() {
		this.paymentDetails.click();
	}
	
	public void sendChequeName(String ChequeName) {
		this.ChequeName.clear();
		this.ChequeName.sendKeys(ChequeName);

	}
		
	public void clickSaveIcon() {
		this.SaveIcon.click();
	}
	
	public void validateSuccessMessage() {
		boolean successmessage = driver.findElement(By.xpath("//*[@id='content']/div[2]/div[1]")).isDisplayed();
		
		if(successmessage == true)
		{
			System.out.println("Success: You have modified affiliates!");
		}
		else {
			System.out.println("Warning: Please check the form carefully for errors!");	
		}
	}
	
}


