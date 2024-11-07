package com.facebook.testlayer;

import org.testng.annotations.Test;

import com.facebook.pagelayer.Loginpage;
import com.facebook.pagelayer.Signup;
import com.facebook.testbaselayer.Testbase;

public class SignUpTest extends Testbase{
	
	@Test
	public void verifysignuptest() throws InterruptedException {
		
		
		Loginpage loginpage = new Loginpage(driver);
		loginpage.clickoncreatenewaccountbutton();
		Signup signup = new Signup(driver);
		
		signup.enterfirstname("Dnyanu");
		Thread.sleep(5000);
		signup.entersurname("patil");
		Thread.sleep(5000);
		signup.selectdate();
		Thread.sleep(5000);
		
		signup.selectmonth();
		Thread.sleep(5000);
		signup.selectyear();
		Thread.sleep(5000);
		signup.clickonmaleradiobutton();
		Thread.sleep(5000);
		signup.enteremailaddress("kinikardnyaneshwar29@gmail.com");
		Thread.sleep(5000);
		signup.enternewpassword("dnyaneshwar@123");
		Thread.sleep(5000);
		signup.clickonsignupbutton();
		
	}
	}
