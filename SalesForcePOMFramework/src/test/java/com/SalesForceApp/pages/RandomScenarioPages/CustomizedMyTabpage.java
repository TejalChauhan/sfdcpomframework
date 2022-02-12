package com.SalesForceApp.pages.RandomScenarioPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.SalesForceApp.Base.BasePage;

public class CustomizedMyTabpage extends BasePage {
	public  CustomizedMyTabpage(WebDriver driver)
	{
		super(driver);
		
	}
	@FindBy(xpath = "//img[@class='allTabsArrow']") WebElement plusAllTabs;
	@FindBy(xpath = "//input[@title='Customize My Tabs']") WebElement CustomisedTab;
	@FindBy(xpath = "//select[@id='duel_select_1']") WebElement selectedTab;
	@FindBy(xpath = "//a//img[@title='Remove']") WebElement Removebtn;
	@FindBy(xpath = "//select[@id='duel_select_1']/option") List<WebElement> SelectedAllTab;
	@FindBy(xpath = "//input[@title='Save']") WebElement Savebtn_customisedTab;
	
	public void clickPlusAllTab() {
		waituntilVisible(plusAllTabs);
		mouseOver(plusAllTabs);
		clickElelement(plusAllTabs);
	}
	public void clickCustomisedTab() {
		waituntilVisible(CustomisedTab);
		clickElelement(CustomisedTab);
	}
	public void selectedTab() {
		Select removeTab = new Select(selectedTab);
		removeTab.selectByValue("Order");
	}
	public void clickRemoveButton() {
		waituntilVisible(Removebtn);
		clickElelement(Removebtn);
	}
	public void clickSaveCustomisedTab() {
		waituntilVisible(Savebtn_customisedTab);
		clickElelement(Savebtn_customisedTab);
	}
	public boolean verifyRemovedTab()
	{
		String removed = "Order";
		Boolean removeflag = true;
		for(WebElement allTab : SelectedAllTab)
		{
			String tab = allTab.getText();
			if(removed.equalsIgnoreCase(tab))
			{
				removeflag = false;
			}
		}
		if(removeflag)
		{
			System.out.println("Selected Tab is Successfully Removed from Menu");
		}
		else
		{
			System.out.println("Selected Tab is Not Removed from Menu");
		}
		return removeflag;
	}

}
