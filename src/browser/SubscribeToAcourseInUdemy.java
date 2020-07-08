package browser;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class SubscribeToAcourseInUdemy {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "abc");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		//	cap.setCapability(MobileCapabilityType.AUTO_WEBVIEW, true);
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.udemy.android");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.udemy.android.SplashActivity");
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(MobileBy.id("com.udemy.android:id/browse_button")).click();
		driver.findElement(MobileBy.AccessibilityId("Search tab")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Search all courses\")")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Search all courses\")")).sendKeys("selenium");
		driver.hideKeyboard();
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Top searches\")")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Selenium WebDriver with Java -Basics to Advanced+Frameworks\")")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"ADD TO CART\")")).click();
		driver.findElement(MobileBy.id("android:id/button1")).click();
		

	}

}
