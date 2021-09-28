package com.inetBanking.TestCases;

import org.apache.log4j.Logger;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.page.Object.LoginPage;

public class TC_LoginTest_001 extends BaseClass {

	
	@Test
	public void loginTest() {
		
		driver.get(baseURL);
		System.out.println("1");
		logger.info("URL is opened");

		LoginPage lp= new LoginPage(driver);
		lp.setUserName(username);
		logger.info("entered user name");
		lp.setPassword(password);
		logger.info("password entered");
		lp.clickSubmit();
		if(driver.getTitle().equalsIgnoreCase("vtiger CRM 5 - Commercial Open Source CRM")) {
			
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	
}
