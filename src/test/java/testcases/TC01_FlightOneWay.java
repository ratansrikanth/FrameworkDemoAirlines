package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.TestBase;

public class TC01_FlightOneWay extends TestBase{
	@Test
	public void flight_NY_RDM() throws InterruptedException {
		click("oneWay_Radio_XPATH");
		send("from_XPATH","New York JFK");
		Thread.sleep(3000);
		send("to_XPATH","Redmond, OR, US (RDM)");
		Thread.sleep(1000);
		send("departDate_XPATH","Oct 01, 2018");
		Thread.sleep(3000);
		click("findFlight_XPATH");
		Thread.sleep(3000);
	}

}
