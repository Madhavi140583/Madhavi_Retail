package com.training.dao;
 
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.training.bean.RetailLoginBean;
import com.training.connection.RetailGetConnection;
import com.training.utility.RetailLoadDBDetails;

// Data Access Object 
public class RetailDAO {
	
	Properties properties; 
	
	public RetailDAO() {
		 try {
			properties = new Properties();
			FileInputStream inStream = new FileInputStream("./resources/sql.properties");
			properties.load(inStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<RetailLoginBean> getLogins(){
		String sql = properties.getProperty("get.logins"); 
		
		RetailGetConnection gc  = new RetailGetConnection(); 
		List<RetailLoginBean> list = null;
		try {
			gc.ps1 = RetailGetConnection.getMySqlConnection(RetailLoadDBDetails.getDBDetails()).prepareStatement(sql); 
			list = new ArrayList<RetailLoginBean>(); 
			
			gc.rs1 = gc.ps1.executeQuery(); 
			
			while(gc.rs1.next()) {
			
				RetailLoginBean temp = new RetailLoginBean(); 
				temp.setUserName(gc.rs1.getString(1));
				temp.setPassword(gc.rs1.getString(2));

				list.add(temp); 
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list; 
	}
	
	public static void main(String[] args) {
		new RetailDAO().getLogins().forEach(System.out :: println);
	}
	
	
}
