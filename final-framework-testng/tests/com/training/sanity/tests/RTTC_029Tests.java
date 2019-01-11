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
import com.training.pom.RTTC_029_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RTTC_029Tests {

	private WebDriver driver;
	private String baseUrladmin;
//	private LoginPOM loginPOM;
	private RTTC_029_POM RTTC029POM;
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
		RTTC029POM = new RTTC_029_POM(driver);
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
	public void validRetailLoginTest4() {
		screenShot.captureScreenShot("TC29_1_LoginScreen");
		RTTC029POM.sendUserName("admin");
		RTTC029POM.sendPassword("admin@123");
		RTTC029POM.clickLoginBtn(); 
		System.out.println("Login page displayed Successfully");
		screenShot.captureScreenShot("TC29_2_DashboardScreen");
		System.out.println("Dashboard page displayed Successfully");
		RTTC029POM.clickLogoutBtn();
		screenShot.captureScreenShot("TC29_3_Logout screen");
		System.out.println("Loggedout page displayed Successfully");
	}
	
}
