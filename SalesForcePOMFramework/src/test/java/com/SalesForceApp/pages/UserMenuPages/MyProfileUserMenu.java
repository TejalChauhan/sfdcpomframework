package com.SalesForceApp.pages.UserMenuPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.SalesForceApp.Base.BasePage;

public class MyProfileUserMenu extends BasePage {
	public  MyProfileUserMenu(WebDriver driver)
	{
		super(driver);
		
	}
	@FindBy(linkText = "My Profile") WebElement Myprofile;
	@FindBy(xpath = "//a[@class='contactInfoLaunch editLink']//img[@title='Edit Profile']")
	WebElement Editprofile;
	@FindBy(xpath = "//a[contains(text(),'About')]") WebElement About;
	@FindBy(xpath = "//input[@id='lastName']") WebElement lastname;
	@FindBy(xpath = "//input[@class='zen-btn zen-primaryBtn zen-pas']") WebElement saveall;
	@FindBy(xpath = "//span[@id='userNavLabel']") WebElement userAccount;
	@FindBy(xpath = "//span[@id='tailBreadcrumbNode']") WebElement userAccount1;
	@FindBy(xpath = "//span[contains(text(),'Post')][@class='publisherattachtext ']") WebElement post;
	@FindBy(xpath = "//body") WebElement posttext;
	@FindBy(xpath = "//input[@id='publishersharebutton']") WebElement sharebutton;
	@FindBy(xpath = "//span[contains(text(),'File')][@class='publisherattachtext ']") WebElement filelink;
	@FindBy(xpath = "//a[contains(text(),'Upload')]") WebElement upload;
	@FindBy(xpath = "//input[@id='chatterFile']") WebElement SelectFile;
	@FindBy(xpath = "//a[@id='uploadLink']") WebElement Addphoto;
	@FindBy(xpath = "//input[@id='j_id0:uploadFileForm:uploadInputFile']") WebElement BrowseFile;
	@FindBy(xpath = "j_id0:uploadFileForm:save") WebElement savebtn;
	@FindBy(xpath = "//input[@id='j_id0:j_id7:save']") WebElement cropsave;
	
	
	public void clickMyProfile() {
		waituntilVisible(Myprofile);
		clickElelement(Myprofile);
	}
	public void clickEditProfile() {
		waituntilVisible(Editprofile);
		clickElelement(Editprofile);
	}
    public void SwitchToFrameEditProfile() {
		
		SwitchToContactInfoFrame(About);
	}
	public void clickAbout() {
		waituntilVisible(About);
		mouseOver(About);
		clickElelement(About);
	}
	public void setLastname(String lname) {
		waituntilVisible(lastname);
		enterText(lastname, lname);
	}
	public void clickSaveAll() {
		waituntilVisible(saveall);
		clickSaveAll();
	}
	public boolean verifyLastnameUserAccount() {
		String Updatedusername = "Anu Abcd";
		waituntilVisible(userAccount);
		String userupdate = userAccount.getText();
		if(Updatedusername.equalsIgnoreCase(userupdate))
		{
			return true;
		}
		else
			return false;
	}
	public WebElement GetAbout() {
		return About;
	}
	public void clickPostlink() {
		waituntilVisible(post);
		clickElelement(post);
	}
	public void setPostText() {
		waituntilVisible(posttext);
		posttext.clear();
		posttext.sendKeys("Hello");
	}
	public void clickShareButton()
	{
		waituntilVisible(sharebutton);
		clickElelement(sharebutton);
	}
	public void clickfilelink()
	{
		waituntilVisible(filelink);
		clickElelement(filelink);
	}
	public void clickUploadButton() {
		waituntilVisible(upload);
		clickElelement(upload);
	}
	public void setSelectFile() {
		waituntilVisible(SelectFile);
		SelectFile.clear();
		SelectFile.sendKeys("/home/tejal/eclipse-workspace/SalesForceApp/src/test/resources/image1.jpeg");
	}
	public void clickAddPhoto() {
		waituntilVisible(Addphoto);
		mouseOver(Addphoto);
		clickElelement(Addphoto);
	}
	public void setBrowseFile() {
		waituntilVisible(BrowseFile);
		BrowseFile.clear();
		BrowseFile.sendKeys("/home/tejal/eclipse-workspace/SalesForceApp/src/test/resources/image2.jpeg");
	}
	public void clickSaveButton() {
		waituntilVisible(savebtn);
		clickElelement(savebtn);
	}
	public void clickCropphoto() {
		waituntilVisible(cropsave);
		clickElelement(cropsave);
		
	}
	public void switchtoBrowsePhotoframe() {
		
		SwitchToUploadphotoFrame(BrowseFile);
	}
	public void switchtoframepostText() {
		SwitchToframeByIndex(posttext);
	}

}
