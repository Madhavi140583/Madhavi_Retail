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
import com.training.pom.RTTC_058_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RTTC_058Tests {

	private WebDriver driver;
	private String baseUrladmin;
//	private LoginPOM loginPOM;
	private RTTC_058_POM RTTC058POM;
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
		RTTC058POM = new RTTC_058_POM(driver);
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
	public void validRetailLoginTest58() {
		screenShot.captureScreenShot("TC58_1_LoginScreen");
		RTTC058POM.sendUserName("admin");
		RTTC058POM.sendPassword("admin@123");
		RTTC058POM.clickLoginBtn(); 
		System.out.println("Login successful");
		
		screenShot.captureScreenShot("TC58_2_DashboardScreen");
		RTTC058POM.clickButtonMenu();
		
		RTTC058POM.clickMarketing();
		screenShot.captureScreenShot("TC58_3_MarketingScreen");
		System.out.println("Marketing page displayed successfully");
				
		RTTC058POM.clickCoupons();
		screenShot.captureScreenShot("TC58_4_CouponsScreen");
		System.out.println("Coupons page displayed successfully");
		
		RTTC058POM.clickAddnewIcon();
		screenShot.captureScreenShot("TC58_5_AddNewScreen");
		System.out.println("AddNew Icon clicked successfully");
	
		RTTC058POM.sendCouponName("Christmas");
		screenShot.captureScreenShot("TC58_6_CouponNameScreen");
		System.out.println("CouponName entered successfully");
		
		RTTC058POM.sendCode("cse2");
		screenShot.captureScreenShot("TC58_7_CodeScreen");
		System.out.println("Code entered successfully");
	
		RTTC058POM.sendDiscountBox("DiscountBox");
		screenShot.captureScreenShot("TC58_8_DiscountBoxScreen");
		System.out.println("Discount entered successfully");
	
		RTTC058POM.sendProductsBox("Lorem ipsum dolor sit amet");
		screenShot.captureScreenShot("TC58_9_ProductsBoxScreen");
		System.out.println("Product entered successfully");
	
		RTTC058POM.sendStartDate("2019-01-21");
		screenShot.captureScreenShot("TC58_10_StartDateEnteredScreen");
		System.out.println("StartDate entered Successfully");
		
		RTTC058POM.sendEndDate("2019-01-22");
		screenShot.captureScreenShot("TC58_11_EndDateEnteredScreen");
		System.out.println("EndDate entered Successfully");
			
		RTTC058POM.clickSaveIcon();
		screenShot.captureScreenShot("TC58_12_SavedScreen");
		System.out.println("Saved Data page displayed Successfully");
		
	}
}
