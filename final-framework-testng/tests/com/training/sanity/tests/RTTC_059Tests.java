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
import com.training.pom.RTTC_059_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RTTC_059Tests {

	private WebDriver driver;
	private String baseUrladmin;
//	private LoginPOM loginPOM;
	private RTTC_059_POM RTTC059POM;
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
//		loginPOM = new LoginPOM(driver); 
		RTTC059POM = new RTTC_059_POM(driver);
		baseUrladmin = properties.getProperty("baseURLadmin");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrladmin);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	@Test
	public void validRetailLoginTest59() throws InterruptedException {
		screenShot.captureScreenShot("TC59_1_LoginScreen");
		RTTC059POM.sendUserName("admin");
		RTTC059POM.sendPassword("admin@123");
		RTTC059POM.clickLoginBtn(); 
		System.out.println("Login successful");
		
		screenShot.captureScreenShot("TC59_2_DashboardScreen");
		RTTC059POM.clickButtonMenu();
		
		RTTC059POM.clickMarketing();
		screenShot.captureScreenShot("TC59_3_MarketingScreen");
		System.out.println("Marketing page displayed successfully");
				
		RTTC059POM.clickAffiliates();
		screenShot.captureScreenShot("TC59_4_AffiliatesScreen");
		System.out.println("Affiliates page displayed successfully");
		
		RTTC059POM.clickAddNewIcon();
		screenShot.captureScreenShot("TC59_5_AddNewIconScreen");
		System.out.println("AddNewIcon clicked successfully");
	
		RTTC059POM.sendFirstName("madhavim2");
		screenShot.captureScreenShot("TC59_6_FirstNameBoxScreen");
		System.out.println("FirstName entered successfully");
		
		RTTC059POM.sendLastName("mallapuram2");
		screenShot.captureScreenShot("TC59_7_LastNameBoxScreen");
		System.out.println("LastName entered successfully");
		
		RTTC059POM.sendEmail("mmadhavi2@gmail.com");
		screenShot.captureScreenShot("TC59_8_EmailBoxScreen");
		System.out.println("Email entered successfully");
		
		RTTC059POM.sendTelephone("9866999511");
		screenShot.captureScreenShot("TC59_9_TelephoneBoxScreen");
		System.out.println("Telephone entered successfully");
		
		RTTC059POM.sendPassword1("madhavi11");
		screenShot.captureScreenShot("TC59_10_Password1BoxScreen");
		System.out.println("Password entered successfully");
		
		RTTC059POM.sendConfirm("madhavi11");
		screenShot.captureScreenShot("TC59_11_ConfirmBoxScreen");
		System.out.println("Confirm entered successfully");
		
		RTTC059POM.sendAddress1("gachibowli");
		screenShot.captureScreenShot("TC59_12_Address1Screen");
		System.out.println("Address1 entered successfully");

		RTTC059POM.sendAddress2("hyderabad");
		screenShot.captureScreenShot("TC59_13_Address2Screen");
		System.out.println("Address2 entered successfully");

		RTTC059POM.sendCity("hyderabad");
		screenShot.captureScreenShot("TC59_14_CityScreen");
		System.out.println("City entered successfully");

		RTTC059POM.sendPostcode("500048");
		screenShot.captureScreenShot("TC59_15_PostcodeScreen");
		System.out.println("Postcode entered successfully");
		
		RTTC059POM.clickCountry();
		screenShot.captureScreenShot("TC59_16_CountryScreen");
		System.out.println("Country entered successfully");

		RTTC059POM.clickState();
		screenShot.captureScreenShot("TC59_17_StateScreen");
		System.out.println("State entered successfully");
				
		RTTC059POM.clickPaymentDetails();
		screenShot.captureScreenShot("TC59_18_PaymentDetailsScreen");
		System.out.println("Payment Details entered successfully");
		
		RTTC059POM.sendChequeName("test2");
		screenShot.captureScreenShot("TC59_19_ChequeNameScreen");
		System.out.println("ChequeName entered successfully");
		
		RTTC059POM.clickSaveIcon();
		screenShot.captureScreenShot("TC59_20_SavedScreen");
		System.out.println("Data saved Successfully");
		
	}
}
