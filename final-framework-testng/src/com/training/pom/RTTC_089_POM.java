package com.training.pom;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RTTC_089_POM {
	private WebDriver driver; 
	
	public RTTC_089_POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	//Without Login
	
	@FindBy(xpath="//*[@id='menu_all_categories_Menu_VIfWm2LT_Sb0I5']/a")
	private WebElement ShopNow;
	
	@FindBy(xpath="//*[@id='menu_all_categories_Menu_VIfWm2LT_Sb0I5']/ul/li[1]/a/span")
	private WebElement Ethnic;
	
	@FindBy(linkText="Integer Vitae Iaculis Massa")
	private WebElement ProductName;
	
	@FindBy(id="button-cart")
	private WebElement AddToCartBtn;
	
	@FindBy(xpath="//*[@id='cart']/ul/li/h3/a/i")
	private WebElement CartIcon;
	
	@FindBy(xpath="//*[@id='cart']/ul/li/div/div/div[3]/a[1]")
	private WebElement ViewCartBtn;
	
	@FindBy(xpath="//*[@id='System_V2Exp1o9']/div[3]/div[2]/a")
	private WebElement CheckOutBtn;
	
	@FindBy(xpath="//*[@id='accordion']/div[1]/div[1]/h4/a")
	private WebElement Checkoutoptions;
	
	@FindBy(xpath="//*[@id='collapse-checkout-option']/div/div/div[1]/div[1]/div/div[2]/label/input")
	private WebElement GuestCheckoutradiobtn;

	@FindBy(id="button-account")
	private WebElement ContinueBtn1;
	
	@FindBy(id="input-payment-firstname")
	private WebElement FirstName;

	@FindBy(id="input-payment-lastname")
	private WebElement LastName;

	@FindBy(id="input-payment-email")
	private WebElement Email;

	@FindBy(id="input-payment-telephone")
	private WebElement Telephone;

	@FindBy(id="input-payment-address-1")
	private WebElement Address1;

	@FindBy(id="input-payment-address-2")
	private WebElement Address2;

	@FindBy(id="input-payment-city")
	private WebElement City;

	@FindBy(id="input-payment-postcode")
	private WebElement PostCode;

	@FindBy(id="input-payment-country")
	private WebElement Country;

	@FindBy(id="input-payment-zone")
	private WebElement State;
	
	@FindBy(xpath="//*[@id='collapse-payment-address']/div/div[2]/div[1]/label")
	private WebElement MyAddresscheckbox;

	@FindBy(id="button-guest")
	private WebElement ContinueBtn2;
	
	@FindBy(xpath="//*[@id='collapse-shipping-method']/div/p[4]/textarea")
	private WebElement AddCommentsBox;
	
	@FindBy(id="button-shipping-method")
	private WebElement ContinueBtn3;
	
	@FindBy(xpath="//*[@id='collapse-payment-method']/div/div[2]/div[1]/label")
	private WebElement TermsCondnCheckbox;
	
	@FindBy(id="button-payment-method")
	private WebElement ContinueBtn4;

	@FindBy(id="button-confirm")
	private WebElement ConfirmBtn;
	
	//Login as Admin
	@FindBy(id="input-username")
	private WebElement UserName; 
	
	@FindBy(id="input-password")
	private WebElement Password;
	
	@FindBy(xpath="//*[@id='content']/div/div/div/div/div[2]/form/div[3]/button")
	private WebElement AdminLoginBtn; 
	
	@FindBy(xpath="//*[@id='button-menu']/i")
	private WebElement ButtonMenu;
	
	@FindBy(linkText="Sales")
	private WebElement SalesLink; 
	
	@FindBy(linkText="Orders")
	private WebElement OrdersLink; 
	
	@FindBy(xpath="//*[@id='form-order']/div/table/tbody/tr[1]/td[8]/a[1]/i")
	private WebElement EyeIcon;

	@FindBy(id="input-order-status")
	private WebElement OrderStatusdropdown;
	
	@FindBy(id="button-history")
	private WebElement AddHistoryBtn;
	
	//Login as User
	
	@FindBy(xpath="//*[@id='input-email']")
	private WebElement EmailAddress; 
	
	@FindBy(xpath="//*[@id='input-password']")
	private WebElement password;
	
	@FindBy(xpath="/html/body/div/section[2]/div/div/div/div/div/div/div/div[2]/div/form/div/div[2]/input")
	private WebElement BaseLoginBtn; 

	@FindBy(linkText="Order History")
	private WebElement OrderHistoryLink;

	
	public void clickShopNow() {
		this.ShopNow.click();
	/*	Actions action;
		action = new Actions(driver);
		action.moveToElement(ShopNow);  */
	}
	
	public void clickEthnic() {
		this.Ethnic.click();
	}
	
	public void clickProductName() {
		this.ProductName.click();
	}
	
	public void clickAddToCartBtn() {
		this.AddToCartBtn.click();
	}
	
	public void clickCartIcon() {
		this.CartIcon.click();
	/*	Actions action = new Actions(driver);
		action.moveToElement(CartIcon); */
	}
	
	public void clickViewCartBtn() {
		this.ViewCartBtn.click();
	}
	
	public void clickCheckOutBtn() {
		this.CheckOutBtn.click();
	}
	
	public void clickCheckoutoptions() {
		this.Checkoutoptions.click();
	}
		
	public void clickGuestCheckoutradiobtn() {
		this.GuestCheckoutradiobtn.click();
		WebElement guestRadioBtn = driver.findElement(By.xpath("//*[@id='collapse-checkout-option']/div/div/div[1]/div[1]/div/div[2]"));
		
		boolean guestradiobtndisplayed = guestRadioBtn.isDisplayed();
		System.out.println("Guest button is displayed"+guestradiobtndisplayed);
		
		boolean guestradiobtnenabled = guestRadioBtn.isEnabled();
		System.out.println("Guest button is enabled"+guestradiobtnenabled);
		
		boolean guestradiobtnselected = guestRadioBtn.isSelected();
		System.out.println("Guest button is selected"+guestradiobtnselected);
	
		guestRadioBtn.click();
	}
	
	public void clickContinueBtn1() {
		this.ContinueBtn1.click();
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
	
	public void sendPostCode(String PostCode) {
		this.PostCode.clear();
		this.PostCode.sendKeys(PostCode);
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
	
	public void clickContinueBtn2() {
		this.ContinueBtn2.click();
	}
	
	public void sendAddCommentsBox(String AddCommentsBox) {
		this.AddCommentsBox.clear();
		this.AddCommentsBox.sendKeys(AddCommentsBox);
	}
	
	public void clickContinueBtn3() {
		this.ContinueBtn3.click();
	}
	
	public void clickTermsCondnCheckbox() {
		this.TermsCondnCheckbox.click();
	}
	
	public void clickContinueBtn4() {
		this.ContinueBtn4.click();
	}
	
	public void clickConfirmBtn() {
		this.ConfirmBtn.click();
	}
	
	public void LaunchAdminURL() {
		driver.get("http://retail.hommelle.com/admin");
	}
	
	public void sendUserName(String UserName) {
		this.UserName.clear();
		this.UserName.sendKeys(UserName);
	}
	
	public void sendPassword(String Password) {
		this.Password.clear(); 
		this.Password.sendKeys(Password); 
	}
	
	public void clickAdminLoginBtn() {
		this.AdminLoginBtn.click(); 
	}
	
	public void clickButtonMenu() {
		this.ButtonMenu.click();
	}
	
	public void clickSalesLink() {
		this.SalesLink.click();
	}
	
	public void clickOrdersLink() {
		this.OrdersLink.click();
	}
	
	public void clickEyeIcon() {
		this.EyeIcon.click();
	}
	
	public void clickOrderStatusdropdown() {
		this.OrderStatusdropdown.click();
		Select orderStatus = new Select(OrderStatusdropdown);
		orderStatus.selectByVisibleText("Canceled Reversal");
	}
	
	public void clickOrderStatusdropdown1() {
		this.OrderStatusdropdown.click();
		Select orderStatus1 = new Select(OrderStatusdropdown);
		orderStatus1.selectByVisibleText("Complete");
	}

	public void clickAddHistoryBtn() {
		this.AddHistoryBtn.click();
	}
	
	public void LaunchBaseURL() {
		driver.get("http://retail.hommelle.com/account/login");
	}
	
	public void sendEmailAddress(String EmailAddress) {
		this.EmailAddress.clear();
		this.EmailAddress.sendKeys(EmailAddress);
	}
	
	public void sendpassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickBaseLoginBtn() {
		this.BaseLoginBtn.click();
	}
	
	public void clickOrderHistoryLink() {
		this.OrderHistoryLink.click();
	}
	
	public void validateStatus() {
		boolean status = driver.findElement(By.xpath("//*[@id='System_epRD9Fax']/div[1]/table/thead/tr/td[4]")).isDisplayed();
		
		if(status == true)
		{
			System.out.println("Status is in Complete state");
		}
		else {
			System.out.println("Warning: Please check the form carefully for errors!");	
		}
	}
	
}
