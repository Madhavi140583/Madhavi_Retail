package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.RTTC_030_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RTTC_030Tests {

	private WebDriver driver;
	private String baseUrl;
//	private LoginPOM loginPOM;
	private RTTC_030_POM RTTC030POM;
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
		RTTC030POM = new RTTC_030_POM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
	//	driver.quit();
	} 
	
	@Test
	public void validRetailLoginTest5() throws InterruptedException {
	/*	screenShot.captureScreenShot("TC30_1_LoginIconScreen");
		RTTC030POM.clickLoginIcon();
		RTTC030POM.clickLoginLink();
		screenShot.captureScreenShot("TC30_2_LoginScreen");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); */
		
		screenShot.captureScreenShot("TC30_1_LoginScreen");
		RTTC030POM.sendEmailAddress("mmadhavi@in.ibm.com");
		RTTC030POM.sendPassword("madhavi@123");
		RTTC030POM.clickLoginBtn(); 
		System.out.println("Login Successful");
		Thread.sleep(5000);
		screenShot.captureScreenShot("TC30_2_MyAccountScreen");
		RTTC030POM.clickUserIcon();
		System.out.println("MyAccount page displayed successfully");
		Thread.sleep(5000);
		RTTC030POM.clickLogoutLink();
		screenShot.captureScreenShot("TC30_3_LogoutScreen");
		System.out.println("Loggedout Successfully");
	}
}

