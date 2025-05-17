package commonFunctions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommonFunctions {
	public static Properties properties = null;
	public static WebDriver driver;

	public Properties loadPropertyFile() throws IOException {

		FileInputStream stream = new FileInputStream("config.properties");
		properties = new Properties();
		properties.load(stream);

		return properties;
	}

	@BeforeSuite
	public WebDriver launchBrowser() throws IOException {

		loadPropertyFile();
		String browser1 = properties.getProperty("browser");
		String url = properties.getProperty("url");
		if (browser1.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser1.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
		return driver;

	}

	
	  @AfterSuite 
	  public void tearDown() {
		  driver.quit();
		  }
	 
}
