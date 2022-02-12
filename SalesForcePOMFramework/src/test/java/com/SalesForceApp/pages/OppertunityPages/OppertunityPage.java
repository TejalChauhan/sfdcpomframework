package com.SalesForceApp.pages.OppertunityPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.SalesForceApp.Base.BasePage;

public class OppertunityPage extends BasePage{
	
	public  OppertunityPage(WebDriver driver)
	{
		super(driver);
		
	}
	
	@FindBy(xpath = "//select[@id='fcf']/option")
	List<WebElement> opertunitylist;
	
	@FindBy(xpath = "//a[normalize-space()='Opportunity Pipeline']")
	WebElement oppePipeline;
	@FindBy(xpath = "//a[normalize-space()='Stuck Opportunities']")
	WebElement stuckOpp;
	@FindBy(xpath = "//select[@id='quarter_q']")
	WebElement interval;
	@FindBy(xpath = "//select[@id='open']")
	WebElement include;
	@FindBy(xpath = "//input[@title='Run Report']")
	WebElement runReport;
	
	
	
	public boolean varifyOpertunityDD() {
		 String ExpectedList[]= {"All Opportunities","Closing Next Month","Closing This Month","My Opportunities","New Last Week","New This Week","Opportunity Pipeline","Private","Recently Viewed Opportunities","Won"};
	     boolean Actualflag = true;
	    
		 for(int i=0;i<ExpectedList.length;i++)
		 {
			 if(!(ExpectedList[i].equalsIgnoreCase(opertunitylist.get(i).getText())))
			 {
				 Actualflag=false;
			 }
		 }
		 return Actualflag;
	}
	
	public void clickOpprPipelineReport() {
		waituntilVisible(oppePipeline);
		clickElelement(oppePipeline);
	}
	public void clickStuckOppertunity() {
		waituntilVisible(stuckOpp);
		clickElelement(stuckOpp);
	}
	public void selectInterval() {
		waituntilVisible(interval);
		Select selectinterval = new Select(interval);
		selectinterval.selectByIndex(0);
	}
	public void selectInclude() {
		waituntilVisible(include);
		Select selectinclude = new Select(include);
		selectinclude.selectByIndex(0);
	}
	public void clickRunReport() {
		waituntilVisible(runReport);
		clickElelement(runReport);
	}
	

}
