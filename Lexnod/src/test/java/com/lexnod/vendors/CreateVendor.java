package com.lexnod.vendors;

import org.testng.annotations.Test;

import com.lexnod.GenericLib.BaseTest;
import com.lexnod.GenericLib.FileLib;
import com.lexnod.GenericLib.WebDriverCommonLib;
import com.lexnod.login.ValidLogin;
import com.lexnod.pages.CreateVendorPage;
import com.lexnod.pages.HomePage;
import com.lexnod.pages.VendorsPage;

public class CreateVendor extends BaseTest {
	
	@Test
	
	public void createVendorTest() throws Throwable
	{
		//login and verify
		ValidLogin vl= new ValidLogin();
		vl.validLoginTest();
		//click on vendor
		HomePage hp = new HomePage();
		hp.clickVendorsTab();
		
		//click on new vendor and verify
		VendorsPage vp = new VendorsPage();
		vp.clickNewVendorButton();
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		FileLib flib = new FileLib();
		wlib.verify(wlib.getPageTitle(),flib.readPropertyData(PROP_PATH, "createVendorTitle") , 
				"Create Vendor Page");
		
		//enter the data in the field
		CreateVendorPage cvp = new CreateVendorPage();
		cvp.createVendor(flib.readExcelData(EXCEL_PATH, "createVendors",1, 1),
				flib.readExcelData(EXCEL_PATH, "createVendors", 2, 1),
				flib.readExcelData(EXCEL_PATH, "createVendors", 0, 1));
		
		//verify
		wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "vendorDetailsTitle"), 
				"Vendors Detail Page");
		
		
		
		
		
		
		
	}
	

}
