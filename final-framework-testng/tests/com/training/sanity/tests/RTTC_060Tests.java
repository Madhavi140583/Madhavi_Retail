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
import com.training.pom.RTTC_060_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RTTC_060Tests {

	private WebDriver driver;
	private String baseUrladmin;
//	private LoginPOM loginPOM;
	private RTTC_060_POM RTTC060POM;
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
		RTTC060POM = new RTTC_060_POM(driver);
		baseUrladmin = properties.getProperty("baseURLadmin");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrladmin);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
//		driver.quit();
	}
	@Test
	public void validRetailLoginTest60() throws InterruptedException {
		screenShot.captureScreenShot("TC60_1_LoginScreen");
		RTTC060POM.sendUserName("admin");
		RTTC060POM.sendPassword("admin@123");
		RTTC060POM.clickLoginBtn(); 
		System.out.println("Login successful");
		
		screenShot.captureScreenShot("TC60_2_DashboardScreen");
		RTTC060POM.clickButtonMenu();
		
		RTTC060POM.clickMarketing();
		screenShot.captureScreenShot("TC60_3_MarketingScreen");
		System.out.println("Marketing page displayed successfully");
				
		RTTC060POM.clickMail();
		screenShot.captureScreenShot("TC60_4_MailScreen");
		System.out.println("Mail page displayed successfully");
		
		RTTC060POM.clickToListbox();
		screenShot.captureScreenShot("TC60_5_ToListboxScreen");
		System.out.println("ToListbox entered successfully");
	
		RTTC060POM.sendSubjectBox("Christmas wish");
		screenShot.captureScreenShot("TC60_6_SubjectBoxScreen");
		System.out.println("SubjectBox entered successfully");
		
		RTTC060POM.sendMessageTextbox("Christmas wish");
		screenShot.captureScreenShot("TC60_7_MessageTextBoxScreen");
		System.out.println("MessageTextBox entered successfully");
	
		RTTC060POM.clickMailIcon();
		Thread.sleep(5000);
		screenShot.captureScreenShot("TC60_8_MailSentScreen");
		System.out.println("MailSent page displayed successfully");
			
		RTTC060POM.clickToListbox1();
		screenShot.captureScreenShot("TC60_9_ToListbox1Screen");
		System.out.println("ToListbox1 entered successfully");
	
		RTTC060POM.sendSubjectBox1("All Affiliates");
		screenShot.captureScreenShot("TC60_10_SubjectBox1Screen");
		System.out.println("SubjectBox1 entered successfully");
		
		RTTC060POM.sendMessageTextbox1("Christmas wish");
		screenShot.captureScreenShot("TC60_11_MessageTextBox1Screen");
		System.out.println("MessageTextBox1 entered successfully");
	
		RTTC060POM.clickMailIcon1();
		screenShot.captureScreenShot("TC60_12_MailSentScreen1");
		System.out.println("MailSent1 page displayed successfully");
	
	}
}
