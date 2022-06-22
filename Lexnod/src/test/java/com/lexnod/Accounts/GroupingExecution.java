package com.lexnod.Accounts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupingExecution {
	
	@Test(groups = "smoke")
	public void smoke1() {
		Reporter.log("smoke1",true);
	}
	
	@Test(groups = "smoke")
	public void smoke2() {
		Reporter.log("smoke2",true);
	}
	
	@Test(groups = "smoke")
	public void smoke3() {
		Reporter.log("smoke3",true);
	}
	
	@Test(groups = "smoke")
	public void smoke4() {
		Reporter.log("smoke4",true);
	}
	
	@Test(groups = "functional")
	public void ft1() {
		Reporter.log("ft1",true);
	}

}
