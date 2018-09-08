package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import base.TestBase;

public class CalendarDemo extends TestBase {

	@Test
	public void test01() throws InterruptedException {
		
		System.out.println(Integer.parseInt(config.getProperty("timeout")));
		
/*		click("oneWay_Radio_XPATH");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='DepartDate']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='DepartDate']")).sendKeys("Oct 20, 2018");
		Thread.sleep(3000);*/
		
/*		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='DepartDate']")).sendKeys(Keys.RIGHT);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='DepartDate']")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);*/
	}
		


}
