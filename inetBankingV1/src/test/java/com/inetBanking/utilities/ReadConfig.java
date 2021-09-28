package com.inetBanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	public ReadConfig() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	File src=new File("./Configuration/config.properties");
	
	try {
		Thread.sleep(1000);
		FileInputStream fis= new FileInputStream(src);
		pro=new Properties();
		pro.load(fis);
		
	}
	catch(Exception e) {
		System.out.println("Exception is "+e.getMessage());
	}
	}
	public String getchromepath() {
		String chromepath=pro.getProperty("chromepath");
		return chromepath;
	}
	public String getbaseURL() {
		String baseURL=pro.getProperty("baseURL");
		return baseURL;
	}
	public String getusername() {
		String username=pro.getProperty("username");
		return username;
	}
	public String getpassword() {
		String password=pro.getProperty("password");
		return password;
	}
}
