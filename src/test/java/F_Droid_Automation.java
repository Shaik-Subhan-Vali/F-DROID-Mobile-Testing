import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Native_apps.F_Droid_Capabilities;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class F_Droid_Automation extends F_Droid_Capabilities {
	
AndroidDriver<AndroidElement> driver ;
	
	@BeforeTest
	public void setup() throws MalformedURLException {
		driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test(enabled = false)
	public void preferencesettings() throws InterruptedException {
		
		driver.findElement(MobileBy.AccessibilityId("Preference")).click();
		
	}

}
