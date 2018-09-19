package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.TestBase;

public class TC03_Hotels_BookRoom extends TestBase{
	
	@Test
	public void bookHotel() throws InterruptedException {
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#bookHotelTab")).click();
		Thread.sleep(3000);
	}

}
