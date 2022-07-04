package com.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Report;
import com.base.BaseClass;
import com.utilities.driverUtils;

public class MyListeners extends BaseClass implements ITestListener{

	public void onTestStart(ITestResult result) {
		test=report.createTest(result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "test case pass with name as"+result.getName());
		
		
	}

	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "test case Failed with name as"+result.getName());
		String path = driverUtils.getScreenshot(result.getName());
		test.addScreenCaptureFromPath(path);
		
		
	}

	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, "test case skiped with name as"+result.getName());

		
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	public void onStart(ITestContext context) {
		
		
	}

	public void onFinish(ITestContext context) {
		
		
	}

}
