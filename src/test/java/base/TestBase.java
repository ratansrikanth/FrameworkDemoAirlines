package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	
	public static WebDriver driver;
	public static FileInputStream fis;
	public static Properties repo = new Properties();
	public static Properties config = new Properties();
	
	
	@BeforeSuite
	public void setUp() throws IOException {
		
		fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\config.properties");
		config.load(fis);
		
		if(config.getProperty("browser").equals("chrome")) {
			driver = new ChromeDriver();
		}else if(config.getProperty("browser").equals("firefox")) {
			driver = new FirefoxDriver();
		}else if(config.getProperty("browser").equals("ie")) {
			driver = new InternetExplorerDriver();
		}
		
		driver.get(config.getProperty("url"));
		driver.manage().window().maximize();
		
	}
	
	@AfterSuite
	public void tearDown() {
		if(driver != null) {
			driver.quit();
		}
	}


}
