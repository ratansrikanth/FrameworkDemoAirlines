package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

		fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\config.properties");
		config.load(fis);

		fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\repo.properties");
		repo.load(fis);

		if (config.getProperty("browser").equals("chrome")) {
			driver = new ChromeDriver();
		} else if (config.getProperty("browser").equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (config.getProperty("browser").equals("ie")) {
			driver = new InternetExplorerDriver();
		}

		driver.get(config.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("timeout")), TimeUnit.SECONDS);
	}

	@AfterSuite
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

	public static void send(String locator,String value) {
		if(locator.endsWith("_XPATH")) {
			driver.findElement(By.xpath(repo.getProperty(locator))).sendKeys(value);;
		}else if(locator.endsWith("_CSS")){
			driver.findElement(By.cssSelector(repo.getProperty(locator))).sendKeys(value);
		}else if(locator.endsWith("_ID")) {
			driver.findElement(By.id(repo.getProperty(locator))).sendKeys(value);
		}
	}
	
	public static void click(String locator) {
		if(locator.endsWith("_XPATH")) {
			driver.findElement(By.xpath(repo.getProperty(locator))).click();
		}else if(locator.endsWith("_CSS")) {
			driver.findElement(By.cssSelector(repo.getProperty(locator))).click();
		}else if(locator.endsWith("_ID")) {
			driver.findElement(By.id(repo.getProperty(locator))).click();
		}
	}

}
