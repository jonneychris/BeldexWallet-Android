package utiles;

	import  io.appium.java_client.android.AndroidDriver;
	import io.appium.java_client.android.options.UiAutomator2Options;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

	import java.net.URL;
	import java.time.Duration;
	public class baseClass {

		
		public AndroidDriver driver;

	    @BeforeClass
	    public void setUp() throws Exception {
	        UiAutomator2Options options = new UiAutomator2Options();


			options.setCapability("automationName", "UiAutomator2");			 
			 options.setCapability("deviceName", "moto g05");
			 options.setCapability("platformName","Android");
			 options.setCapability("platformVersion","15");
			 options.setCapability("udid", "ZY32L96832");
			 options.setCapability("appium:ignoreHiddenApiPolicyError", true);
			 options.setCapability("appium:appium:fullReset",true);
			 options.setCapability("appium:autoGrantPermissions", true);
			options.setApp(System.getProperty("user.dir")+"\\resources\\beldex-flutter-wallet-22-05-2026-mainnet-apk.apk");



	        driver = new AndroidDriver(
	            new URL("http://127.0.0.1:4723"),options
	        );

	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    }

	    @AfterClass
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }


	}


