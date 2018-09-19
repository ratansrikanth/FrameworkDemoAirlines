package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import base.TestBase;

public class TC02_Flight_Book_NY_RDM extends TestBase{
	
	@Test
	public void bookFlight_NY_RDM_Select() throws InterruptedException {
		Thread.sleep(5000);
		click("select_NY_RDM_XPATH");
		Thread.sleep(5000);
		click("alert_01_XPATH");
		Thread.sleep(5000);
		click("continue_01_XPATH");
	}
	
	@Test(dependsOnMethods="bookFlight_NY_RDM_Select")
	public void bookFlight_NY_RDM_EnterDetails() throws InterruptedException {
		Thread.sleep(15000);
/*		WebElement name = driver.findElement(By.xpath(repo.getProperty("firstName_XPATH")));
		Actions action = new Actions(driver);
		action.
		action.moveToElement(name).sendKeys("John").build().perform();
		Thread.sleep(5000);*/
		
		
		
		send("firstName_XPATH","John");
		Thread.sleep(3000);
		send("lastName_XPATH","Perry");
		Thread.sleep(3000);
		select("DOB_XPATH");
		Thread.sleep(3000);
		send("DD_XPATH","15");
		Thread.sleep(3000);
		send("YYYY_XPATH","1975");
		Thread.sleep(3000);
		
	}
}
