package com.SalesForce.utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class GenerateExtentReport {
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest logger;
	private static GenerateExtentReport ob;
	private GenerateExtentReport() {
		
	}
	public static GenerateExtentReport getInstance(){
		if(ob==null) {
			ob = new GenerateExtentReport();
		}
		return ob;
	}
	
	static String testcaseName=null;
	
	public void startExtentReport() {
		htmlReporter = new ExtentHtmlReporter(Constants.GENERATE_REPORT_PATH);
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Host Name", "Salesforce");
		extent.setSystemInfo("Environment", "Automation Testing");
		extent.setSystemInfo("User Name", "anu@archtek");
		
		htmlReporter.config().setDocumentTitle("Test Execution Report");
		htmlReporter.config().setReportName("regression test report");
		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		htmlReporter.config().setTheme(Theme.STANDARD);
	}
	
	public void startNewTestReport(String testName){
		testcaseName= testName;
		logger = extent.createTest(testcaseName);
	}
	public void logTestInfo(String message) {
		logger.log(Status.INFO,message);
	}
    public void logTestPass() {
    	logger.log(Status.PASS, MarkupHelper.createLabel(testcaseName+"is passed", ExtentColor.GREEN));
	}
    public void logTestFail() {
    	logger.log(Status.FAIL, MarkupHelper.createLabel(testcaseName+"is not pass", ExtentColor.RED));
	}
    public void endExtentReport() {
    	extent.flush();
    }



}
