package com.facebook.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.facebook.testbaselayer.Testbase;
import com.facebook.utility.DropdownHandling;

public class Signup extends Testbase {

	public Signup(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
		}
	
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	private WebElement firstname_textbox;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
    private WebElement surname_textbox;

    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[4]/span[1]/span[2]/label[1]")
    private WebElement gender_radiobutton;


    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[6]/div[1]/div[1]/input[1]")
    private WebElement emailaddress_textbox;

    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[8]/div[1]/div[1]/input[1]")
    private WebElement newpassword_textbox;

    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[11]/button[1]")
    private WebElement signup_button;
     
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/span[1]/span[1]/select[1]")
    private WebElement date_listbox;
    
    
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/span[1]/span[1]/select[2]")
    private WebElement month_listbox;
    
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/span[1]/span[1]/select[3]")
    private WebElement year_listbox; 
    
    
    public void enterfirstname(String firstname) {
    	firstname_textbox.sendKeys(firstname);
    }
    
    public void entersurname(String surname) {
    	surname_textbox.sendKeys(surname);
    }
    
    public void clickonmaleradiobutton() {
    	gender_radiobutton.click();
    
    }
    
    public void enteremailaddress(String emailaddress) {
    	emailaddress_textbox.sendKeys(emailaddress);
    	
    }
    
    public void enternewpassword(String password) {
    	newpassword_textbox.sendKeys(password);
    }
    
    public void clickonsignupbutton() {
    	signup_button.click();
    }
    
    public void selectdate() {
    	
    	DropdownHandling d = new DropdownHandling();
    	d.dropdownhandling(date_listbox,"5");
    	
    }
   public void selectmonth() {
    	
    	DropdownHandling d = new DropdownHandling();
    	d.dropdownhandling(month_listbox,"Aug");
    	
    }
    
   public void selectyear() {
   	
   	DropdownHandling d = new DropdownHandling();
   	d.dropdownhandling(year_listbox,"1995");
   	
   }
   
 
    
    
    
    
}
