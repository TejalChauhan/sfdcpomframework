package com.SalesForceApp.pages.UserMenuPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.SalesForceApp.Base.BasePage;

public class UserMenuPage extends BasePage{
	
	public UserMenuPage(WebDriver driver)
	{
		super(driver);
		
	}
	
	@FindBy(xpath = "//div[@id='userNav-menuItems']//a") List<WebElement> Actuallist;
	@FindBy(id="userNavLabel") WebElement user_DashboardAccount;
	@FindBy(id="userNav-arrow") WebElement arrowbutton;
	
	
	@FindBy(linkText = "Developer Console") WebElement DeveloperConsole;
	
	public boolean verifyUserMenuDropDown() {
		String ExpectedList[]= {"My Profile","My Settings","Developer Console","Switch to Lightning Experience","Logout"};
	     boolean Actualflag = true;
	     
		 for(int i=0;i<ExpectedList.length;i++)
		 {
			 if(!(ExpectedList[i].equalsIgnoreCase(Actuallist.get(i).getText())))
			 {
				 Actualflag=false;
			 }
		 }
		 return Actualflag;
	}
	public void clickUserDashboardAccount() {
		waituntilVisible(user_DashboardAccount);
		mouseOver(user_DashboardAccount);
		clickElelement(arrowbutton);
	}
	
	
	public void clickDeveloperConsole() {
		waituntilVisible(DeveloperConsole);
		clickElelement(DeveloperConsole);
	}

}
