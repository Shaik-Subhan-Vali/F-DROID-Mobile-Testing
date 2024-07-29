package Native_apps;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class F_Droid_Capabilities {
	

        public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
        	
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "My_Emulator");
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "org.fdroid.fdroid");
        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "org.fdroid.fdroid.nearby.SwapWorkflowActivity");
        dc.setCapability(MobileCapabilityType.NO_RESET, true);

        URL url = new URL("http://0.0.0.0:4723/wd/hub");

        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(url, dc);

        return driver;
    }

}
