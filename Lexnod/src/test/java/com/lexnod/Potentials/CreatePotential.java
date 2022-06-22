package com.lexnod.Potentials;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.lexnod.GenericLib.BaseTest;
import com.lexnod.GenericLib.FileLib;
import com.lexnod.GenericLib.WebDriverCommonLib;
import com.lexnod.pages.CreatePotentialPage;
import com.lexnod.pages.PotentialsPage;

@Listeners(com.lexnod.GenericLib.MyListeners.class)
//open the browser, enter the url and verify
public class CreatePotential extends BaseTest{
	
	@Test
	
	public void createPotentialTest() throws Throwable {
		
		//enter valid login details and verify	
		//click on potentials tab and verify
		VerifyPotentialsTab vp = new VerifyPotentialsTab();
		vp.verifyPotentialstabTest();
		
		//click on new potential button and verify
		PotentialsPage pp = new PotentialsPage();
		pp.newPotentialButton();
		
		FileLib flib = new FileLib();
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		wlib.verify(wlib.getPageTitle(),
				flib.readPropertyData(PROP_PATH, "createPotentialTitle"),
				"Create Potential Page");
		//Enter valid details in potential information
		CreatePotentialPage cp = new CreatePotentialPage();
		cp.potentialNameTextBox(flib.readExcelData(EXCEL_PATH,"createPotential", 0, 1));
		cp.amountTextBox(flib.readExcelData(EXCEL_PATH, "createPotential", 1, 1));
		cp.closingDateTextBox(flib.readExcelData(EXCEL_PATH, "createPotential", 2, 1));
		cp.accountNameTextBox(flib.readExcelData(EXCEL_PATH, "createPotential", 3, 1));
		cp.stageDropDown(flib.readExcelData(EXCEL_PATH, "createPotential", 4, 1));
		cp.typeDropDown(flib.readExcelData(EXCEL_PATH, "createPotential", 5, 1));
		cp.nextStepTextBox(flib.readExcelData(EXCEL_PATH, "createPotential", 6, 1));
		cp.leadSourceDropDown(flib.readExcelData(EXCEL_PATH, "createPotential", 7, 1));
		cp.campaignSourceTextBox(flib.readExcelData(EXCEL_PATH, "createPotential", 8, 1));
		cp.descriptionTextBox(flib.readExcelData(EXCEL_PATH, "createPotential", 9, 1));
		cp.saveButton();
		
		//Verification
		wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "potentialDetailTitle"), "Potential Detail Page");
		
		
		
		
		
		
	}

}
