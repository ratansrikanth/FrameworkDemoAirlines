package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.TestBase;

public class TC01_Flight_OneWay extends TestBase{
	@Test
	public void flight_NY_RDM() throws InterruptedException {
		Thread.sleep(3000);
		click("oneWay_Radio_XPATH");
		send("from_XPATH","New York, NY, US (JFK - Kennedy)");
		keyType("Tab","from_XPATH");
		Thread.sleep(3000);
		send("to_XPATH","Redmond, OR, US (RDM)");
		keyType("Tab","to_XPATH");
		Thread.sleep(1000);
		send("departDate_XPATH","Oct 01, 2018");
		keyType("Tab","departDate_XPATH");
		Thread.sleep(3000);
		click("findFlight_XPATH");
		Thread.sleep(3000);
	}

}
