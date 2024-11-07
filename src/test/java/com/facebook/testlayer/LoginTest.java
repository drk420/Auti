package com.facebook.testlayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.facebook.pagelayer.Loginpage;
import com.facebook.testbaselayer.Testbase;

public class LoginTest extends Testbase {

	@Test
	public void verifylogintest() throws InterruptedException {
		String Expected_Result="https://www.facebook.com/?sk=welcome";
		Loginpage loginpage = new Loginpage (driver);
		loginpage.enteremailaddress("kinikardnyaneshwar29@gmail.com");
	
		loginpage.enterpassword("dnyaneshwar@123");
		loginpage.clickonloginbutton();
		Thread.sleep(15000);
		String Actual_Result=driver.getCurrentUrl();
		System.out.println(Actual_Result);
	
		Assert.assertEquals(Actual_Result, Expected_Result);
	}
	}
