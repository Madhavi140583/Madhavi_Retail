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
import org.testng.annotations.DataProvider;

import com.training.dataproviders.LoginDataProviders;
import com.training.dataproviders.RTTC087DataProviders;
import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.RTTC_087_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RTTC_087Tests {

	private WebDriver driver;
	private String baseUrladmin;
//	private LoginPOM loginPOM;
	private RTTC_087_POM RTTC087POM;
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
		RTTC087POM = new RTTC_087_POM(driver);
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
	@Test(dataProvider = "excel-inputs", dataProviderClass = RTTC087DataProviders.class)
	public void validRetailLoginTest87(String customergroupname, String description,String customergroupdd, String firstname,String lastname,String email,String telephone,String password,String confirmpassword ) throws InterruptedException {
		screenShot.captureScreenShot("TC87_1_LoginScreen");
		RTTC087POM.sendUserName("admin");
		RTTC087POM.sendPassword("admin@123");
		RTTC087POM.clickLoginBtn(); 
		System.out.println("Login successful");
		
		screenShot.captureScreenShot("TC87_2_DashboardScreen");
		RTTC087POM.clickButtonMenu();
		
		RTTC087POM.clickCustomers();
		screenShot.captureScreenShot("TC87_3_CustomersScreen");
		System.out.println("Customers page displayed successfully");
				
		RTTC087POM.clickCustomerGroups();
		screenShot.captureScreenShot("TC87_4_CustomerGroupsScreen");
		System.out.println("CustomerGroups page displayed successfully");
		
		RTTC087POM.clickAddNewIcon();
		screenShot.captureScreenShot("TC87_5_AddNewScreen");
		System.out.println("AddNewIcon clicked successfully");
	
		RTTC087POM.sendCustomerGroupNameTextBox(customergroupname);
		screenShot.captureScreenShot("TC87_6_CustomerGroupName"+customergroupname);
		System.out.println("CustomerGroupName entered successfully");
		
		RTTC087POM.sendDescriptionTextBox(description);
		screenShot.captureScreenShot("TC87_7_Description"+description);
		System.out.println("DescriptionTextBox entered successfully");
	
		RTTC087POM.clickNewCustomerRadioBtn();
		screenShot.captureScreenShot("TC87_8_NewCustomerRadioBtnScreen");
		System.out.println("NewCustomerRadioBtn selected successfully");
			
		RTTC087POM.clickSaveIcon();
		screenShot.captureScreenShot("TC87_9_SaveScreen");
		System.out.println("SaveIcon clicked successfully");
	
		RTTC087POM.clickDashboard();
		screenShot.captureScreenShot("TC87_10_DashboardScreen");
		System.out.println("Dashboard page displayed successfully");
		
		RTTC087POM.clickCustomers1();
		screenShot.captureScreenShot("TC87_11_Customers1Screen");
		System.out.println("Customers1 page displayed successfully");
		
		RTTC087POM.clickCustomers2();
		screenShot.captureScreenShot("TC87_12_Customers1Screen");
		System.out.println("Customers2 page displayed successfully");
		
		RTTC087POM.clickAddNewIcon1();
		screenShot.captureScreenShot("TC87_13_AddNew1Screen");
		System.out.println("AddNewIcon clicked successfully");
		
	/*	RTTC087POM.clickCustomerGroupdropdown();
		screenShot.captureScreenShot("TC87_14_CustomerGroupNamedropdownScreen");
		System.out.println("CustomerGroupName selected successfully"); */
		
		RTTC087POM.clickCustomerGroupdropdown(customergroupdd);
		screenShot.captureScreenShot("TC87_14_CustomerGroupNamedropdownScreen"+customergroupdd);
		System.out.println("CustomerGroupName selected successfully"); 
		
		RTTC087POM.sendFirstName(firstname);
		screenShot.captureScreenShot("TC87_15_Firstname"+firstname);
		System.out.println("FirstName entered successfully");
		
		RTTC087POM.sendLastNameBox(lastname);
		screenShot.captureScreenShot("TC87_16_LastName"+lastname);
		System.out.println("LastName entered successfully");
		
		RTTC087POM.sendEmailBox(email);
		screenShot.captureScreenShot("TC87_17_Email"+email);
		System.out.println("Email entered successfully");
		
		RTTC087POM.sendTelephoneBox(telephone);
		screenShot.captureScreenShot("TC87_18_Telephone"+telephone);
		System.out.println("Telephone entered successfully");
		
		RTTC087POM.sendPasswordBox(password);
		screenShot.captureScreenShot("TC87_19_Password"+password);
		System.out.println("Password entered successfully");
		
		RTTC087POM.sendConfirmBox(confirmpassword);
		screenShot.captureScreenShot("TC87_20_ConfirmPassword"+confirmpassword);
		System.out.println("Confirmpassword entered successfully");
		
		RTTC087POM.clickSaveIcon1();
		screenShot.captureScreenShot("TC87_21_Customers Data Saved Screen");
		System.out.println("Data saved successfully");
		
	}
}
