package com.facebook.utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.facebook.testbaselayer.Testbase;

public class ListenerSetup extends Testbase implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
	logger.info("TestCase is Started"+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger.info("TestCase is Completed"+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
    logger.info("TestCase is Failed"+result.getName());
    Takesscreenshot.getscreenshot(result.getName());
    
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		logger.info("TestCase is Skipped"+result.getName());
	}


}
