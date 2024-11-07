package com.facebook.utility;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.facebook.testbaselayer.Testbase;

public class DropdownHandling extends Testbase {

	
	public void dropdownhandling(WebElement element,String text) {
		
		Select c = new Select(element);
		c.selectByVisibleText(text);
		
	List<WebElement>options	= c.getOptions();
	int count = options.size();
	System.out.println(count);
	
	ArrayList<WebElement>b = new ArrayList(options);
	
	for(WebElement v:b) {
		
		String tex = v.getText();
		
		System.out.println(tex);
		
		}
	}
	}
