package testcases;

import org.testng.annotations.Test;

import base.TestBase;

public class TC02_SelectFlight_NY_RDM extends TestBase{
	
	@Test
	public void selectFlight_NY_RDM() throws InterruptedException {
		Thread.sleep(5000);
		click("select_NY_RDM_XPATH");
	}

}
