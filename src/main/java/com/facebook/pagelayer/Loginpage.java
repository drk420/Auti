package com.facebook.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.facebook.testbaselayer.Testbase;

public class Loginpage extends Testbase {

	
	public Loginpage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
	 }
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[5]/a[1]")
	private WebElement createnewaccount;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement emailaddress_textbox;
	
	@FindBy(xpath="//input[@id='pass']")
	private WebElement password_textbox;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/button[1]")
	private WebElement login_button;
	
	
	
	public void clickoncreatenewaccountbutton() {
		createnewaccount.click();
	}
	
	public void enteremailaddress(String email) {
		emailaddress_textbox.sendKeys(email);
	}
	
	public void enterpassword(String password) {
		
		password_textbox.sendKeys(password);
	}
	
	public void clickonloginbutton() {
		
		login_button.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
