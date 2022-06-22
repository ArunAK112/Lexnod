package com.lexnod.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lexnod.GenericLib.BaseTest;

public class VendorsPage {
	
	@FindBy(xpath = "//input[@value='New Vendor']") private WebElement newVendorButton;
	
	
	public VendorsPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}


	public WebElement getNewVendorButton() {
		return newVendorButton;
	}
	
	public void clickNewVendorButton() {
		newVendorButton.click();
	}

}
