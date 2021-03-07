package tt.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;


public class SetupDrivers {

		public static WebDriver driver;

		public static void setupDriver(){
			//System.setProperty("webdriver.chrome.driver", "c:/TTSoftware/chromdriver.exe");
			WebDriverManager.chromedriver().browserVersion("88.0.4324.150").setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--diable-notifications");
			options.addArguments("--start-maximized");
			driver = new ChromeDriver(options);
			driver.get("https://www.ebay.com/");
		}
		
		public static WebDriver getDriver(){
			return driver;
		}
		
		public static void tearDownDriver(){
			driver.quit();
		}

}
