package com.SalesFoceApp.pages.LeadsPages;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.SalesForceApp.Base.BasePage;

public class LeadsPage extends BasePage {
	public LeadsPage(WebDriver driver)
	{
		super(driver);
		
	}
	
	@FindBy(xpath = "//select[@id='fcf']")
	WebElement Lead_DD;
	@FindBy(xpath = "//select[@id='fcf']/option")
	List<WebElement> Leadlist;
	@FindBy(xpath = "//input[@title='Go!']")
	WebElement Go_btn;
	@FindBy(xpath = "//td[@class='pbButton']/input[@class='btn']")
	WebElement new_btn;
	@FindBy(xpath = "//input[@id='name_lastlea2']")
	WebElement lastname;
	@FindBy(xpath = "//input[@id='lea3']")
	WebElement CompanyName;
	@FindBy(xpath = "//td[@id='topButtonRow']//input[@title='Save']")
	WebElement save;
	
	
	public void clickLeadDD() {
		waituntilVisible(Lead_DD);
		clickElelement(Lead_DD);
	}
	
	public boolean verifyLeadDropDownlist() {
		String ExpectedList[]= {"All Open Leads","My Unread Leads","Recently Viewed Leads","Today's Leads","View - Custom 1","View - Custom 2"};
		boolean Actualflag = true;
		
		for(int i=0;i<ExpectedList.length;i++)
		{
		   if(!(ExpectedList[i].equalsIgnoreCase(Leadlist.get(i).getText())))
			 {
				 Actualflag=false;
			 }
		}
		return Actualflag;
	}
	
	public void selectTodaysLead() {
		waituntilVisible(Lead_DD);
		Select selectLead = new Select(Lead_DD);
		selectLead.selectByVisibleText("Today's Leads");
	}
	public void clickGoButton() {
		waituntilVisible(Go_btn);
		clickElelement(Go_btn);
	}
	public void clickNewButton() {
		waituntilVisible(new_btn);
		clickElelement(new_btn);
	}
	public void setLastname(String lname) {
		waituntilVisible(lastname);
		enterText(lastname, lname);
	}
	public void setCompanyName(String cname) {
		waituntilVisible(CompanyName);
		clickElelement(CompanyName);
	}
	public void clickSaveButton() {
		waituntilVisible(save);
		clickElelement(save);
	}

}
