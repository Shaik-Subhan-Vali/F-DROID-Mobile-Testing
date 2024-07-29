import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Native_apps.F_Droid_Capabilities;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class F_Droid_Automation extends F_Droid_Capabilities {
	
AndroidDriver<AndroidElement> driver ;
	
	@BeforeTest
	public void setup() throws MalformedURLException {
		driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void possible_actions() throws InterruptedException {
		
		driver.findElement(MobileBy.id("org.fdroid.fdroid:id/settings")).click();
		driver.findElement(MobileBy.id("org.fdroid.fdroid:id/switchWidget")).click();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}
	@Test
	public void batterysaver(){
		
		driver.openNotifications();
		driver.findElements(MobileBy.id("android:id/icon")).get(3).click();
		driver.findElement(MobileBy.id("com.android.systemui:id/fake_shadow")).click();
		
	
	}
	@Test
	public void switchingapps() {		
		
		driver.activateApp("com.google.android.apps.messaging");
		
		
		String exp = driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"You: hmmmmm...!\")")).getText();
		System.out.println(exp);
			
		driver.activateApp("org.fdroid.fdroid");
		
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
			
	}

}
