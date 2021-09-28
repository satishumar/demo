package com.inetBanking.TestCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.inetBanking.utilities.ReadConfig;

public class BaseClass {
	ReadConfig readconfig= new ReadConfig();
	 
	public String baseURL=readconfig.getbaseURL();
	public String username=readconfig.getusername();
	public String password=readconfig.getpassword();
	public String chromepath=readconfig.getchromepath();
	public static WebDriver driver;
	public static Logger logger;
	
	//you can use paremeter Annotation for luunch diffent Browser.
	@BeforeClass
	public void setup() {
	System.setProperty("webdriver.chrome.driver","D://TestNGtutorial/inetBankingV1/Drivers/chromedriver.exe");
	driver=new ChromeDriver();
	logger=Logger.getLogger("sbanking");
	PropertyConfigurator.configure("log4j.Properties");
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
