package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.RTTC_089_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RTTC_089Tests {

	private WebDriver driver;
	private String baseUrl1;
	private String baseUrladmin;
//	private LoginPOM loginPOM;
	private RTTC_089_POM RTTC089POM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		RTTC089POM = new RTTC_089_POM(driver);
		baseUrl1 = properties.getProperty("baseURL1");
		screenShot = new ScreenShot(driver); 
		driver.get(baseUrl1);  		// open the browser 

/*		baseUrladmin = properties.getProperty("baseURLadmin");
		screenShot = new ScreenShot(driver);
		driver.get(baseUrladmin); // open the browser
*/
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
	//	driver.quit();
	}                                     

	@Test
	public void validRetailLoginTest089() throws InterruptedException {
		screenShot.captureScreenShot("TC89_1_ApplicationScreen");
		System.out.println("Application launched successfully");
		
		RTTC089POM.clickShopNow();
		screenShot.captureScreenShot("TC89_2_ShopNowlistScreen"); 
		System.out.println("Shop Now link clicked successfully");
	
		RTTC089POM.clickEthnic();
		screenShot.captureScreenShot("TC89_3_EthnicScreen"); 
		System.out.println("Ethnic link clicked successfully");
	
		RTTC089POM.clickProductName();
		Thread.sleep(5000);
		screenShot.captureScreenShot("TC89_4_ProductScreen"); 
		System.out.println("ProductName link clicked successfully");
		
		driver.navigate().to("http://retail.hommelle.com/integer-vitae-iaculis-massa");
		Thread.sleep(5000);
		screenShot.captureScreenShot("TC89_5_AddToCartScreen");
		RTTC089POM.clickAddToCartBtn();
		//screenShot.captureScreenShot("TC89_5_AddToCartScreen"); 
		System.out.println("AddtoCart page displayed successfully");
		Thread.sleep(20000);
		
		RTTC089POM.clickCartIcon();
		screenShot.captureScreenShot("TC89_6_CartIconScreen"); 
		System.out.println("CartIcon clicked successfully");
		Thread.sleep(5000);
		screenShot.captureScreenShot("TC89_7_ViewCartScreen"); 
		System.out.println("View Cart button clicked successfully");
		Thread.sleep(5000);
		
		RTTC089POM.clickCheckOutBtn();
		screenShot.captureScreenShot("TC89_8_CheckOutScreen"); 
		System.out.println("Check Out button clicked successfully");
		
	/*	RTTC089POM.clickCheckoutoptions();
		screenShot.captureScreenShot("TC89_9_CheckoutOptionsScreen"); 
		System.out.println("Checkout Options arrow clicked successfully");
	*/					
		RTTC089POM.clickGuestCheckoutradiobtn();
		screenShot.captureScreenShot("TC89_9_Guest CheckoutScreen"); 
		System.out.println("Guest CheckOut radio button checked successfully");
		
		RTTC089POM.clickContinueBtn1();
		screenShot.captureScreenShot("TC89_10_ContinueBtn1Screen"); 
		System.out.println("Continue1 button clicked successfully");
				
		RTTC089POM.sendFirstName("Madhavi");
		RTTC089POM.sendLastName("Mallapuram");
		RTTC089POM.sendEmail("mmadhavi@in.ibm.com");
		RTTC089POM.sendTelephone("9876543210");
		RTTC089POM.sendAddress1("abcdef123");
		RTTC089POM.sendAddress2("ghijk");
		RTTC089POM.sendCity("Hyderabad");
		RTTC089POM.sendPostCode("500048");
		RTTC089POM.clickCountry();
		RTTC089POM.clickState();
		screenShot.captureScreenShot("TC89_11_UserRegisterDetailsScreen"); 
		System.out.println("User entered details successfully");
		
		RTTC089POM.clickContinueBtn2();
		screenShot.captureScreenShot("TC89_12_ContinueBtn2Screen"); 
		System.out.println("Continue2 button clicked successfully");
		
		RTTC089POM.sendAddCommentsBox("Good Productss");
		screenShot.captureScreenShot("TC89_13_AddCommentsScreen"); 
		System.out.println("Comments entered successfully");
		
		RTTC089POM.clickContinueBtn3();
		screenShot.captureScreenShot("TC89_14_ContinueBtn3Screen"); 
		System.out.println("Continue3 button clicked successfully");
		Thread.sleep(3000);
		
		RTTC089POM.clickTermsCondnCheckbox();
		screenShot.captureScreenShot("TC89_15_TermsAndConditionsScreen"); 
		System.out.println("TermsAndConditions checkbox checked successfully");
		
		RTTC089POM.clickContinueBtn4();
		screenShot.captureScreenShot("TC89_16_ContinueBtn4Screen"); 
		System.out.println("Continue4 button clicked successfully");
		Thread.sleep(3000);
		
		RTTC089POM.clickConfirmBtn();
		screenShot.captureScreenShot("TC89_17_ConfirmBtnScreen"); 
		System.out.println("Confirm button clicked successfully");
		
		RTTC089POM.LaunchAdminURL();
		screenShot.captureScreenShot("TC89_18_AdminLoginScreen");
		RTTC089POM.sendUserName("admin");
		RTTC089POM.sendPassword("admin@123");
		RTTC089POM.clickAdminLoginBtn(); 
		System.out.println("Admin Login successful");
		
		screenShot.captureScreenShot("TC89_19_DashboardScreen");
		RTTC089POM.clickButtonMenu();
		
		RTTC089POM.clickSalesLink();
		screenShot.captureScreenShot("TC89_20_SalesScreen"); 
		System.out.println("Sales link clicked successfully");
		
		RTTC089POM.clickOrdersLink();
		screenShot.captureScreenShot("TC89_21_OrdersScreen"); 
		System.out.println("Sales link clicked successfully");
		
		RTTC089POM.clickEyeIcon();
		screenShot.captureScreenShot("TC89_22_EyeIconScreen"); 
		System.out.println("EyeIcon clicked successfully");
		
		RTTC089POM.clickOrderStatusdropdown();
		screenShot.captureScreenShot("TC89_23_OrderStatusScreen1"); 
		System.out.println("OrderStatus-Canceled Reversal selected successfully");
		
		RTTC089POM.clickOrderStatusdropdown1();
		screenShot.captureScreenShot("TC89_24_OrderStatusScreen2"); 
		System.out.println("OrderStatus-Complete selected successfully");
		
		RTTC089POM.clickAddHistoryBtn();
		screenShot.captureScreenShot("TC89_25_AddHistoryScreen"); 
		System.out.println("Add History button clicked successfully");
		
		RTTC089POM.LaunchBaseURL();
		screenShot.captureScreenShot("TC89_26_BaseURLScreen2"); 
		System.out.println("Launch BaseURL successfully");
				
	//	screenShot.captureScreenShot("TC89_1_UserLoginScreen");
		RTTC089POM.sendEmailAddress("mmadhavi@in.ibm.com");
		RTTC089POM.sendPassword("madhavi@123");
		RTTC089POM.clickBaseLoginBtn(); 
		System.out.println("BaseUrlLogin Successful");
		Thread.sleep(5000);
		screenShot.captureScreenShot("TC89_27_MyAccountScreen");
		System.out.println("MyAccount page displayed successfully");
		
		RTTC089POM.clickOrderHistoryLink();
		screenShot.captureScreenShot("TC89_28_OrderHistoryScreen");
		System.out.println("Orderhistory page displayed successfully");
	}
}
