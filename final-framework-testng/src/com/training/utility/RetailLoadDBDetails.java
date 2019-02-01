package com.training.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.training.bean.RetailLoginBean;

public class RetailLoadDBDetails {
	public static RetailLoginBean getDBDetails() {

		try {
			Properties properties = new Properties();
			FileInputStream inStream = new FileInputStream("./resources/db.properties");
			properties.load(inStream);

			RetailLoginBean dbBean = new RetailLoginBean(); 
			
			dbBean.setUrl(properties.getProperty("url"));
			dbBean.setDriver(properties.getProperty("driver"));
			// getting the user name if not present (by default - root ) 
			dbBean.setUserName(properties.getProperty("username", "root"));
			dbBean.setPassword(properties.getProperty("password"));
			
			return dbBean; 
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}


}
