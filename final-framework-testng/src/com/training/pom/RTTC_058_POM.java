package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RTTC_058_POM {
	private WebDriver driver; 
	
	public RTTC_058_POM(WebDriver driver) {
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
		
	@FindBy(linkText="Coupons")
	private WebElement Coupons;
	
	@FindBy(xpath="//*[@id='content']/div[1]/div/div/a/i")
	private WebElement AddNewicon;
	
	@FindBy(id="input-name")
	private WebElement CouponName;

	@FindBy(id="input-code")
	private WebElement Code;
	
	@FindBy(id="input-discount")
	private WebElement DiscountBox;
	
	@FindBy(id="input-product")
	private WebElement ProductsBox;
	
	@FindBy(id="input-date-start")
	private WebElement StartDate;
	
	@FindBy(id="input-date-end")
	private WebElement EndDate;
		
	@FindBy(xpath="//*[@id='content']/div[1]/div/div/button/i")
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
		
	public void clickCoupons() {
		this.Coupons.click();
	}
	
	public void clickAddnewIcon() {
		this.AddNewicon.click();
	}
	
	public void sendCouponName(String CouponName) {
		this.CouponName.clear();
		this.CouponName.sendKeys(CouponName);
	}
	
	public void sendCode(String Code) {
		this.Code.clear();
		this.Code.sendKeys(Code);
	}
			
	public void sendDiscountBox(String DiscountBox) {
		this.DiscountBox.clear();
		this.DiscountBox.sendKeys(DiscountBox);
	}
	
	public void sendProductsBox(String ProductsBox) {
		this.ProductsBox.clear();
		this.ProductsBox.sendKeys(ProductsBox);
	}
	
	public void sendStartDate(String StartDate) {
		this.StartDate.clear();
		this.StartDate.sendKeys(StartDate);
	}
	
	public void sendEndDate(String EndDate) {
		this.EndDate.clear();
		this.EndDate.sendKeys(EndDate);
	}
			
	public void clickSaveIcon() {
		this.SaveIcon.click();	
	}
	
	public void validateSuccessMessage() {
		boolean successmessage = driver.findElement(By.xpath("//*[@id='content']/div[2]/div[1]")).isDisplayed();
		
		if(successmessage == true)
		{
			System.out.println("Success: You have modified products!");
		}
		else {
			System.out.println("Warning: Please check the form carefully for errors!");	
		}
		
	
		
	}
}
