package com.facebook.testbaselayer;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Testbase {
	
	public static WebDriver driver;
	public static Logger logger;
	
	
	@BeforeTest
	public void start() {
		logger = Logger.getLogger("Facebook framework");
		PropertyConfigurator.configure("log4j.Properties");
		logger.info("framework started");
		
		}
	
	@AfterTest
	public void stop() {
		logger.info("framework stopped");
	}
	
	@BeforeMethod
	public void setup() {
		
		String br = "Chrome";
		
		if(br.equalsIgnoreCase("chrome")) {
			
			driver= new ChromeDriver();
		}
		else if(br.equalsIgnoreCase("firefoxdriver")) {
			
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("provide correct browser");
		}
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@AfterMethod
	public void tear() {
		//driver.quit();
		
	}
	

}
